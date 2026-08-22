# ARCH-03 / File 04 — Reliability, Resilience, Backpressure & Graceful Degradation

**Priority:** P0  
**Suggested Time:** 75 minutes  
**GOJ Mapping:** M20 + M22

---

# 1. Objective

Master:

- timeout;
- retry;
- backoff/jitter;
- idempotency;
- circuit breaker;
- bulkhead;
- rate limit;
- backpressure;
- load shedding;
- queue limits;
- graceful degradation;
- dependency isolation.

---

# 2. 5W+H

## What?

Resilience prevents one failure from becoming a system-wide failure.

## Why?

Distributed systems fail partially and often under load.

## Where?

Every remote dependency and shared resource.

## When?

Always in production systems.

## How?

Bound wait/work, isolate failure, retry selectively, degrade safely.

---

# 3. Real-Life Analogy

Electrical circuits use breakers so one fault does not burn the entire building.

---

# 4. Visualization

```text
Request
 ↓
Rate Limit
 ↓
Concurrency Limit
 ↓
Service
 ↓ timeout
Dependency
 ↓
retry? / breaker?
 ↓
fallback / fail
```

---

# 5. Mind Map

```text
Resilience
│
├── Timeout
├── Retry
├── Idempotency
├── Circuit Breaker
├── Bulkhead
├── Rate Limit
├── Backpressure
├── Load Shedding
└── Degradation
```

---

# 6. Core Concepts

## 6.1 Timeout

Bound every remote call.

Without timeout, resources can remain occupied indefinitely.

---

## 6.2 Retry

Retry only transient failures.

Use:

- exponential backoff;
- jitter;
- max attempts;
- total deadline;
- idempotency.

---

## 6.3 Idempotency

State-changing retriable operation needs duplicate-safe design.

Examples:

- payment;
- order creation;
- message handling.

---

## 6.4 Circuit Breaker

Stops calls to unhealthy dependency.

Protects:

- caller resources;
- dependency recovery.

---

## 6.5 Bulkhead

Separate resource pools/concurrency by dependency/workload.

One slow integration should not consume every worker.

---

## 6.6 Backpressure

If downstream capacity < incoming rate:

- slow producers;
- queue with limit;
- reject;
- shed;
- prioritize.

---

## 6.7 Load Shedding

Drop/reject low-priority work before collapse.

Better:

```text
429 / 503 quickly
```

than letting every request timeout after 60 seconds.

---

## 6.8 Graceful Degradation

Examples:

- recommendation unavailable → show base catalog;
- AI synthesis unavailable → show search results;
- analytics unavailable → queue/drop safely.

Not appropriate for:

- payment success;
- authorization;
- ledger correctness.

---

# 7. Engineering Depth

## 7.1 Retry Storm

If overloaded system gets retries from every layer, load increases exactly when capacity is lowest.

Use:

- one retry owner;
- retry budgets;
- circuit breakers.

---

## 7.2 Queue Backlog

Queue can hide overload temporarily.

Monitor:

- depth;
- age;
- consumption rate;
- poison messages.

Unbounded queue is not resilience.

---

## 7.3 AI Degradation

If LLM fails:

Possible:

- fallback model;
- queue;
- retrieval-only result;
- human escalation;
- feature disable.

Choose based on user/business risk.

---

# 8. Implementation / Design

Dependency policy:

```text
timeout: 2 sec
retries: 2 transient only
backoff + jitter
breaker after threshold
max concurrent calls
fallback if safe
```

Exact values derive from SLO.

---

# 9. Hands-On Practice

For checkout:

- payment provider timeout → controlled failure/reconciliation.
- recommendations down → degrade.
- email down → async retry.
- inventory stale → block/verify source of truth.

---

# 10. Google Interview Drill

## Problem — LLM Provider Starts Returning 429

Traffic spike.

### Clarify

- provider quota?
- concurrent calls?
- user priority?
- retries?
- fallback?
- batch jobs competing with chat?

### First Approach

Retry every 429 immediately.

Creates retry storm.

### Improve

- per-tenant rate limit;
- global concurrency cap;
- exponential backoff + jitter;
- separate batch/interactive priority;
- fallback where evaluated;
- queue background work;
- fast failure/degradation if saturated.

### Follow-Up

Measure:

- 429 rate;
- queue age;
- active generations;
- retry count;
- fallback quality.

---

# 11. Common Mistakes

1. No timeout.
2. Retry every failure.
3. No idempotency.
4. Breaker without metrics.
5. Shared pool for all dependencies.
6. Infinite queue.
7. Degrading critical correctness.
8. Batch traffic starves interactive traffic.

---

# 12. Best Practices

- bound all remote work;
- retry selectively;
- idempotent side effects;
- isolate dependencies;
- apply backpressure;
- prioritize traffic;
- degrade only safe features;
- monitor backlog and breaker state.

---

# 13. Interview Questions

1. Timeout?
2. Retry?
3. Why jitter?
4. Idempotency?
5. Circuit breaker?
6. Bulkhead?
7. Backpressure?
8. Load shedding?
9. Graceful degradation?
10. How handle LLM 429?

---

# 14. Google-Level Follow-Ups

1. fallback also fails?
2. queue full?
3. user cancellation?
4. payment retry uncertainty?
5. regional provider issue?
6. one tenant noisy?
7. circuit breaker threshold?
8. priority inversion?

---

# 15. Quick Revision

```text
Bound wait
Retry transient only
Idempotency before retries
Breaker protects dependency
Bulkhead isolates
Backpressure prevents overload
Load shed before collapse
Degrade only non-critical features
```

---

# 16. Readiness Gate

- [ ] Timeout/retry.
- [ ] Idempotency.
- [ ] Breaker.
- [ ] Bulkhead.
- [ ] Backpressure.
- [ ] Degradation.
- [ ] LLM-429 drill.

**Gate:** READY / REPAIR

---

# 17. References

- Resilience engineering references
- Distributed-systems failure patterns
