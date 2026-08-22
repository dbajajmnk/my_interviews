# ARCH-03 / File 07 — Production Architecture Scenarios & Trade-Off Defense

**Priority:** P0  
**Suggested Time:** 85 minutes  
**GOJ Mapping:** M23 Senior Engineering Scenarios

---

# 1. Objective

Practice integrating:

- security;
- performance;
- reliability;
- deployment;
- observability;
- DR;
- AI production controls;

into architect-level scenarios.

---

# 2. 5W+H

## What?

Production architecture scenarios test whether you can make decisions when requirements conflict.

## Why?

Real architecture is trade-off management.

## Where?

Senior/architect interviews and client discussions.

## When?

After technical foundations are understood.

## How?

Clarify criticality → identify risks → design controls → discuss trade-offs → define evidence.

---

# 3. Real-Life Analogy

A production architect is like an air-traffic controller:

- capacity;
- safety;
- failures;
- weather;
- priorities;

must all be managed together.

---

# 4. Visualization

```text
Business Goal
 ↓
Critical Path
 ↓
Security
 ↓
Capacity / Performance
 ↓
Reliability
 ↓
Deployment
 ↓
Observability
 ↓
Recovery
 ↓
Trade-Off
```

---

# 5. Mind Map

```text
Production Defense
│
├── Security
├── Performance
├── Reliability
├── Deployment
├── Observability
├── DR
├── Cost
└── Trade-Offs
```

---

# 6. Scenario A — Secure Multi-Tenant API

Requirements:

- 10k tenants;
- sensitive documents;
- React + Python;
- RAG;
- support admins.

Key decisions:

- central identity;
- tenant-scoped authorization;
- ACL-aware RAG;
- tenant-aware cache;
- audit admin access;
- break-glass policy.

---

# 7. Scenario B — High-Traffic API

Symptoms:

- 5k RPS;
- p95 400 ms;
- p99 4 sec;
- DB pool near limit.

Reasoning:

- trace p99;
- examine connection wait/locks;
- right-size pools;
- cap concurrency;
- cache/read-scale where safe;
- avoid blindly increasing pods.

---

# 8. Scenario C — AI Provider Outage

Requirements:

- chat is useful but non-critical;
- retrieval still available.

Graceful degradation:

```text
RAG search results + citations
```

without model synthesis.

High-risk workflows:

> fail closed/human rather than untested fallback.

---

# 9. Scenario D — Production Release Failure

Canary shows:

```text
error rate +15%
```

Actions:

- stop rollout;
- rollback/feature flag;
- compare trace/config/migration;
- verify recovery;
- RCA;
- regression test.

---

# 10. Google Interview Drill

## Problem — Design Production Architecture for Enterprise AI Support Platform

Requirements:

- React frontend;
- Python API;
- RAG over private support docs;
- agent can check order status and create support tickets;
- 20k concurrent users;
- 99.9% availability target;
- p95 initial response < 3 sec;
- tenant isolation;
- model provider has rate limits;
- customer data sensitive;
- global deployment planned later.

### Clarify

- current region?
- traffic pattern?
- ticket side effect?
- provider data policy?
- tenant/admin roles?
- RAG freshness?
- model fallback?
- DR target?

### High-Level Architecture

```text
React
→ CDN / Edge
→ Gateway / WAF / Rate Limit
→ Python API
→ AuthZ / Tenant Policy
→ RAG Retriever
→ Model Orchestrator
→ Tool Executor
→ Order API / Ticket API

Data:
Relational metadata
Vector/search index
Object storage
Cache
Queue for async jobs
```

### Security

- tenant ACL before retrieval;
- least-privilege tool identity;
- no arbitrary tool execution;
- PII-safe logs;
- secrets manager;
- TLS/encryption;
- audit.

### Performance

- CDN for static assets;
- cache metadata/retrieval where safe;
- provider concurrency limit;
- streaming;
- DB pool limits;
- p95 stage-level tracing.

### Reliability

- timeouts;
- selective retry;
- breaker;
- bulkhead;
- queue;
- idempotent ticket creation;
- retrieval-only degradation if LLM down.

### Production

- readiness probes;
- canary releases;
- versioned prompt/model/index;
- rollback;
- SLO dashboards;
- runbooks.

### DR

- define RPO/RTO;
- backup metadata;
- rebuildable derived vector index where feasible;
- restore tests.

### Follow-Up

If traffic becomes global:

> add regions based on latency/residency requirements, not automatically.

---

# 11. Common Mistakes

1. Security after architecture.
2. AI provider assumed infinite.
3. Global multi-region from day one.
4. Retry without idempotency.
5. Cache ignores tenant.
6. No rollback.
7. No p95/p99.
8. Vector index treated as only copy of documents.
9. No graceful degradation.

---

# 12. Best Practices

- critical path first;
- trust boundaries explicit;
- capacity limits explicit;
- derived data rebuildable;
- AI failures degrade safely;
- staged deployment;
- actionable observability;
- recovery practiced.

---

# 13. Interview Questions

1. How make system production-ready?
2. What are top security boundaries?
3. How handle provider rate limit?
4. How meet p95 target?
5. How design graceful degradation?
6. What should be backed up?
7. How canary AI changes?
8. How isolate tenant?
9. How define DR?
10. How defend architecture trade-offs?

---

# 14. Google-Level Follow-Ups

1. provider outage?
2. vector DB corruption?
3. one tenant spike?
4. p99 rises only?
5. cache leaks tenant data?
6. model cost doubles?
7. region outage?
8. new prompt harms quality?
9. queue backlog?
10. support ticket duplicates?

---

# 15. Quick Revision

```text
Production architect asks:
Is it secure?
Can it meet load?
What fails?
How do we limit blast radius?
How do we detect it?
Can we roll back?
Can we restore?
What does degradation look like?
What evidence proves readiness?
```

---

# 16. Readiness Gate

- [ ] Security integration.
- [ ] Performance integration.
- [ ] Reliability integration.
- [ ] Deployment/rollback.
- [ ] Observability/DR.
- [ ] AI production controls.
- [ ] Enterprise support drill.

**Gate:** READY / REPAIR

---

# 17. References

- Production architecture, SRE, security, and AI operations references
