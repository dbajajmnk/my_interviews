# Day 29 — Senior C#/.NET Architect Scenarios & Capstone Challenge

**Module:** M23 — Senior Engineering Scenarios & Capstone Challenge  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [Legacy .NET Framework modernization](01-Legacy-NET-Framework-modernization.md)
2. [.NET Framework to modern .NET migration](02-NET-Framework-to-modern-NET-migration.md)
3. [Monolith modernization](03-Monolith-modernization.md)
4. [Synchronous to async migration](04-Synchronous-to-async-migration.md)
5. [EF6 to EF Core awareness](05-EF6-to-EF-Core-awareness.md)
6. [WCF migration awareness](06-WCF-migration-awareness.md)
7. [Windows service to container awareness](07-Windows-service-to-container-awareness.md)
8. [ThreadPool starvation incident](08-ThreadPool-starvation-incident.md)
9. [Memory leak incident](09-Memory-leak-incident.md)
10. [LOH pressure incident](10-LOH-pressure-incident.md)
11. [Database bottleneck](11-Database-bottleneck.md)
12. [Security incident](12-Security-incident.md)
13. [Framework migration decision](13-Framework-migration-decision.md)
14. [Microservice extraction decision](14-Microservice-extraction-decision.md)
15. [Messaging adoption decision](15-Messaging-adoption-decision.md)
16. [Cloud migration awareness](16-Cloud-migration-awareness.md)
17. [Technical debt](17-Technical-debt.md)
18. [Client trade-offs](18-Client-trade-offs.md)
19. [Architecture review](19-Architecture-review.md)
20. [AI integration](20-AI-integration.md)
21. [Capstone challenge](21-Capstone-challenge.md)

---

# 2. Real-Life Analogy

Day 29 keeps the GOJ structure familiar while translating it into C# language, CLR, async, ASP.NET Core, data and production engineering.

---

# 3. Visualization

```text
Scenario → Clarify/Evidence → Baseline → Trade-Off → Migration → Measure
```

---

# 4. Mind Map

```text
Senior C#/.NET Architect Scenarios & Capstone Challenge
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

Complete migration, incident and architecture scenarios; design a production .NET platform.

---

# 8. Google Interview Drill

Capstone: design a multi-tenant enterprise platform with ASP.NET Core, SQL, object storage, async workflows and optional AI capability.

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
