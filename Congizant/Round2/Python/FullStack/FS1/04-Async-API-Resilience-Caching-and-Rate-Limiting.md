# FS-01 / File 04 — Async APIs, Resilience, Caching & Rate Limiting

**Priority:** P0  
**Suggested Time:** 75 minutes  
**GOJ Mapping:** M19 + M20

---

# 1. Objective

Master:

- sync vs async backend;
- timeout;
- retry;
- backoff/jitter;
- circuit breaker;
- bulkhead;
- caching;
- cache invalidation;
- rate limiting;
- load shedding;
- resilient downstream integration.

---

# 2. 5W+H

## What?

Resilience controls how APIs behave when dependencies are slow, failing, or overloaded.

## Why?

Distributed systems fail partially.

## Where?

DBs, third-party APIs, AI providers, queues, caches.

## When?

Every remote integration.

## How?

Bound time and work; isolate failures; cache carefully; observe.

---

# 3. Real-Life Analogy

A city road system needs:

- traffic lights;
- alternate routes;
- speed limits;
- road closures.

Without controls, one accident can freeze the city.

---

# 4. Visualization

```text
API
 ↓
Timeout
 ↓
Concurrency Limit
 ↓
Downstream Call
 ↓
Retry? (selective)
 ↓
Circuit Breaker
 ↓
Fallback / Error
```

Optional cache in front depending semantics.

---

# 5. Mind Map

```text
Resilience
│
├── Async
├── Timeout
├── Retry
├── Backoff
├── Circuit Breaker
├── Bulkhead
├── Cache
├── Rate Limit
└── Load Shedding
```

---

# 6. Core Concepts

## 6.1 Async API

Async helps overlap non-blocking I/O.

It does not make CPU work faster.

Avoid blocking SDK calls directly in event loop.

---

## 6.2 Timeout

Every downstream call needs a bounded wait.

Define:

- connect;
- read;
- operation;
- total request deadline.

---

## 6.3 Retry

Retry only transient failures.

Use:

- bounded attempts;
- exponential backoff;
- jitter;
- idempotency awareness.

---

## 6.4 Circuit Breaker

When dependency repeatedly fails:

```text
Closed → failures → Open → cooldown → Half-open → recover/return Open
```

Avoid hammering unhealthy dependency.

---

## 6.5 Bulkhead

Separate resources so one dependency cannot exhaust everything.

---

## 6.6 Cache

Common pattern: cache-aside.

```text
read cache
  ├── hit → return
  └── miss → DB → cache → return
```

---

## 6.7 Cache Invalidation

Strategies:

- TTL;
- explicit invalidation;
- event-driven invalidation;
- versioned keys.

No universal perfect strategy.

---

## 6.8 Cache Stampede

Many concurrent misses for same hot key all call source.

Mitigation:

- single-flight/lock;
- request coalescing;
- stale-while-revalidate;
- jittered TTL.

---

## 6.9 Rate Limiting

Controls request rate.

Algorithms awareness:

- fixed window;
- sliding window;
- token bucket;
- leaky bucket.

Do not need to derive all implementations unless asked.

---

# 7. Engineering Depth

## 7.1 Retry Storm

When system is overloaded, retries add more load.

Retry requires:

- backoff;
- jitter;
- limits;
- circuit breaker;
- budget.

---

## 7.2 Caching AI Responses

Consider:

- prompt sensitivity;
- model version;
- tenant/user context;
- privacy;
- freshness;
- deterministic key;
- semantic cache trade-offs.

---

# 8. Implementation / Code

Pseudo:

```python
async def get_profile(user_id):
    cached = await cache.get(user_id)
    if cached:
        return cached

    async with timeout(2):
        profile = await user_client.fetch(user_id)

    await cache.set(user_id, profile, ttl=60)
    return profile
```

---

# 9. Hands-On Practice

1. Define retry policy for GET to third-party service.
2. Explain why payment POST retry is dangerous without idempotency.
3. Design cache TTL for user profile.
4. Explain rate-limit response 429.

---

# 10. Google Interview Drill

## Problem — LLM Provider Is Slow and Sometimes Returns 429

### Clarify

- hard quota?
- latency SLO?
- fallback provider?
- streaming?
- retries allowed?
- cost?

### First Approach

Retry immediately.

Bad: can amplify overload.

### Improve

```text
timeout
→ bounded concurrency
→ 429-aware backoff/jitter
→ circuit breaker
→ fallback if policy allows
→ metrics
```

### Edge Cases

- provider charged request but client timed out;
- partial stream;
- fallback produces different quality;
- user cancellation.

### Follow-Up

- per-tenant quotas;
- cache;
- cost budget;
- provider routing;
- queue for long jobs.

---

# 11. Common Mistakes

1. No timeout.
2. Retry every exception.
3. Retry immediately.
4. Cache everything.
5. No invalidation plan.
6. Unbounded cache.
7. Rate limit only at code level without distributed coordination when needed.
8. Blocking SDK inside async handler.
9. Circuit breaker without metrics.

---

# 12. Best Practices

- timeout all remote calls;
- retry selectively;
- add jitter;
- protect idempotency;
- bound concurrency;
- cache by semantics;
- monitor hit ratio and staleness;
- rate-limit by tenant/user/IP as requirement dictates.

---

# 13. Interview Questions

1. Sync vs async API?
2. Timeout vs retry?
3. Circuit breaker?
4. Bulkhead?
5. Cache-aside?
6. Cache invalidation?
7. Cache stampede?
8. Rate limiting?
9. Retry storm?
10. How handle LLM 429?

---

# 14. Google-Level Follow-Ups

1. distributed rate limiter?
2. Redis outage?
3. stale cache allowed?
4. fallback provider?
5. total deadline?
6. partial streaming failure?
7. observability?
8. load shedding?

---

# 15. Quick Revision

```text
Remote call:
timeout
→ bounded concurrency
→ selective retry
→ backoff/jitter
→ breaker
→ fallback

Cache:
key
TTL
invalidation
stampede
capacity

Rate limit protects capacity
```

---

# 16. Readiness Gate

- [ ] Async vs sync.
- [ ] Timeout.
- [ ] Retry policy.
- [ ] Circuit breaker.
- [ ] Cache-aside.
- [ ] Invalidation.
- [ ] Stampede.
- [ ] Rate limit.
- [ ] LLM drill.

**Gate:** READY / REPAIR

---

# 17. References

- Python asyncio docs
- HTTP retry/rate-limit semantics
- resilience pattern references
