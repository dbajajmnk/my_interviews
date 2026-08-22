# ARCH-03 — Final Readiness Assessment

**Priority:** P0  
**Suggested Time:** 60 minutes  
**Rule:** Answer/design without notes first. Repair only weak areas.

---

# 1. Rapid Recall — 12 Minutes

Answer in 30–60 seconds:

1. Authentication vs authorization?
2. RBAC vs ABAC?
3. What is object-level authorization?
4. How enforce tenant isolation?
5. What is least privilege?
6. What is zero trust?
7. SQL injection?
8. XSS?
9. CSRF?
10. CORS?
11. SSRF?
12. Mass assignment?
13. File upload risks?
14. Prompt injection?
15. Latency vs throughput?
16. p95/p99?
17. What is saturation?
18. How detect DB pool exhaustion?
19. What is circuit breaker?
20. Bulkhead?
21. Backpressure?
22. Load shedding?
23. Graceful degradation?
24. Rolling vs canary?
25. Liveness vs readiness?
26. Expand/contract migration?
27. Logs vs metrics vs traces?
28. SLI/SLO/SLA?
29. RPO/RTO?
30. Backup vs replication?

---

# 2. Security Scenario — 8 Minutes

Tenant A retrieves Tenant B document through RAG.

Explain:

- security incident;
- tenant metadata/ACL;
- search filter;
- cache key;
- citation resolver;
- regression tests;
- audit review.

---

# 3. Performance Scenario — 8 Minutes

```text
20 API pods
pool size 30 each
DB max connections 300
p95 latency = 3 sec
DB CPU high
```

Explain likely pool/capacity issue and why adding pods can worsen it.

---

# 4. Reliability Scenario — 8 Minutes

Model provider returns 429.

Define:

- concurrency cap;
- per-tenant rate limit;
- backoff/jitter;
- retry budget;
- fallback/degradation;
- background queue;
- metrics.

---

# 5. Google Interview Drill — 14 Minutes

## Productionize Enterprise AI Support Platform

Requirements:

- React + Python;
- RAG;
- order lookup tool;
- ticket creation tool;
- 20k concurrent users;
- 99.9% availability;
- p95 initial response <3 sec;
- sensitive data;
- tenant isolation;
- provider quotas.

Use:

> **Clarify → Trust Boundaries → Capacity → Security → Reliability → Performance → Deployment → Observability → DR → Trade-Off → Defend**

Expected:

```text
React
→ CDN / Gateway
→ Python API
→ Tenant/AuthZ
→ RAG + Model
→ Narrow Tool Executor
→ Enterprise APIs
```

Include:

- tenant-aware caches;
- timeouts/retries;
- idempotent ticket creation;
- provider concurrency limits;
- retrieval-only degradation;
- canary/rollback;
- SLO dashboards;
- backup/restore;
- audit.

---

# 6. Architect Follow-Up — 10 Minutes

Answer:

1. Why not trust internal network?
2. How prevent SSRF from AI tool?
3. What if p99 alone is bad?
4. What if model provider is slow?
5. What if queue is full?
6. How deploy DB change safely?
7. How rollback prompt/index/model?
8. What should trigger an alert?
9. What if backup restore takes too long?
10. How would global expansion change design?

---

# 7. Scoring Rubric

| Dimension | Weight | Score |
|---|---:|---:|
| Security Architecture | 20% | ___ / 20 |
| Performance & Capacity | 20% | ___ / 20 |
| Reliability & Resilience | 15% | ___ / 15 |
| Deployment / Production Readiness | 15% | ___ / 15 |
| Observability / Incident / DR | 15% | ___ / 15 |
| Google Drill & Architect Defense | 15% | ___ / 15 |
| **Total** | **100%** | **___ / 100** |

---

# 8. Readiness Gate

ARCH-03 is READY only if:

- [ ] 80%+ overall
- [ ] no P0 weakness
- [ ] trust boundaries are explicit
- [ ] major web/API/AI threats can be explained
- [ ] latency/capacity bottlenecks can be diagnosed
- [ ] resilience/backpressure controls are clear
- [ ] deployment/rollback can be defended
- [ ] logs/metrics/traces/SLOs are clear
- [ ] DR/RPO/RTO are clear
- [ ] production AI architecture is defendable
- [ ] no “just add servers” / “just retry” answers

---

# 9. Final Quick Notes

```text
Security:
authenticate
authorize
tenant isolate
least privilege
validate
audit

Performance:
measure
trace
find saturation
scale bottleneck

Reliability:
timeout
retry selectively
idempotency
breaker
bulkhead
backpressure
degrade safely

Production:
readiness
canary
rollback
versioning

Operations:
logs
metrics
traces
SLO
alerts
runbooks
RPO/RTO
restore drills
```

---

# 10. Decision

### READY

Move to:

> **ARCH-04 — Architect & Client Scenarios**

### REPAIR

Return only to weak topics.

---

> **GOJ Rule: Repair the gap, not the whole syllabus.**
