# ARCH-01 — Final Readiness Assessment

**Priority:** P0  
**Suggested Time:** 60 minutes  
**Rule:** Answer/design without notes first. Repair only weak areas.

---

# 1. Rapid Recall — 12 Minutes

Answer in 30–60 seconds:

1. Functional vs non-functional requirements?
2. How estimate RPS?
3. How estimate concurrency?
4. What is SLO?
5. Vertical vs horizontal scaling?
6. What is stateless service?
7. Load balancer?
8. Cache-aside?
9. Cache stampede?
10. CDN?
11. Rate limiting?
12. Strong vs eventual consistency?
13. Source vs derived data?
14. Replication?
15. Replica lag?
16. Partition vs shard?
17. Shard key?
18. Sync vs async?
19. Command vs event?
20. Idempotency?
21. DLQ?
22. Outbox?
23. Saga?
24. Circuit breaker?
25. Bulkhead?
26. Backpressure?
27. RPO/RTO?
28. Logs vs metrics vs traces?
29. When split microservices?
30. How identify bottleneck?

---

# 2. Estimation Round — 8 Minutes

System:

```text
50M requests/day
average response time = 200 ms
```

Estimate:

- average RPS;
- rough concurrency;
- why peak matters.

Do not chase fake precision.

---

# 3. Data / Consistency Round — 8 Minutes

Order system:

- relational source of truth;
- search index;
- cache;
- analytics warehouse.

Explain:

- which is authoritative;
- which can lag;
- how stale reads are handled.

---

# 4. Messaging / Reliability Round — 8 Minutes

Order DB commits but event publish occasionally fails.

Explain:

- dual-write problem;
- outbox;
- idempotent consumer;
- retry/DLQ.

---

# 5. Google Interview Drill — 14 Minutes

## Design Enterprise File Processing Platform

Requirements:

- 1 GB files;
- 1M files/day;
- 5-minute processing;
- private files;
- virus scan;
- worker failure;
- user status.

Use:

> **Clarify → Estimate → APIs → Data → Baseline → Async Flow → Scale → Failure → Security → Observability → Trade-Off → Defend**

Expected:

```text
Client
→ API
→ direct object-storage upload
→ job DB
→ queue
→ workers
→ result store
→ status API
```

Include:

- signed URLs;
- tenant auth;
- idempotency;
- retries/DLQ;
- queue-depth autoscaling;
- tracing/metrics.

---

# 6. Architect Follow-Up — 10 Minutes

Answer:

1. Why not process synchronously?
2. Why object storage?
3. What if queue grows 100×?
4. What if worker crashes halfway?
5. What if DB replica is stale?
6. What if one tenant dominates traffic?
7. When would you shard?
8. When would you split services?
9. How would you handle regional outage?
10. What would you measure first if p99 latency rises?

---

# 7. Scoring Rubric

| Dimension | Weight | Score |
|---|---:|---:|
| Requirements / Estimation / Problem Framing | 20% | ___ / 20 |
| Architecture / Component Design | 20% | ___ / 20 |
| Data / Consistency / Scalability | 20% | ___ / 20 |
| Reliability / Failure Reasoning | 15% | ___ / 15 |
| Google Interview Drill | 15% | ___ / 15 |
| Architect-Level Trade-Off Defense | 10% | ___ / 10 |
| **Total** | **100%** | **___ / 100** |

---

# 8. Readiness Gate

ARCH-01 is READY only if:

- [ ] 80%+ overall
- [ ] no P0 weakness
- [ ] requirement clarification is structured
- [ ] estimates influence architecture
- [ ] scaling/caching/load balancing clear
- [ ] data consistency/replication/sharding clear
- [ ] messaging/idempotency/outbox clear
- [ ] resilience/backpressure clear
- [ ] observability/DR clear
- [ ] full-stack design is progressive, not buzzword-heavy
- [ ] trade-offs can be defended

---

# 9. Final Quick Notes

```text
Architecture flow:
requirements
→ estimates
→ APIs/data
→ baseline
→ critical path
→ bottleneck
→ scale
→ failure
→ security
→ observability
→ trade-offs

Scale only what is constrained.
Cache only what can be stale.
Shard only when needed.
Async only when workflow benefits.
Retry only transient/idempotent work.
Every component must earn its place.
```

---

# 10. Decision

### READY

Move to:

> **ARCH-02 — AI-Enabled Architecture**

### REPAIR

Return only to weak topics.

---

> **GOJ Rule: Repair the gap, not the whole syllabus.**
