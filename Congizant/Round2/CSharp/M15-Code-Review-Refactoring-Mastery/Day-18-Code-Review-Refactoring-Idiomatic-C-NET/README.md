# Day 18 — Code Review, Refactoring & Idiomatic C#/.NET

**Module:** M15 — Code Review & Refactoring Mastery  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [Risk-first code review](01-Risk-first-code-review.md)
2. [Correctness](02-Correctness.md)
3. [Nullability review](03-Nullability-review.md)
4. [Async correctness](04-Async-correctness.md)
5. [Cancellation review](05-Cancellation-review.md)
6. [Thread safety](06-Thread-safety.md)
7. [IDisposable ownership](07-IDisposable-ownership.md)
8. [LINQ multiple enumeration](08-LINQ-multiple-enumeration.md)
9. [Allocation review](09-Allocation-review.md)
10. [API contracts](10-API-contracts.md)
11. [Large classes](11-Large-classes.md)
12. [Boolean flags](12-Boolean-flags.md)
13. [Inheritance abuse](13-Inheritance-abuse.md)
14. [Service locator anti-pattern awareness](14-Service-locator-anti-pattern-awareness.md)
15. [Static mutable state](15-Static-mutable-state.md)
16. [Overuse of reflection](16-Overuse-of-reflection.md)
17. [Premature abstraction](17-Premature-abstraction.md)
18. [Refactoring](18-Refactoring.md)
19. [Characterization tests](19-Characterization-tests.md)
20. [Naming](20-Naming.md)
21. [Public API compatibility](21-Public-API-compatibility.md)
22. [Technical debt prioritization](22-Technical-debt-prioritization.md)
23. [Analyzer warnings awareness](23-Analyzer-warnings-awareness.md)
24. [Style vs correctness](24-Style-vs-correctness.md)

---

# 2. Real-Life Analogy

Day 18 keeps the GOJ structure familiar while translating it into C# language, CLR, async, ASP.NET Core, data and production engineering.

---

# 3. Visualization

```text
Requirement → correctness/null/async/resource → API → tests → maintainability
```

---

# 4. Mind Map

```text
Code Review, Refactoring & Idiomatic C#/.NET
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

Review a flawed .NET service with async void, .Result, IDisposable leaks, mutable statics and repeated LINQ enumeration.

---

# 8. Google Interview Drill

Rank blockers vs suggestions in a 20-minute PR review.

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
