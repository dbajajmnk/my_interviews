# Day 02 — C# Type System, Value/Reference Types, Nullable, Boxing & Equality

**Module:** M02 — Language Model & Type System  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [Static typing](01-Static-typing.md)
2. [Type inference with var](02-Type-inference-with-var.md)
3. [Built-in numeric types](03-Built-in-numeric-types.md)
4. [bool](04-bool.md)
5. [char](05-char.md)
6. [string](06-string.md)
7. [object](07-object.md)
8. [dynamic awareness](08-dynamic-awareness.md)
9. [Value types](09-Value-types.md)
10. [Reference types](10-Reference-types.md)
11. [Stack vs heap myth correction](11-Stack-vs-heap-myth-correction.md)
12. [struct](12-struct.md)
13. [class](13-class.md)
14. [enum](14-enum.md)
15. [record awareness](15-record-awareness.md)
16. [Nullable value types](16-Nullable-value-types.md)
17. [Nullable reference types](17-Nullable-reference-types.md)
18. [Null-forgiving operator awareness](18-Null-forgiving-operator-awareness.md)
19. [Null-coalescing operator](19-Null-coalescing-operator.md)
20. [Null-conditional operator](20-Null-conditional-operator.md)
21. [Boxing](21-Boxing.md)
22. [Unboxing](22-Unboxing.md)
23. [Conversions](23-Conversions.md)
24. [Implicit conversions](24-Implicit-conversions.md)
25. [Explicit casts](25-Explicit-casts.md)
26. [is](26-is.md)
27. [as](27-as.md)
28. [Pattern matching](28-Pattern-matching.md)
29. [Equality ==](29-Equality.md)
30. [ReferenceEquals](30-ReferenceEquals.md)
31. [Equals](31-Equals.md)
32. [GetHashCode contract](32-GetHashCode-contract.md)

---

# 2. Real-Life Analogy

Value and reference semantics describe what gets copied, while GC decides object lifetime; neither can be reduced to 'stack vs heap'.

---

# 3. Visualization

```text
Value → Value/Reference Type → Nullable/Boxing/Equality → Correct Semantics
```

---

# 4. Mind Map

```text
C# Type System, Value/Reference Types, Nullable, Boxing & Equality
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

Create examples for value/reference behavior, nullable reference types, boxing, equality and record/class comparisons.

---

# 8. Google Interview Drill

A production bug comes from using a mutable object as a dictionary key. Explain equality/hash-code requirements.

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
