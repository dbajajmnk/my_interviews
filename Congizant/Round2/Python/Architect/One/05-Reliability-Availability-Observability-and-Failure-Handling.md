# ARCH-01 / File 05 — Reliability, Availability, Observability & Failure Handling

**Priority:** P0  
**Suggested Time:** 75 minutes  
**GOJ Mapping:** M20 + M22

---

# 1. Objective

Master:

- availability;
- redundancy;
- health checks;
- timeout;
- retry;
- backoff/jitter;
- circuit breaker;
- bulkhead;
- backpressure;
- graceful degradation;
- disaster recovery awareness;
- logs/metrics/traces;
- SLO/error-budget thinking.

---

# 2. 5W+H

## What?

Reliability architecture ensures the system continues to provide acceptable service under component failures and load.

## Why?

Distributed systems fail partially.

## Where?

Every network boundary and shared dependency.

## When?

Always in production design.

## How?

Bound failures, isolate resources, degrade gracefully, observe, and recover.

---

# 3. Real-Life Analogy

A ship is divided into compartments so one leak does not sink everything.

That is fault isolation.

---

# 4. Visualization

```text
Client
 ↓
Gateway
 ↓
Service
 ├── timeout
 ├── retry
 ├── circuit breaker
 └── bulkhead
 ↓
Dependency

Observability:
logs + metrics + traces
```

---

# 5. Mind Map

```text
Reliability
│
├── Availability
├── Redundancy
├── Timeout
├── Retry
├── Circuit Breaker
├── Bulkhead
├── Backpressure
├── Degradation
├── DR
└── Observability
```

---

# 6. Core Concepts

## 6.1 Availability

Percentage/time proportion system serves requests successfully according to definition.

Higher availability requires more:

- redundancy;
- automation;
- operational investment.

---

## 6.2 Timeout

Every remote call needs bounded wait.

Without timeout:

> thread/task/resource can wait indefinitely.

Use total request deadline where useful.

---

## 6.3 Retry

Retry only transient errors.

Need:

- bounded attempts;
- exponential backoff;
- jitter;
- idempotency;
- retry budget.

Retries multiply load.

---

## 6.4 Circuit Breaker

Stops repeated calls to unhealthy dependency.

States:

```text
Closed
→ Open
→ Half-open
→ Closed/Open
```

---

## 6.5 Bulkhead

Separate resource pools.

Example:

```text
Payment dependency pool
Search dependency pool
```

Search overload should not consume every worker needed for payment.

---

## 6.6 Backpressure

When consumers cannot keep up:

- bound queue;
- reject/load shed;
- slow producers;
- rate limit;
- batch.

Unbounded buffering is delayed failure.

---

## 6.7 Graceful Degradation

If recommendation service fails:

- show products without recommendations.

If payment fails:

- cannot pretend checkout succeeded.

Degradation depends on business criticality.

---

## 6.8 Redundancy

Multiple instances/zones reduce single-node failure.

But shared DB/network can remain single point.

---

## 6.9 Disaster Recovery

Know:

- RPO = acceptable data loss window.
- RTO = acceptable recovery time.

Backup must be restorable.

---

## 6.10 Observability

Logs:

- events.

Metrics:

- trends.

Traces:

- request path.

Need request/trace IDs.

---

# 7. Engineering Depth

## 7.1 Retry Amplification

3 services each retry 3 times can create huge multiplication.

Prefer coordinated retry ownership.

---

## 7.2 Error Budget

If SLO = 99.9%, allowable failure budget is finite.

Error budgets help balance reliability vs release speed.

Awareness level is enough unless interviewer deep-dives.

---

## 7.3 Tail Latency

p99 matters in distributed calls because one slow dependency can dominate.

Use:

- timeout;
- hedging only cautiously;
- parallelism;
- caching;

based on evidence.

---

# 8. Implementation / Design

Dependency policy:

```text
timeout = 2 sec
retry = max 2 on transient failures
backoff + jitter
circuit breaker
metrics
```

Exact values come from SLO and dependency behavior.

---

# 9. Hands-On Practice

For checkout:

Classify:

- recommendation failure → degrade.
- payment failure → block completion.
- analytics failure → async/drop/retry based policy.
- email failure → async retry.

---

# 10. Google Interview Drill

## Problem — Downstream Service Causes Cascading Failure

Symptoms:

- downstream latency jumps;
- calling service threads/tasks pile up;
- retries rise;
- whole system slows.

### Clarify

- timeout?
- connection pool?
- retry policy?
- traffic?
- dependency critical?

### First Approach

Increase thread pool.

Can worsen dependency overload.

### Improve

```text
shorter bounded timeout
+ retry budget
+ circuit breaker
+ bulkhead
+ concurrency limit
+ graceful degradation
```

### Follow-Up

How prove improvement?

Measure:

- active requests;
- dependency latency;
- timeout rate;
- queue depth;
- error rate;
- p95/p99.

---

# 11. Common Mistakes

1. No timeout.
2. Retry every failure.
3. Retry storm.
4. Giant shared pool.
5. Unbounded queue.
6. Graceful degradation for critical invariant.
7. Backup without restore test.
8. Observability added after incident.

---

# 12. Best Practices

- bound every remote wait;
- retry selectively;
- isolate dependencies;
- apply backpressure;
- degrade non-critical features;
- test recovery;
- instrument before production;
- define SLOs.

---

# 13. Interview Questions

1. Availability?
2. Timeout vs retry?
3. Circuit breaker?
4. Bulkhead?
5. Backpressure?
6. Graceful degradation?
7. RPO/RTO?
8. Logs vs metrics vs traces?
9. Error budget?
10. How stop cascading failure?

---

# 14. Google-Level Follow-Ups

1. multi-zone failure?
2. DB failover?
3. regional outage?
4. retry ownership?
5. partial dependency outage?
6. queue backlog?
7. network partition?
8. dependency 429?

---

# 15. Quick Revision

```text
Failures are expected
Timeout every remote call
Retry selectively with budget
Breaker stops hammering
Bulkhead isolates
Backpressure bounds overload
Degrade only non-critical features
Observe logs + metrics + traces
RPO/RTO define DR expectations
```

---

# 16. Readiness Gate

- [ ] Timeout.
- [ ] Retry.
- [ ] Breaker.
- [ ] Bulkhead.
- [ ] Backpressure.
- [ ] Degradation.
- [ ] Observability/DR.
- [ ] Cascading-failure drill.

**Gate:** READY / REPAIR

---

# 17. References

- Reliability engineering and distributed systems references
