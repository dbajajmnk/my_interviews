# GOJ Interview Preparation — Cognizant
## Area 05 — Architecture
### ARCH-03 — Security, Performance & Production

**Role:** Python Full Stack Development Architect with AI  
**Company:** Cognizant  
**Interview Date:** 24 August 2026  
**Interview Time:** 3:00 PM – 4:00 PM  
**Experience Level:** 16+ Years  
**Priority:** P0  
**GOJ Mapping:** M20 Performance & Security + M21 Architecture & Distributed Systems + M22 Production Engineering + M23 Senior Engineering Scenarios  
**Baseline:** KIS + DRY + SOLID + Google-Level + 360° Coverage  
**Execution Rule:** One file at a time → readiness gate → repair only weak areas

> **Source Rule:** No detailed JD was provided. This pack is role-derived from “Python Full Stack Development Architect with AI.” The focus is production architecture: security, performance, reliability, deployment, observability, incident response, and operational trade-offs across React + Python + AI-enabled systems.

---

# 1. Pack Objective

ARCH-03 prepares you to defend whether a proposed system can safely and reliably run in production.

By the end of this pack you should be able to:

- design authentication and authorization boundaries;
- reason about API, frontend, database, cloud, and AI security;
- apply least privilege, secrets management, encryption, input validation, and tenant isolation;
- explain common web/API threats and architectural controls;
- diagnose performance bottlenecks across browser, API, database, cache, network, and AI providers;
- define latency budgets, capacity limits, rate limits, caching, backpressure, and load shedding;
- design resilient services using timeout, retry, circuit breaker, bulkhead, idempotency, and graceful degradation;
- define production deployment patterns, health/readiness, rolling/canary/blue-green awareness, rollback, and configuration management;
- design logs, metrics, traces, alerting, dashboards, SLI/SLOs, and operational runbooks;
- reason about incident response, root-cause analysis, DR, RPO/RTO, and post-incident prevention;
- design AI-specific production controls including prompt/data safety, cost quotas, model fallback, evaluation gates, and AI telemetry;
- survive architect-level production follow-ups without bluffing.

Target:

> **Secure → Measure → Bound → Protect → Deploy → Observe → Detect → Recover → Learn → Improve → Defend**

---

# 2. Directory Structure

```text
GOJ-Cognizant-ARCH-03-Final/
│
├── README.md
├── 01-Security-Architecture-Identity-Authorization-and-Trust-Boundaries.md
├── 02-Web-API-Data-and-AI-Security-Threats-and-Controls.md
├── 03-Performance-Architecture-Latency-Capacity-Caching-and-Bottlenecks.md
├── 04-Reliability-Resilience-Backpressure-and-Graceful-Degradation.md
├── 05-Deployment-Cloud-Production-Readiness-and-Rollback.md
├── 06-Observability-SLOs-Incident-Response-and-Disaster-Recovery.md
├── 07-Production-Architecture-Scenarios-and-Trade-Off-Defense.md
└── 08-ARCH-03-Final-Readiness-Assessment.md
```

KIS rule:

- security is architectural, not a final checklist;
- optimize measured bottlenecks, not guessed bottlenecks;
- every remote call must be bounded;
- every release must be observable and reversible;
- every critical state-changing operation needs an idempotency/failure story;
- AI production controls extend—not replace—normal software engineering controls.

---

# 3. Time Allocation

| File | Focus | Suggested Time |
|---|---|---:|
| 01 | Identity, authorization, trust boundaries | 70 min |
| 02 | Web/API/data/AI threats & controls | 75 min |
| 03 | Performance, latency, capacity, caching | 80 min |
| 04 | Reliability, resilience, backpressure | 75 min |
| 05 | Deployment, readiness, rollback | 70 min |
| 06 | Observability, SLOs, incident response, DR | 80 min |
| 07 | Production scenarios & trade-off defense | 85 min |
| 08 | Final readiness assessment | 60 min |
| **Total** |  | **~9 hr 55 min** |

Time rule:

> **Production depth means knowing what fails, how you detect it, how you limit blast radius, and how you recover.**

---

# 4. Locked GOJ Google-Level File Standard

Every learning file follows:

> **Objective → 5W+H → Real-Life Analogy → Visualization → Mind Map → Core Concepts → Engineering Depth → Implementation / Design → Hands-On Practice → Google Interview Drill → Common Mistakes → Best Practices → Interview Questions → Google-Level Follow-Ups → Quick Revision → Readiness Gate → References**

Mandatory reasoning flow:

> **Clarify → Threat/Bottleneck → First Design → Improve → Failure Test → Observe → Trade-Off → Recovery → Follow-Up → Defend**

---

# 5. Production Architecture Interview Standard

For every production architecture question:

```text
1. Clarify business criticality
2. Identify trust boundaries
3. Identify bottlenecks / capacity limits
4. Define security controls
5. Define timeout / retry / idempotency
6. Define failure isolation / degradation
7. Define deployment / rollback
8. Define logs / metrics / traces
9. Define SLO / alerts
10. Define backup / DR if relevant
11. Define incident / recovery path
12. Defend trade-offs
```

---

# 6. Final Scoring Standard

| Dimension | Weight |
|---|---:|
| Security Architecture | 20% |
| Performance & Capacity | 20% |
| Reliability & Resilience | 15% |
| Deployment / Production Readiness | 15% |
| Observability / Incident / DR | 15% |
| Google Drill & Architect Defense | 15% |
| **Total** | **100%** |

### READY

- 80%+ overall;
- no P0 weakness;
- can define trust boundaries;
- can diagnose production latency systematically;
- can prevent cascading failure;
- can define safe deployment/rollback;
- can explain SLOs and incident response;
- can integrate AI-specific risks into standard production architecture.

---

# 7. ARCH-03 Completion Criteria

You must be able to:

- distinguish authentication, authorization, and tenant isolation;
- explain least privilege, secrets, encryption, injection, XSS/CSRF/CORS, SSRF, BOLA, and mass assignment at architect level;
- define AI prompt/tool/data security controls;
- build latency/capacity budget;
- identify CPU/DB/network/provider bottlenecks;
- use cache/rate limit/backpressure correctly;
- define resilience policies;
- define safe deployment and rollback;
- define health/readiness;
- define logs/metrics/traces and alerts;
- explain SLI/SLO/SLA and error budgets;
- define RPO/RTO and restore testing;
- lead production incident reasoning;
- defend production trade-offs.

---

# 8. Next Pack

After ARCH-03:

> **ARCH-04 — Architect & Client Scenarios**
