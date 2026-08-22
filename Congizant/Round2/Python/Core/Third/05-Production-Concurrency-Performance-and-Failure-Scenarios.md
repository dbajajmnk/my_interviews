# PY-03 / File 05 — Production Concurrency, Performance & Failure Scenarios

**Priority:** P0  
**Suggested Time:** 55 minutes  
**GOJ Mapping:** M10 + selected M20 / M22

---

# 1. Objective

Integrate PY-03 into real backend/AI architecture:

- concurrency model selection;
- rate limiting;
- backpressure;
- connection pools;
- timeouts;
- retries;
- cancellation;
- idempotency;
- bulkheads;
- queue-based processing;
- observability;
- performance debugging.

---

# 2. 5W+H

## What?

Production concurrency is the controlled management of simultaneous work while protecting correctness and system capacity.

## Why?

Unbounded concurrency causes:

- overload;
- memory growth;
- queue buildup;
- rate-limit errors;
- cascading failures.

## Where?

- APIs;
- AI services;
- web crawlers;
- data pipelines;
- background jobs;
- microservices.

## When?

Any time a service performs independent work concurrently.

## How?

Choose model + bound capacity + define failure semantics + observe.

---

# 3. Real-Life Analogy

A restaurant does not accept unlimited customers just because the kitchen has many cooks.

It manages:

- tables;
- waiting queue;
- kitchen capacity;
- supplier limits.

Concurrency is capacity management.

---

# 4. Visualization

```text
Incoming Requests
      │
      ▼
Admission / Rate Limit
      │
      ▼
Concurrency Limit
      │
      ├── I/O async/thread
      ├── CPU process
      └── long job queue
      │
      ▼
Downstream Systems
      │
      ▼
Timeout / Retry / Fallback / Metrics
```

---

# 5. Mind Map

```text
Production Concurrency
│
├── Workload Type
│   ├── I/O
│   ├── CPU
│   └── Long-running
├── Capacity
│   ├── Semaphore
│   ├── Pool
│   ├── Queue
│   └── Rate Limit
├── Failure
│   ├── Timeout
│   ├── Retry
│   ├── Circuit Breaker
│   └── Cancellation
└── Observability
    ├── latency
    ├── saturation
    └── errors
```

---

# 6. Core Concepts

## 6.1 Workload Classification

### I/O-bound

Examples:

- HTTP;
- DB;
- file/network.

Possible tools:

- asyncio;
- threads.

### CPU-bound

Examples:

- pure-Python transformations;
- compute-heavy parsing.

Possible:

- process pool;
- native/vectorized library;
- external compute worker.

### Long-running Work

Examples:

- 2-minute AI document generation;
- batch ingestion.

Possible:

- background queue;
- job worker;
- polling/webhook/websocket for result.

Do not keep every HTTP request open unnecessarily.

---

## 6.2 Timeout

Every remote dependency needs a timeout policy.

Distinguish:

- connection timeout;
- read timeout;
- per-operation timeout;
- total request deadline.

---

## 6.3 Retry

Retry only when:

- failure is transient;
- operation is safe/idempotent or protected;
- backoff/jitter exists;
- retry count is bounded.

Retrying overload can worsen an outage.

---

## 6.4 Idempotency

If an operation may be retried, ask:

> Can repeating it create duplicate side effects?

Examples:

- payment;
- email;
- order creation.

Use idempotency keys or business-level deduplication where appropriate.

---

## 6.5 Bulkhead

Isolate resource pools so one dependency/workload cannot consume everything.

Example:

```text
LLM pool
Search pool
Metadata pool
```

rather than one shared unlimited pool.

---

## 6.6 Queue-Based Work

Use a queue when:

- work is long-running;
- client does not need immediate completion;
- retries need persistence;
- load smoothing matters.

Architecture:

```text
API
 ↓
Job Queue
 ↓
Worker
 ↓
Result Store
```

---

## 6.7 Connection Pools

Concurrency above connection-pool capacity creates waiting/saturation.

Coordinate:

- request concurrency;
- HTTP pool;
- DB pool;
- model quota.

---

## 6.8 Backpressure

Bounded capacity is a feature.

Ways:

- queue max size;
- semaphore;
- rate limiter;
- reject/429;
- load shedding;
- batching.

---

# 7. Engineering Depth

## 7.1 AI Inference Scenario

LLM takes 10 seconds.

At 1,000 concurrent incoming requests:

naively spawning 1,000 model calls may:

- hit provider quota;
- exhaust sockets;
- consume memory;
- create huge tail latency;
- trigger retries and cascading failure.

Architect design needs controlled concurrency.

---

## 7.2 Async API vs Background Job

Keep synchronous request when:

- expected latency is acceptable;
- client needs immediate answer;
- infrastructure supports it.

Use background job when:

- processing is long;
- retriable;
- resource intensive;
- asynchronous UX is acceptable.

---

## 7.3 Observability

Monitor:

- throughput;
- p50/p95/p99 latency;
- active concurrency;
- queue depth;
- pool utilization;
- timeout rate;
- retry rate;
- error rate;
- event-loop lag;
- CPU;
- memory.

---

# 8. Implementation / Code

## Concurrency Guard

```python
import asyncio

limit = asyncio.Semaphore(20)

async def call_model(prompt):
    async with limit:
        return await model_client.generate(prompt)
```

Architect question:

> Why 20?

Answer should come from:

- provider quota;
- latency;
- connection pool;
- load testing;
- service SLO.

---

# 9. Hands-On Practice

## Practice 1

Choose model:

> 100 blocking vendor SDK calls.

Potential:

- bounded thread pool.

## Practice 2

Choose model:

> pure-Python image transformation.

Potential:

- process pool / native library.

## Practice 3

Choose model:

> 90-second report generation.

Potential:

- job queue/background worker.

---

# 10. Google Interview Drill

## Problem — Design an AI API for 5,000 Concurrent Users

LLM provider supports max 200 concurrent requests.

### Clarify

- target SLO?
- can requests wait?
- streaming?
- request priority?
- provider quota?
- retry behavior?

### First Approach

Let every request call provider immediately.

Fails at capacity.

### Improve

```text
API
 ↓
Admission / Rate Limit
 ↓
Concurrency Semaphore = provider-safe limit
 ↓
LLM Provider
```

If wait becomes too long:

```text
API
 ↓
Job Queue
 ↓
Workers with bounded model concurrency
```

### Test

- burst traffic;
- provider 429;
- 30-second latency;
- provider outage;
- queue saturation.

### Trade-Off

Queuing improves protection but increases user wait.

### Follow-Up

- priority queue?
- multi-provider fallback?
- fairness?
- cancellation?
- cost controls?
- tenant quotas?
- observability?

---

# 11. Common Mistakes

1. Unbounded concurrency.
2. Retry without backoff.
3. Retry non-idempotent operations.
4. Ignoring pool sizes.
5. No total deadline.
6. No backpressure.
7. Using async for CPU work.
8. Keeping long HTTP calls open unnecessarily.
9. No cancellation.
10. No saturation metrics.

---

# 12. Best Practices

- classify workload first;
- bound concurrency;
- use deadlines;
- retry selectively;
- make retryable side effects idempotent;
- use queues for long work;
- respect downstream quotas;
- observe saturation;
- load test.

---

# 13. Interview Questions

1. How do you choose threads vs processes vs asyncio?
2. What is backpressure?
3. How do you limit concurrency?
4. Timeout vs retry?
5. What is idempotency?
6. Why can retries cause outage amplification?
7. When use queue?
8. What is bulkhead?
9. What metrics indicate saturation?
10. How would you protect an LLM provider?

---

# 14. Google-Level Follow-Ups

1. How would you choose semaphore size?
2. What if p99 latency doubles?
3. What if provider sends 429?
4. What if queue depth grows indefinitely?
5. How do you shed load?
6. How do you prioritize premium customers?
7. How do you cancel abandoned requests?
8. How do you support provider fallback?
9. How do you enforce per-tenant quotas?
10. How do you load-test this?

---

# 15. Quick Revision

```text
Classify workload:
I/O → async/thread
CPU → process/native
Long-running → queue

Production:
bound concurrency
timeouts
backpressure
selective retry
idempotency
bulkhead
observe saturation
respect downstream quota
```

---

# 16. Readiness Gate

- [ ] Choose concurrency model correctly.
- [ ] Explain timeout/deadline.
- [ ] Explain retry/idempotency.
- [ ] Explain backpressure.
- [ ] Explain queue architecture.
- [ ] Explain pool saturation.
- [ ] Design 5,000-user AI API.
- [ ] Define metrics.

**Gate:** READY / REPAIR

---

# 17. References

- Python `asyncio`
- Python `concurrent.futures`
- Python threading/multiprocessing docs
