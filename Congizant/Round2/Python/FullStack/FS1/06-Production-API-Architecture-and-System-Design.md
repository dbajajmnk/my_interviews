# FS-01 / File 06 — Production API Architecture & System Design

**Priority:** P0  
**Suggested Time:** 65 minutes  
**GOJ Mapping:** M19 + M21 + M22

---

# 1. Objective

Integrate all FS-01 concepts into architect-level backend design.

Be able to design:

- API gateway/load balancer;
- stateless service instances;
- DB/cache/queue;
- async background work;
- authentication;
- rate limiting;
- observability;
- resilience;
- deployment/scaling boundaries.

---

# 2. 5W+H

## What?

Production API architecture connects request contracts to scalable runtime components.

## Why?

Correct endpoint code alone does not guarantee reliability or scale.

## Where?

Cloud-native backend systems.

## When?

Architect-level interviews and production design.

## How?

Clarify requirements → design components → define data/failure/security/scale.

---

# 3. Real-Life Analogy

A successful store is more than the checkout counter.

It also needs:

- inventory;
- security;
- warehouse;
- queue management;
- accounting;
- monitoring.

---

# 4. Visualization

```text
Client
  ↓
Load Balancer / API Gateway
  ↓
Python API Instances
  ├── Auth
  ├── Service Layer
  ├── Cache
  ├── DB
  ├── External APIs
  └── Queue
        ↓
      Workers

Observability:
logs + metrics + traces
```

---

# 5. Mind Map

```text
Production API
│
├── Gateway
├── Stateless Instances
├── DB
├── Cache
├── Queue
├── Workers
├── Auth
├── Rate Limit
├── Resilience
└── Observability
```

---

# 6. Core Concepts

## 6.1 Stateless API Instances

Keep request handling stateless where practical so multiple instances can scale horizontally.

Shared durable state belongs in appropriate external systems.

---

## 6.2 Load Balancing

Distribute requests across healthy instances.

Need health/readiness checks.

---

## 6.3 Queue

Use for:

- long-running jobs;
- decoupled side effects;
- retryable background processing;
- smoothing bursts.

---

## 6.4 Observability

Three pillars:

- logs;
- metrics;
- traces.

Key API metrics:

- RPS;
- error rate;
- p50/p95/p99;
- saturation;
- DB pool;
- external call latency;
- queue depth.

---

## 6.5 Health vs Readiness

Liveness:

> process alive?

Readiness:

> can safely receive traffic?

Do not make liveness dependent on every external service or you may create restart loops.

---

# 7. Engineering Depth

## 7.1 Synchronous vs Asynchronous Workflow

Order creation may need immediate DB commit but email notification can be async.

```text
POST /orders
   ↓
DB transaction
   ↓
202/201
   ↓
event/outbox
   ↓
queue
   ↓
email worker
```

This reduces request latency and decouples side effects.

---

## 7.2 Transaction Boundary

Do not hold DB transaction open while waiting 10 seconds for remote AI/HTTP call unless truly required.

Keep transaction as short as business consistency allows.

---

## 7.3 Scaling

Ask bottleneck:

- CPU?
- DB?
- downstream?
- cache?
- connection pool?
- rate quota?

Horizontal scaling does not fix a saturated shared DB automatically.

---

# 8. Implementation / Design

## Production Order API

```text
Client
 ↓
Gateway
 ↓
Order API
 ├── Auth
 ├── Validation
 ├── Order Service
 ├── DB transaction
 └── Outbox
       ↓
     Queue
       ↓
 Notification Worker
```

Add:

- idempotency;
- rate limit;
- tracing;
- retry;
- DLQ depending messaging architecture.

---

# 9. Hands-On Practice

Design:

1. file upload API;
2. long-running AI report API;
3. payment API;
4. search API with cache.

For each define:

- sync/async;
- storage;
- idempotency;
- timeout;
- scale;
- security;
- observability.

---

# 10. Google Interview Drill

## Problem — AI Document Processing API

Requirements:

- upload 100 MB PDF;
- extract text;
- chunk;
- embed;
- index;
- processing takes 1–3 minutes;
- user needs status.

### Clarify

- direct upload to API?
- file store?
- max size?
- malware scan?
- tenant isolation?
- retry?

### First Approach

Upload and process synchronously in request.

Bad for long processing.

### Improve

```text
Client
 ↓
Upload URL / API
 ↓
Object Storage
 ↓
Create Job
 ↓
Queue
 ↓
Worker Pipeline
 ├── extract
 ├── chunk
 ├── embed
 └── index
 ↓
Job Status Store
```

API:

```text
POST /documents
GET /jobs/{id}
```

### Edge Cases

- duplicate upload;
- worker crash;
- embedding failure;
- partial index;
- user deletes document during processing.

### Follow-Up

- idempotency;
- retries;
- compensating cleanup;
- tenant isolation;
- observability;
- cost.

---

# 11. Common Mistakes

1. Long job inside HTTP request.
2. DB transaction held across remote call.
3. No queue backpressure.
4. Stateless claim while storing global state.
5. No readiness checks.
6. Scale API but ignore DB.
7. No tracing.
8. No idempotency.

---

# 12. Best Practices

- short request transaction;
- external shared state;
- queues for long work;
- explicit job status;
- bounded retries;
- observability;
- health/readiness;
- load test bottleneck.

---

# 13. Interview Questions

1. How scale Python API?
2. What makes API stateless?
3. Why queue?
4. Health vs readiness?
5. What metrics?
6. Where use cache?
7. Where use outbox?
8. When background job?
9. How design long AI task?

---

# 14. Google-Level Follow-Ups

1. user retries upload?
2. worker dies halfway?
3. embedding provider down?
4. duplicate message?
5. delete while processing?
6. object storage security?
7. cost control?
8. multi-region?

---

# 15. Quick Revision

```text
Gateway
→ stateless API
→ short transaction
→ DB/cache
→ queue for long work
→ worker
→ logs/metrics/traces

Scale bottleneck, not just API pods
```

---

# 16. Readiness Gate

- [ ] Stateless service.
- [ ] Queue use.
- [ ] Health/readiness.
- [ ] Transaction boundary.
- [ ] Observability.
- [ ] Scaling bottleneck.
- [ ] AI document pipeline.

**Gate:** READY / REPAIR

---

# 17. References

- Cloud-native API architecture references
- OpenAPI
- OWASP API Security
