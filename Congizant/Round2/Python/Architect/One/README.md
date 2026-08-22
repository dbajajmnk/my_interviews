# GOJ Interview Preparation — Cognizant
## Area 05 — Architecture
### ARCH-01 — Full-Stack System Design

**Role:** Python Full Stack Development Architect with AI  
**Company:** Cognizant  
**Interview Date:** 24 August 2026  
**Interview Time:** 3:00 PM – 4:00 PM  
**Experience Level:** 16+ Years  
**Priority:** P0  
**GOJ Mapping:** M19 Backend / API Engineering + M18 Data Access + M20 Performance & Security + M21 Architecture & Distributed Systems + M22 Production Engineering + M23 Senior Engineering Scenarios  
**Baseline:** KIS + DRY + SOLID + Google-Level + 360° Coverage  
**Execution Rule:** One file at a time → readiness gate → repair only weak areas

> **Source Rule:** No detailed JD was provided. This pack is role-derived from “Python Full Stack Development Architect with AI.” It focuses on vendor-neutral full-stack system design. Deep AI architecture belongs to ARCH-02.

---

# 1. Pack Objective

ARCH-01 prepares you to solve system-design questions using a repeatable architect-level method.

By the end of this pack you should be able to:

- clarify functional and non-functional requirements;
- estimate traffic, storage, bandwidth, and concurrency at practical interview depth;
- design client → gateway → backend → cache → database → messaging → workers;
- explain horizontal scaling, load balancing, stateless services, CDN, caching, and rate limiting;
- choose relational, document, key-value, search, object, and graph storage based on access patterns;
- explain replication, partitioning, sharding, consistency, transactions, and idempotency;
- design synchronous vs asynchronous workflows;
- use queues/events for decoupling and long-running work;
- explain reliability, availability, fault isolation, retry, timeout, circuit breaker, and backpressure;
- reason about observability and operational readiness;
- identify bottlenecks instead of scaling every component blindly;
- defend architecture trade-offs clearly and progressively;
- survive Google-style follow-up questions that change scale, consistency, latency, or failure assumptions.

Target:

> **Requirements → Estimate → APIs → Data → Components → Scale → Failure → Security → Observability → Trade-Offs → Improve → Defend**

---

# 2. Directory Structure

```text
GOJ-Cognizant-ARCH-01-Final/
│
├── README.md
├── 01-System-Design-Method-Requirements-and-Capacity.md
├── 02-Scalability-Load-Balancing-Caching-CDN-and-Rate-Limiting.md
├── 03-Data-Architecture-Consistency-Replication-and-Sharding.md
├── 04-APIs-Messaging-Events-and-Asynchronous-Workflows.md
├── 05-Reliability-Availability-Observability-and-Failure-Handling.md
├── 06-End-to-End-Full-Stack-System-Design-and-Trade-Offs.md
└── 07-ARCH-01-Final-Readiness-Assessment.md
```

KIS rule:

- do not begin with microservices;
- do not introduce sharding before a real need;
- do not estimate numbers that do not influence design;
- do not over-design for imaginary scale;
- every component must earn its place.

---

# 3. Time Allocation

| File | Focus | Suggested Time |
|---|---|---:|
| 01 | System-design method, requirements, estimation | 70 min |
| 02 | Scale, load balancing, cache, CDN, rate limiting | 75 min |
| 03 | Data architecture, consistency, replication, sharding | 80 min |
| 04 | APIs, queues, events, async workflows | 75 min |
| 05 | Reliability, availability, observability, failure | 75 min |
| 06 | End-to-end system design & trade-offs | 80 min |
| 07 | Final readiness assessment | 60 min |
| **Total** |  | **~8 hr 35 min** |

Time rule:

> **Design only to the depth justified by requirements.**

---

# 4. Locked GOJ Google-Level File Standard

Every learning file follows:

> **Objective → 5W+H → Real-Life Analogy → Visualization → Mind Map → Core Concepts → Engineering Depth → Implementation / Design → Hands-On Practice → Google Interview Drill → Common Mistakes → Best Practices → Interview Questions → Google-Level Follow-Ups → Quick Revision → Readiness Gate → References**

Mandatory reasoning flow:

> **Clarify → First Design → Identify Bottleneck → Improve → Test Failure → Edge Cases → Scale → Trade-Off → Follow-Up → Defend**

---

# 5. System Design Interview Standard

For every architecture question:

```text
1. Clarify functional requirements
2. Clarify non-functional requirements
3. Estimate only what changes design
4. Define external APIs / user flow
5. Define core data model
6. Draw high-level architecture
7. Walk critical request path
8. Identify bottlenecks
9. Add scale / reliability mechanisms
10. Discuss consistency / failure
11. Add security / observability
12. Defend trade-offs and alternatives
```

---

# 6. Final Scoring Standard

| Dimension | Weight |
|---|---:|
| Requirements / Estimation / Problem Framing | 20% |
| Architecture / Component Design | 20% |
| Data / Consistency / Scalability | 20% |
| Reliability / Failure Reasoning | 15% |
| Google Interview Drill | 15% |
| Architect-Level Trade-Off Defense | 10% |
| **Total** | **100%** |

### READY

- 80%+ overall;
- no P0 weakness;
- can structure an unknown design problem;
- can scale only the bottleneck;
- can explain consistency/failure trade-offs;
- can defend why each major component exists.

---

# 7. ARCH-01 Completion Criteria

You must be able to:

- drive requirement clarification;
- do back-of-envelope estimates;
- explain stateless horizontal scaling;
- explain cache/CDN/rate limiting;
- choose storage by access pattern;
- explain replication/partitioning/sharding;
- explain consistency and idempotency;
- design sync vs async flows;
- explain queue/event semantics;
- define retries/timeouts/backpressure;
- define health/readiness/observability;
- design a complete full-stack system;
- survive scale/failure/change follow-ups.

---

# 8. Next Pack

After ARCH-01:

> **ARCH-02 — AI-Enabled Architecture**
