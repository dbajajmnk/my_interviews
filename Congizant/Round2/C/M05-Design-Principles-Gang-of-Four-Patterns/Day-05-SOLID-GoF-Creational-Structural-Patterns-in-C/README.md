# Day 05 — SOLID & GoF Creational/Structural Patterns in C

**Module:** M05 — Design Principles & Gang of Four Patterns  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [Single Responsibility Principle (SRP)](01-Single-Responsibility-Principle-SRP.md)
2. [Open/Closed Principle (OCP)](02-Open-Closed-Principle-OCP.md)
3. [Liskov Substitution Principle (LSP)](03-Liskov-Substitution-Principle-LSP.md)
4. [Interface Segregation Principle (ISP)](04-Interface-Segregation-Principle-ISP.md)
5. [Dependency Inversion Principle (DIP)](05-Dependency-Inversion-Principle-DIP.md)
6. [DRY](06-DRY.md)
7. [KIS](07-KIS.md)
8. [YAGNI](08-YAGNI.md)
9. [Cohesion and coupling](09-Cohesion-and-coupling.md)
10. [Dependency inversion](10-Dependency-inversion.md)
11. [Composition](11-Composition.md)
12. [Factory Method](12-Factory-Method.md)
13. [Abstract Factory](13-Abstract-Factory.md)
14. [Builder](14-Builder.md)
15. [Prototype](15-Prototype.md)
16. [Singleton](16-Singleton.md)
17. [Adapter](17-Adapter.md)
18. [Bridge](18-Bridge.md)
19. [Composite](19-Composite.md)
20. [Decorator](20-Decorator.md)
21. [Facade](21-Facade.md)
22. [Flyweight](22-Flyweight.md)
23. [Proxy](23-Proxy.md)
24. [Pattern trade-off defense](24-Pattern-trade-off-defense.md)

# 2. Real-Life Analogy

Day 05 translates the locked GOJ structure into C-native bounds, ownership, memory, systems and production reasoning.

# 3. Visualization

```text
Change → Principle/Pattern → Struct/Callback/Module → Trade-Off
```

# 4. Mind Map

```text
SOLID & GoF Creational/Structural Patterns in C
├── C Semantics
├── Bounds / Integers / Pointers
├── Ownership / Storage Duration
├── Toolchain / OS
├── Concurrency
├── Failure / UB
├── Debugging / Security
└── Interview Defense
```

# 5. Two-Hour Execution Plan

```text
00–15  Rapid recall
15–55  P0 topics
55–85  Hands-on/debugging
85–105 Google drill
105–115 Follow-ups
115–120 Readiness gate
```

# 6. Engineering Integration

> **Concept → C Guarantee → Bounds/Ownership → Compiler/OS Boundary → Failure/UB → Evidence → Review Rule → Trade-Off**

# 7. Hands-On Integration

Refactor global/hard-coded dependencies and implement procedural pattern examples.

# 8. Google Interview Drill

Explain which patterns map naturally to C and which should stay conceptual.

# 9. Day-Level Common Mistakes

- Pointer/array confusion.
- Missing bounds and cleanup.
- Signed/unsigned mistakes.
- UB and volatile misuse.
- Unsafe string handling.
- Optimizing without evidence.

# 10. Day-Level Best Practices

Explicit sizes, ownership, strong warnings, structured cleanup, sanitizers/fuzzing, correct synchronization, portable representations, Evidence First / No Bluff.

# 11. Interview Questions

Explain three key topics, one failure, one debugging artifact, one production use, and one safer alternative.

# 12. Google-Level Follow-Ups

What changes on another compiler/architecture, under concurrency, for untrusted input, under optimization, or if a safer language is allowed?

# 13. Quick Revision

```text
What is it?
What is the type/size?
Who owns it?
What is the lifetime/capacity?
What can be NULL/overflow/out-of-bounds?
How is cleanup guaranteed?
What tool proves failure?
```

# 14. Day Readiness Gate

- [ ] Every P0 topic READY.
- [ ] Hands-on complete.
- [ ] Drill complete.
- [ ] Bounds/ownership/lifetime explainable.
- [ ] Two follow-up changes survivable.
- [ ] No invented evidence.

**DAY READY:** 80%+ and no P0 failure.
