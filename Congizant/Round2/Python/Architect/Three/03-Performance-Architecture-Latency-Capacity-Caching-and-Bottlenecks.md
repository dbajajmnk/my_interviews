# ARCH-03 / File 03 — Performance Architecture, Latency, Capacity, Caching & Bottlenecks

**Priority:** P0  
**Suggested Time:** 80 minutes  
**GOJ Mapping:** M20 Performance + M21 Architecture

---

# 1. Objective

Master:

- latency vs throughput;
- p50/p95/p99;
- capacity;
- concurrency;
- saturation;
- CPU vs I/O;
- browser/API/DB performance;
- caching;
- connection pools;
- queue depth;
- AI provider latency;
- profiling and bottleneck isolation.

---

# 2. 5W+H

## What?

Performance architecture ensures the system meets latency/throughput goals under expected load.

## Why?

A slow system may be caused by CPU, network, DB, pool waits, locks, cache misses, queueing, or AI provider limits.

## Where?

Client → edge → backend → DB/cache → external services → model provider.

## When?

Before scale and whenever SLO is violated.

## How?

Measure → decompose → identify bottleneck → improve → remeasure.

---

# 3. Real-Life Analogy

Traffic delay can come from:

- narrow road;
- toll booth;
- accident;
- bad signal timing.

Adding more cars lanes somewhere else does not always help.

---

# 4. Visualization

```text
Request Latency
├── Browser / Network
├── Gateway
├── App Queue
├── Python Handler
├── DB Pool Wait
├── Query
├── External API
├── LLM TTFT/Generation
└── Serialization
```

---

# 5. Mind Map

```text
Performance
│
├── Latency
├── Throughput
├── Concurrency
├── Saturation
├── CPU
├── I/O
├── DB Pool
├── Cache
├── Queue
└── AI Provider
```

---

# 6. Core Concepts

## 6.1 Latency vs Throughput

Latency:

> time per operation.

Throughput:

> operations per time.

Optimizing one can hurt the other.

---

## 6.2 Percentiles

p50 = median.

p95/p99 reveal tail experience.

Average can hide severe outliers.

---

## 6.3 Capacity

Capacity is constrained by bottleneck resource.

Examples:

- CPU cores;
- DB connections;
- provider quota;
- queue consumer rate;
- memory.

---

## 6.4 Concurrency

Approximate:

```text
concurrency ≈ RPS × average service time
```

Longer service time increases concurrent work.

---

## 6.5 Queueing

When utilization approaches capacity, queueing latency can grow sharply.

Architect rule:

> running a shared dependency at permanent 100% utilization is dangerous.

---

## 6.6 CPU vs I/O

CPU-bound:

- compression;
- image processing;
- heavy computation.

I/O-bound:

- DB;
- HTTP;
- storage;
- LLM provider.

Async helps overlapping I/O, not accelerating CPU calculation.

---

## 6.7 DB Connection Pool

A common hidden bottleneck.

Symptoms:

```text
query = 100 ms
connection wait = 5 sec
```

More app pods can worsen it.

---

## 6.8 Cache

Use where stale tolerance and hit rate justify.

Measure:

- hit ratio;
- miss latency;
- memory;
- evictions;
- stampedes.

---

## 6.9 Frontend Performance

Architect awareness:

- bundle size;
- lazy loading;
- CDN;
- image optimization;
- API waterfall;
- excessive re-rendering;
- large lists.

---

## 6.10 AI Performance

Track separately:

- retrieval latency;
- reranking;
- provider queue;
- time to first token;
- generation duration;
- token count.

---

# 7. Engineering Depth

## 7.1 Bottleneck Flow

```text
SLO violated
→ trace request
→ identify dominant stage
→ correlate with resource saturation
→ test one change
→ load test
→ compare before/after
```

---

## 7.2 Little's Law Awareness

Conceptually:

```text
concurrency ≈ throughput × time-in-system
```

Useful for reasoning about queue/pool sizes.

No need for advanced queueing math unless asked.

---

## 7.3 Optimize Architecture Before Micro-Optimization

Examples:

- eliminate N+1;
- remove sync long call;
- cache expensive read;
- add index;
- reduce context tokens;

before obsessing over tiny code-level gains.

---

# 8. Implementation / Design

Latency budget example:

```text
Target p95 = 1.0 sec

Gateway       50 ms
App           100 ms
DB            200 ms
External API  300 ms
Network/etc   150 ms
Buffer        200 ms
```

AI chat may use a different SLO such as time to first token.

---

# 9. Hands-On Practice

Scenario:

```text
API p95 = 4 sec
CPU = 30%
DB query = 150 ms
DB pool wait = 2.5 sec
```

Primary target:

> pool/transaction/concurrency pressure, not CPU scaling.

---

# 10. Google Interview Drill

## Problem — Python API Becomes Slow After Horizontal Scaling

Before:

```text
5 pods, p95 500 ms
```

After:

```text
20 pods, p95 2.5 sec
```

DB CPU high, connection limit reached.

### Clarify

- pool size per pod?
- query volume?
- transaction duration?
- retries?
- cache?

### Root Cause

Total potential DB connections increased:

```text
pods × pool-size
```

DB is now saturated.

### Improve

- right-size pool;
- reduce connection hold time;
- query optimize;
- add cache/read scale where valid;
- cap request concurrency;
- scale DB only if justified.

### Follow-Up

Horizontal scaling can move bottleneck downstream.

---

# 11. Common Mistakes

1. Average latency only.
2. Add servers without bottleneck evidence.
3. Huge DB pool.
4. Async assumed automatically faster.
5. Cache without hit/freshness metrics.
6. Frontend ignored.
7. AI TTFT ignored.
8. Optimize micro-code before architecture.

---

# 12. Best Practices

- measure percentiles;
- trace latency;
- track saturation;
- right-size pools;
- cache intentionally;
- load test realistic workload;
- compare before/after;
- scale bottleneck only.

---

# 13. Interview Questions

1. Latency vs throughput?
2. p95/p99?
3. What is saturation?
4. How estimate concurrency?
5. How diagnose slow API?
6. DB pool exhaustion?
7. CPU vs I/O?
8. What cache metrics?
9. Frontend performance?
10. AI latency breakdown?

---

# 14. Google-Level Follow-Ups

1. one slow tenant?
2. GC/memory?
3. cache outage?
4. provider queue?
5. queue backlog?
6. multi-region latency?
7. database lock waits?
8. p99 only degraded?

---

# 15. Quick Revision

```text
Measure first
p95/p99 matter
Concurrency grows with service time
Find saturated resource
DB pool wait is common
Horizontal scale may move bottleneck
Optimize architecture before micro-code
```

---

# 16. Readiness Gate

- [ ] Latency/throughput.
- [ ] Percentiles.
- [ ] Capacity/concurrency.
- [ ] Pool bottleneck.
- [ ] Cache/performance.
- [ ] AI/frontend awareness.
- [ ] Horizontal-scale drill.

**Gate:** READY / REPAIR

---

# 17. References

- Performance engineering and distributed systems references
