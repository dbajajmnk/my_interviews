# Day 01 — C# Ecosystem, .NET, Syntax, Projects & Core Execution

**Module:** M01 — Language Foundations  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [C# language overview](01-C-language-overview.md)
2. [.NET runtime overview](02-NET-runtime-overview.md)
3. [.NET SDK](03-NET-SDK.md)
4. [dotnet CLI](04-dotnet-CLI.md)
5. [dotnet new](05-dotnet-new.md)
6. [dotnet build](06-dotnet-build.md)
7. [dotnet run](07-dotnet-run.md)
8. [Namespaces](08-Namespaces.md)
9. [using directives](09-using-directives.md)
10. [Top-level statements awareness](10-Top-level-statements-awareness.md)
11. [Variables](11-Variables.md)
12. [var](12-var.md)
13. [Constants](13-Constants.md)
14. [readonly awareness](14-readonly-awareness.md)
15. [Operators](15-Operators.md)
16. [if](16-if.md)
17. [switch](17-switch.md)
18. [switch expressions](18-switch-expressions.md)
19. [for](19-for.md)
20. [foreach](20-foreach.md)
21. [while](21-while.md)
22. [do-while](22-do-while.md)
23. [Pattern matching awareness](23-Pattern-matching-awareness.md)
24. [Coding conventions](24-Coding-conventions.md)
25. [Nullable context awareness](25-Nullable-context-awareness.md)

---

# 2. Real-Life Analogy

C# is the language, .NET is the platform/runtime/tooling ecosystem, and ASP.NET Core/EF Core are frameworks on top—like grammar, operating system, and application framework layers.

---

# 3. Visualization

```text
C# Source → Compiler → IL/Assembly → CLR → OS
```

---

# 4. Mind Map

```text
C# Ecosystem, .NET, Syntax, Projects & Core Execution
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

Build a small console app using the dotnet CLI, namespaces, loops, switch expressions and basic project structure.

---

# 8. Google Interview Drill

A candidate says C# and .NET are the same thing. Separate language, runtime, SDK and framework responsibilities.

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
