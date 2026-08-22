# Day 04 — Struct Design, Methods, Interfaces, Embedding & Composition

**Module:** M04 — OOP / Design Model  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Go mental model.

## Topic Units

1. [Struct modeling](01-Struct-modeling.md)
2. [Methods](02-Methods.md)
3. [Value receivers](03-Value-receivers.md)
4. [Pointer receivers](04-Pointer-receivers.md)
5. [Method sets](05-Method-sets.md)
6. [Interfaces](06-Interfaces.md)
7. [Small interfaces](07-Small-interfaces.md)
8. [Interface segregation](08-Interface-segregation.md)
9. [Embedding structs](09-Embedding-structs.md)
10. [Embedding interfaces](10-Embedding-interfaces.md)
11. [Promoted methods](11-Promoted-methods.md)
12. [Composition over inheritance](12-Composition-over-inheritance.md)
13. [Constructor functions](13-Constructor-functions.md)
14. [Functional options pattern awareness](14-Functional-options-pattern-awareness.md)
15. [Encapsulation through packages](15-Encapsulation-through-packages.md)
16. [Immutable-by-convention design](16-Immutable-by-convention-design.md)
17. [Dependency injection](17-Dependency-injection.md)
18. [Behavior-oriented interfaces](18-Behavior-oriented-interfaces.md)
19. [Duck typing comparison awareness](19-Duck-typing-comparison-awareness.md)

---

# 2. Real-Life Analogy

Day 04 keeps the GOJ structure familiar while translating it into Go-native simplicity, explicit errors, ownership, concurrency, runtime, and production reasoning.

---

# 3. Visualization

```text
Consumer → Small Interface → Concrete Struct → Composition/Embedding → Behavior
```

---

# 4. Mind Map

```text
Struct Design, Methods, Interfaces, Embedding & Composition
├── Language Semantics
├── Toolchain / Runtime
├── Ownership / Resources
├── Concurrency
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

> **Concept → Go Guarantee → Runtime/OS Boundary → Ownership → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Model payment processing with small interfaces, constructor injection, embedding, and functional options.

---

# 8. Google Interview Drill

A codebase defines interfaces next to every concrete struct. Explain consumer-side interface design and when no interface is better.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Race/Profile if Needed → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Ignoring errors.
- Over-abstracting with interfaces/patterns.
- Leaking goroutines/resources.
- Using unbounded concurrency.
- Misunderstanding slice/interface nil semantics.
- Treating race-free as automatically deadlock/leak-free.
- Optimizing without pprof/trace/benchmark evidence.

---

# 10. Day-Level Best Practices

- Standard library first.
- Small consumer-owned interfaces.
- Explicit errors and context.
- Bounded concurrency.
- Clear ownership and cleanup.
- Measure runtime behavior.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does the Go spec guarantee?
3. What is runtime/compiler implementation detail?
4. What can leak, block, or race?
5. What evidence would you collect?
6. What simpler design could replace this abstraction?

---

# 12. Google-Level Follow-Ups

1. What changes under 10× concurrency?
2. What happens when the client cancels?
3. What if the downstream DB/API is saturated?
4. What if this function receives a typed-nil interface?
5. What would pprof/trace/-race show?
6. What would you change for a library vs a service?

---

# 13. Quick Revision

```text
What is it?
Why?
Who owns the resource?
What can be nil?
What can block/race/leak?
What does the runtime do?
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
- [ ] I can explain ownership/cancellation/resource behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
