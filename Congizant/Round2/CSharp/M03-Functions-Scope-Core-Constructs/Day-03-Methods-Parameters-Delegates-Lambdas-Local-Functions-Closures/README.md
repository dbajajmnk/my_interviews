# Day 03 — Methods, Parameters, Delegates, Lambdas, Local Functions & Closures

**Module:** M03 — Functions, Scope & Core Constructs  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [Methods](01-Methods.md)
2. [Expression-bodied members](02-Expression-bodied-members.md)
3. [Method overloading](03-Method-overloading.md)
4. [Optional parameters](04-Optional-parameters.md)
5. [Named arguments](05-Named-arguments.md)
6. [params](06-params.md)
7. [ref parameters](07-ref-parameters.md)
8. [out parameters](08-out-parameters.md)
9. [in parameters](09-in-parameters.md)
10. [Return by ref awareness](10-Return-by-ref-awareness.md)
11. [Local functions](11-Local-functions.md)
12. [Delegates](12-Delegates.md)
13. [Action](13-Action.md)
14. [Func](14-Func.md)
15. [Predicate awareness](15-Predicate-awareness.md)
16. [Lambdas](16-Lambdas.md)
17. [Closures](17-Closures.md)
18. [Captured variables](18-Captured-variables.md)
19. [Method groups](19-Method-groups.md)
20. [Events awareness](20-Events-awareness.md)
21. [Extension methods](21-Extension-methods.md)
22. [Generic methods](22-Generic-methods.md)
23. [Tuples](23-Tuples.md)
24. [Deconstruction](24-Deconstruction.md)
25. [Default interface methods awareness](25-Default-interface-methods-awareness.md)

---

# 2. Real-Life Analogy

Day 03 keeps the GOJ structure familiar while translating it into C# language, CLR, async, ASP.NET Core, data and production engineering.

---

# 3. Visualization

```text
Method → Delegate/Lambda/Closure → Extension/Generic → Result
```

---

# 4. Mind Map

```text
Methods, Parameters, Delegates, Lambdas, Local Functions & Closures
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

Implement validation and transformation pipelines with delegates/lambdas/extensions, and demonstrate closure capture.

---

# 8. Google Interview Drill

A loop variable is captured by lambdas and produces surprising output. Explain the capture semantics and safe alternatives.

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
