# Day 13 — Generics, Variance, Pattern Matching, Ref Structs & Advanced C#

**Module:** M11 — Modern & Advanced Features  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [Generic classes](01-Generic-classes.md)
2. [Generic methods](02-Generic-methods.md)
3. [Constraints](03-Constraints.md)
4. [class constraint](04-class-constraint.md)
5. [struct constraint](05-struct-constraint.md)
6. [notnull constraint awareness](06-notnull-constraint-awareness.md)
7. [new() constraint](07-new-constraint.md)
8. [unmanaged constraint awareness](08-unmanaged-constraint-awareness.md)
9. [Generic variance](09-Generic-variance.md)
10. [out covariance](10-out-covariance.md)
11. [in contravariance](11-in-contravariance.md)
12. [Generic type inference](12-Generic-type-inference.md)
13. [Pattern matching](13-Pattern-matching.md)
14. [Property patterns](14-Property-patterns.md)
15. [Relational patterns awareness](15-Relational-patterns-awareness.md)
16. [List patterns awareness](16-List-patterns-awareness.md)
17. [switch expressions](17-switch-expressions.md)
18. [nameof](18-nameof.md)
19. [Caller info attributes awareness](19-Caller-info-attributes-awareness.md)
20. [Attributes](20-Attributes.md)
21. [Reflection awareness](21-Reflection-awareness.md)
22. [Span<T>](22-Span-T.md)
23. [ReadOnlySpan<T>](23-ReadOnlySpan-T.md)
24. [ref struct](24-ref-struct.md)
25. [stackalloc awareness](25-stackalloc-awareness.md)
26. [Memory<T>](26-Memory-T.md)
27. [Readonly structs](27-Readonly-structs.md)
28. [Record structs](28-Record-structs.md)
29. [Required members](29-Required-members.md)
30. [Source generators awareness](30-Source-generators-awareness.md)

---

# 2. Real-Life Analogy

Day 13 keeps the GOJ structure familiar while translating it into C# language, CLR, async, ASP.NET Core, data and production engineering.

---

# 3. Visualization

```text
Generic/Pattern/Span → compile-time safety → CLR/runtime constraints
```

---

# 4. Mind Map

```text
Generics, Variance, Pattern Matching, Ref Structs & Advanced C#
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

Build generic producer/consumer APIs, exhaustive pattern matching, and Span-aware parsing examples.

---

# 8. Google Interview Drill

Explain why Span<T> cannot be used like an ordinary heap object or captured by async/lambda.

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
