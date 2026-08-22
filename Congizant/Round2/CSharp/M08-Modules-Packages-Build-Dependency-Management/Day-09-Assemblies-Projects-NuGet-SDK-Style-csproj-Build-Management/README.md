# Day 09 — Assemblies, Projects, NuGet, SDK-Style csproj & Build Management

**Module:** M08 — Modules, Packages, Build & Dependency Management  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [Assemblies](01-Assemblies.md)
2. [Namespaces vs assemblies](02-Namespaces-vs-assemblies.md)
3. [SDK-style projects](03-SDK-style-projects.md)
4. [csproj](04-csproj.md)
5. [Target frameworks](05-Target-frameworks.md)
6. [Target framework monikers](06-Target-framework-monikers.md)
7. [Project references](07-Project-references.md)
8. [Package references](08-Package-references.md)
9. [NuGet](09-NuGet.md)
10. [Package restore](10-Package-restore.md)
11. [Package lock awareness](11-Package-lock-awareness.md)
12. [Central package management awareness](12-Central-package-management-awareness.md)
13. [Semantic versioning](13-Semantic-versioning.md)
14. [Transitive dependencies](14-Transitive-dependencies.md)
15. [PrivateAssets awareness](15-PrivateAssets-awareness.md)
16. [Build configurations](16-Build-configurations.md)
17. [Debug vs Release](17-Debug-vs-Release.md)
18. [MSBuild awareness](18-MSBuild-awareness.md)
19. [Directory.Build.props awareness](19-Directory-Build-props-awareness.md)
20. [Solution files awareness](20-Solution-files-awareness.md)
21. [Multi-project solutions](21-Multi-project-solutions.md)
22. [InternalsVisibleTo awareness](22-InternalsVisibleTo-awareness.md)
23. [Strong naming awareness](23-Strong-naming-awareness.md)
24. [Trimming awareness](24-Trimming-awareness.md)
25. [AOT awareness](25-AOT-awareness.md)
26. [Dependency supply-chain risk](26-Dependency-supply-chain-risk.md)

---

# 2. Real-Life Analogy

Day 09 keeps the GOJ structure familiar while translating it into C# language, CLR, async, ASP.NET Core, data and production engineering.

---

# 3. Visualization

```text
Project/Package → Restore/MSBuild → Assembly → Runtime
```

---

# 4. Mind Map

```text
Assemblies, Projects, NuGet, SDK-Style csproj & Build Management
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

Create a multi-project solution with project/package references and reproducible restore/build.

---

# 8. Google Interview Drill

A package works in one project but fails at runtime in another due to target-framework/dependency mismatch. Diagnose systematically.

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
