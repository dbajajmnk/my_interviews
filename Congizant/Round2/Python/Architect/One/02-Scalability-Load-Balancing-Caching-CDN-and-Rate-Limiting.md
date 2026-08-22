# ARCH-01 / File 02 — Scalability, Load Balancing, Caching, CDN & Rate Limiting

**Priority:** P0  
**Suggested Time:** 75 minutes  
**GOJ Mapping:** M20 + M21 + M22

---

# 1. Objective

Master:

- vertical vs horizontal scaling;
- stateless services;
- load balancing;
- health/readiness;
- caching;
- cache-aside;
- TTL/invalidation;
- CDN;
- rate limiting;
- hot keys;
- backpressure awareness.

---

# 2. 5W+H

## What?

Scalability is the ability to handle increased workload without unacceptable degradation.

## Why?

Traffic and data grow unevenly; architecture must scale the actual constrained resource.

## Where?

Frontend delivery, APIs, caches, databases, downstream services.

## When?

When measured capacity/SLO demands it.

## How?

Identify bottleneck → scale/optimize that layer → measure again.

---

# 3. Real-Life Analogy

If one supermarket checkout is overloaded, adding a larger parking lot does not solve the queue.

Scale the bottleneck.

---

# 4. Visualization

```text
Users
  ↓
CDN
  ↓
Load Balancer
  ↓
API Instances
  ↓
Cache
  ↓
Database
```

---

# 5. Mind Map

```text
Scale
│
├── Vertical
├── Horizontal
├── Load Balancer
├── Statelessness
├── Cache
├── CDN
├── Rate Limit
└── Backpressure
```

---

# 6. Core Concepts

## 6.1 Vertical Scaling

Increase CPU/RAM of one node.

Pros:

- simple.

Cons:

- limits;
- larger failure domain;
- may become expensive.

---

## 6.2 Horizontal Scaling

Add nodes.

Requires:

- load distribution;
- shared/external state;
- observability;
- health checks.

---

## 6.3 Stateless Application Tier

Request-serving nodes should avoid relying on local process memory for durable/shared user state.

Use external:

- DB;
- cache;
- object store;
- session store as required.

---

## 6.4 Load Balancer

Responsibilities may include:

- distribute requests;
- remove unhealthy instances;
- TLS termination depending architecture;
- routing.

Algorithms awareness:

- round robin;
- least connections;
- consistent hashing in specialized cases.

---

## 6.5 Health vs Readiness

Liveness:

> process alive?

Readiness:

> safe to receive traffic?

A node may be alive but not ready.

---

## 6.6 Cache-Aside

```text
read cache
 ├── hit → return
 └── miss → DB → cache → return
```

Good for read-heavy data.

---

## 6.7 TTL

TTL bounds staleness and cache lifetime.

Short TTL:

- fresher;
- more misses.

Long TTL:

- better hit rate;
- more stale risk.

---

## 6.8 Cache Invalidation

Options:

- TTL;
- explicit invalidation;
- event-driven update;
- versioned keys.

No universal perfect solution.

---

## 6.9 Cache Stampede

Many requests miss same hot key simultaneously.

Mitigation:

- single-flight/request coalescing;
- lock;
- stale-while-revalidate;
- TTL jitter.

---

## 6.10 Hot Key

One item receives disproportionate traffic.

Can overload one cache shard/node.

Mitigations depend on cache architecture:

- replication;
- local cache;
- request coalescing;
- key strategy.

---

## 6.11 CDN

Best for cacheable content near users:

- static assets;
- images;
- videos;
- sometimes cacheable API responses.

Benefits:

- lower origin load;
- lower latency;
- bandwidth reduction.

---

## 6.12 Rate Limiting

Protects service/downstreams.

Possible dimensions:

- IP;
- user;
- API key;
- tenant;
- endpoint.

Algorithms:

- token bucket;
- fixed/sliding windows;
- leaky bucket.

---

# 7. Engineering Depth

## 7.1 Cache Consistency

Ask:

> Can users tolerate stale value for N seconds?

If no:

- maybe cache not suitable;
- or use invalidation/write-through/versioning.

---

## 7.2 Distributed Rate Limit

Single-process counter fails across many instances.

Need shared/distributed mechanism at:

- gateway;
- Redis-like shared state;
- dedicated rate-limit service;

depending scale.

---

## 7.3 Scaling Can Move Bottleneck

Adding API pods can overload DB faster.

After scaling one layer, remeasure downstream.

---

# 8. Implementation / Design

```text
Client
→ CDN
→ LB
→ API x N
→ distributed cache
→ primary DB/read replicas
```

Every arrow needs:

- timeout;
- metrics;
- capacity assumptions.

---

# 9. Hands-On Practice

For product catalog:

- static images → CDN;
- product detail → cache;
- inventory → shorter cache/stronger freshness;
- checkout → do not trust stale cached stock.

---

# 10. Google Interview Drill

## Problem — Product Page Goes Viral

Traffic increases 100× for one product.

### Clarify

- static assets?
- product metadata?
- inventory?
- read/write?
- target latency?

### First Approach

Add 100 API servers.

Can still crush DB.

### Improve

```text
CDN → assets
Cache → product metadata
Request coalescing → hot cache miss
DB → source of truth
```

Inventory/checkout remains correctness-sensitive.

### Follow-Up

If one cache key is hot:

- local/edge caching where safe;
- replication;
- coalescing.

### Trade-Off

Never use stale product inventory as final purchase authorization.

---

# 11. Common Mistakes

1. Horizontal scale without shared state design.
2. Cache everything.
3. No invalidation strategy.
4. CDN used for private dynamic data blindly.
5. Rate limit only per pod.
6. Health/liveness confusion.
7. API scaling ignoring DB.
8. Hot key ignored.

---

# 12. Best Practices

- scale measured bottleneck;
- keep API stateless where practical;
- cache by freshness semantics;
- use CDN for edge-cacheable content;
- bound traffic;
- monitor hit rate and downstream load;
- distinguish cache optimization from correctness.

---

# 13. Interview Questions

1. Vertical vs horizontal scaling?
2. What is stateless service?
3. Load balancer?
4. Health vs readiness?
5. Cache-aside?
6. TTL/invalidation?
7. Cache stampede?
8. Hot key?
9. CDN?
10. Rate limiting?

---

# 14. Google-Level Follow-Ups

1. cache outage?
2. stale data?
3. multi-region CDN?
4. authenticated content?
5. 1 hot tenant?
6. distributed limiter?
7. flash sale?
8. DB saturated after scale-out?

---

# 15. Quick Revision

```text
Scale bottleneck
Stateless API → easy horizontal scale
LB distributes healthy traffic
Cache reduces repeated source work
TTL/invalidation controls freshness
CDN moves cache toward user
Rate limit protects capacity
Hot keys/stampedes need special handling
```

---

# 16. Readiness Gate

- [ ] Vertical/horizontal.
- [ ] Statelessness.
- [ ] LB.
- [ ] Cache.
- [ ] CDN.
- [ ] Rate limit.
- [ ] Hot key/stampede.
- [ ] Viral-product drill.

**Gate:** READY / REPAIR

---

# 17. References

- Distributed caching / CDN / load-balancing references
