# Day 04 — Classes, Records, Interfaces, Inheritance, Composition & Domain Modeling

**Module:** M04 — OOP / Design Model  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [Classes](01-Classes.md)
2. [Constructors](02-Constructors.md)
3. [Primary constructors awareness](03-Primary-constructors-awareness.md)
4. [Properties](04-Properties.md)
5. [Auto-properties](05-Auto-properties.md)
6. [init-only setters](06-init-only-setters.md)
7. [Required members awareness](07-Required-members-awareness.md)
8. [Fields](08-Fields.md)
9. [readonly fields](09-readonly-fields.md)
10. [Static members](10-Static-members.md)
11. [Accessibility modifiers](11-Accessibility-modifiers.md)
12. [Interfaces](12-Interfaces.md)
13. [Abstract classes](13-Abstract-classes.md)
14. [Inheritance](14-Inheritance.md)
15. [Virtual methods](15-Virtual-methods.md)
16. [Override](16-Override.md)
17. [Sealed classes](17-Sealed-classes.md)
18. [Sealed overrides awareness](18-Sealed-overrides-awareness.md)
19. [Composition over inheritance](19-Composition-over-inheritance.md)
20. [Records](20-Records.md)
21. [Record classes](21-Record-classes.md)
22. [Record structs awareness](22-Record-structs-awareness.md)
23. [with expressions](23-with-expressions.md)
24. [Object initializers](24-Object-initializers.md)
25. [Collection initializers](25-Collection-initializers.md)
26. [Encapsulation](26-Encapsulation.md)
27. [Dependency injection](27-Dependency-injection.md)
28. [Domain modeling](28-Domain-modeling.md)
29. [Immutability](29-Immutability.md)

---

# 2. Real-Life Analogy

Day 04 keeps the GOJ structure familiar while translating it into C# language, CLR, async, ASP.NET Core, data and production engineering.

---

# 3. Visualization

```text
Domain → Record/Class/Struct/Interface → Composition/DI → Behavior
```

---

# 4. Mind Map

```text
Classes, Records, Interfaces, Inheritance, Composition & Domain Modeling
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

Model an order domain using records/value objects, interfaces, composition and DI.

---

# 8. Google Interview Drill

Compare record, class and struct choices for a money/value object and defend the trade-offs.

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
