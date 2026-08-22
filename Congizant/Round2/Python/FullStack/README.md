# GOJ Interview Preparation — Cognizant
## Area 03 — Full Stack
### FS-01 — Python Backend & API Engineering

**Role:** Python Full Stack Development Architect with AI  
**Company:** Cognizant  
**Interview Date:** 24 August 2026  
**Interview Time:** 3:00 PM – 4:00 PM  
**Experience Level:** 16+ Years  
**Priority:** P0  
**GOJ Mapping:** M19 Backend / Framework / API Engineering + selected M17 Testing + M20 Performance & Security + M21 Architecture  
**Baseline:** KIS + DRY + SOLID + Google-Level + 360° Coverage  
**Execution Rule:** One file at a time → readiness gate → repair only weak areas

> **Source Rule:** No detailed JD was provided. This pack is role-derived from “Python Full Stack Development Architect with AI.” Framework-specific material is kept awareness-level unless it supports common backend architecture reasoning.

---

# 1. Pack Objective

FS-01 prepares you to design, explain, review, and defend Python backend APIs at architect depth.

By the end of this pack you should be able to:

- explain HTTP request/response lifecycle;
- design RESTful APIs and resource contracts;
- choose correct HTTP methods and status codes;
- design validation and error handling;
- distinguish authentication from authorization;
- explain statelessness, sessions, tokens, and API security basics;
- design pagination, filtering, sorting, versioning, and idempotency;
- explain middleware, dependency injection, service/repository boundaries;
- choose sync vs async API execution;
- explain FastAPI, Django, and Flask positioning without pretending a framework is JD-confirmed;
- design resilient API integrations with timeout, retry, circuit breaker, caching, and rate limiting;
- test backend APIs;
- review API code for correctness, security, performance, and maintainability;
- defend a production-ready API architecture.

Target:

> **Request → Contract → Validate → Authorize → Execute → Persist → Respond → Observe → Defend**

---

# 2. Directory Structure

```text
GOJ-Cognizant-FS-01-Final/
│
├── README.md
├── 01-HTTP-REST-and-API-Contracts.md
├── 02-Validation-Errors-Auth-Pagination-and-Idempotency.md
├── 03-Backend-Layers-DI-Middleware-and-Framework-Awareness.md
├── 04-Async-API-Resilience-Caching-and-Rate-Limiting.md
├── 05-API-Testing-Debugging-Security-and-Code-Review.md
├── 06-Production-API-Architecture-and-System-Design.md
└── 07-FS-01-Final-Readiness-Assessment.md
```

KIS rule:

- no duplicate practice/lab folders;
- drills stay inside topic files;
- framework awareness remains concise;
- no framework trivia unless it improves interview survival.

---

# 3. Time Allocation

| File | Focus | Suggested Time |
|---|---|---:|
| 01 | HTTP, REST, API contracts | 60 min |
| 02 | Validation, errors, auth, pagination, idempotency | 75 min |
| 03 | Layers, DI, middleware, framework awareness | 65 min |
| 04 | Async APIs, resilience, caching, rate limiting | 75 min |
| 05 | Testing, debugging, security, code review | 60 min |
| 06 | Production API architecture/system design | 65 min |
| 07 | Final readiness assessment | 60 min |
| **Total** |  | **~7 hr 40 min** |

Time rule:

> **Know the contract deeply; know framework syntax only enough to implement and defend the architecture.**

---

# 4. Locked GOJ Google-Level File Standard

Every learning file follows:

> **Objective → 5W+H → Real-Life Analogy → Visualization → Mind Map → Core Concepts → Engineering Depth → Implementation / Code → Hands-On Practice → Google Interview Drill → Common Mistakes → Best Practices → Interview Questions → Google-Level Follow-Ups → Quick Revision → Readiness Gate → References**

Mandatory reasoning flow:

> **Clarify → First Approach → Improve → Code / Design → Test → Edge Cases → Complexity → Trade-Off → Follow-Up → Defend**

---

# 5. Backend Interview Standard

For every API design question:

```text
1. Clarify resource/use case
2. Define request contract
3. Define response contract
4. Validate input
5. Authenticate / authorize
6. Decide transaction boundary
7. Handle failures
8. Define idempotency
9. Define performance / scale
10. Add observability
11. Test edge cases
12. Defend trade-offs
```

---

# 6. Final Scoring Standard

| Dimension | Weight |
|---|---:|
| HTTP / REST / Contract Understanding | 20% |
| API Design & Implementation | 20% |
| Security / Validation / Reliability | 20% |
| Google Interview Drill | 20% |
| Testing / Debugging / Code Review | 10% |
| Architect-Level Defense | 10% |
| **Total** | **100%** |

### READY

- 80%+ overall;
- no P0 weakness;
- can design API without framework dependency;
- can explain security and idempotency;
- can defend sync vs async;
- can handle production failure follow-ups.

---

# 7. FS-01 Completion Criteria

You must be able to:

- explain HTTP method semantics;
- design REST resource endpoints;
- choose status codes correctly;
- explain API validation/error contracts;
- explain authentication vs authorization;
- design offset/cursor pagination;
- explain idempotency keys;
- explain middleware and dependency injection;
- compare FastAPI/Django/Flask at a practical level;
- identify event-loop blocking;
- design timeout/retry/circuit breaker;
- explain caching/rate limiting;
- create API test strategy;
- review unsafe backend code;
- design production-ready API flow.

---

# 8. Next Pack

After FS-01:

> **FS-02 — SQL, Database & Data Access**
