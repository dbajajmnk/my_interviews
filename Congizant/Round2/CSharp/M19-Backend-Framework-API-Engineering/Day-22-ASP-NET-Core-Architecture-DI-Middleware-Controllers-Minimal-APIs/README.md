# Day 22 — ASP.NET Core Architecture: DI, Middleware, Controllers & Minimal APIs

**Module:** M19 — Backend / Framework / API Engineering  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [ASP.NET Core request pipeline](01-ASP-NET-Core-request-pipeline.md)
2. [Kestrel awareness](02-Kestrel-awareness.md)
3. [Middleware](03-Middleware.md)
4. [Endpoint routing](04-Endpoint-routing.md)
5. [Controllers](05-Controllers.md)
6. [Minimal APIs](06-Minimal-APIs.md)
7. [Dependency injection container](07-Dependency-injection-container.md)
8. [Service lifetimes Singleton Scoped Transient](08-Service-lifetimes-Singleton-Scoped-Transient.md)
9. [Scoped service misuse](09-Scoped-service-misuse.md)
10. [Options pattern](10-Options-pattern.md)
11. [Configuration](11-Configuration.md)
12. [Environment variables](12-Environment-variables.md)
13. [Secrets awareness](13-Secrets-awareness.md)
14. [Model binding](14-Model-binding.md)
15. [Validation](15-Validation.md)
16. [Data annotations awareness](16-Data-annotations-awareness.md)
17. [ProblemDetails awareness](17-ProblemDetails-awareness.md)
18. [Logging](18-Logging.md)
19. [Request IDs](19-Request-IDs.md)
20. [Exception handling middleware](20-Exception-handling-middleware.md)
21. [Filters awareness](21-Filters-awareness.md)
22. [BackgroundService awareness](22-BackgroundService-awareness.md)
23. [Hosted services](23-Hosted-services.md)
24. [Health checks](24-Health-checks.md)
25. [Readiness](25-Readiness.md)
26. [Graceful shutdown](26-Graceful-shutdown.md)

---

# 2. Real-Life Analogy

ASP.NET Core is a conveyor belt of middleware/endpoints backed by DI lifetimes; one wrong lifetime can contaminate the whole pipeline.

---

# 3. Visualization

```text
Kestrel → Middleware → Endpoint → Service → Repository/External → Response
```

---

# 4. Mind Map

```text
ASP.NET Core Architecture: DI, Middleware, Controllers & Minimal APIs
├── C# Semantics
├── CLR / IL / Runtime
├── Async / Lifetime
├── Framework / Data
├── Implementation
├── Failure / Edge Cases
├── Debugging
├── Code Review
├── AI Evaluation
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

```text
00–15 min  Rapid recall / topic scan
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Questions/follow-ups
115–120 min Readiness gate + repair note
```

---

# 6. Engineering Integration

Connect:

> **Concept → C# Guarantee → CLR/Framework Boundary → Lifetime/Ownership → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Build a layered ASP.NET Core API with DI, validation, logging, ProblemDetails, health checks and graceful shutdown.

---

# 8. Google Interview Drill

A singleton service depends on a scoped DbContext. Explain the lifetime bug and fix.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Build/Test → Edge Cases → Complexity/Allocation → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Confusing C# with .NET/CLR.
- Sync-over-async.
- Missing cancellation.
- Resource leaks.
- Wrong DI lifetime.
- Overusing inheritance/patterns.
- Trusting LINQ/EF/runtime behavior without evidence.
- Optimizing without diagnostics.

---

# 10. Day-Level Best Practices

- Nullable enabled.
- Async all the way for I/O.
- CancellationToken propagated.
- Deterministic disposal.
- Constructor injection and correct lifetimes.
- Inspect SQL and traces.
- Measure before tuning.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does C# guarantee?
3. What is CLR/framework-specific?
4. What can allocate/block/race/leak?
5. What evidence would you collect?
6. What simpler design could replace the abstraction?

---

# 12. Google-Level Follow-Ups

1. What changes under 10× concurrency?
2. What happens when CancellationToken fires?
3. What if the DB/API is saturated?
4. What changes under Native AOT/trimming?
5. What would counters/trace/dump/profile show?
6. What would you choose differently for library vs ASP.NET Core service?

---

# 13. Quick Revision

```text
What is it?
Why?
What does C# guarantee?
What does CLR/framework do?
What allocates?
What can block/race/leak?
How do I debug it?
What do I review?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization.
- [ ] I completed the hands-on task.
- [ ] I completed the Google drill.
- [ ] I can distinguish language vs CLR/framework behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
