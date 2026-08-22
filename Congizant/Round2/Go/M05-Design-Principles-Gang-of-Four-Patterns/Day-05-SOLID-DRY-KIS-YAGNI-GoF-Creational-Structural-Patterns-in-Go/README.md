# Day 05 — SOLID, DRY, KIS, YAGNI & GoF Creational/Structural Patterns in Go

**Module:** M05 — Design Principles & Gang of Four Patterns  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Go mental model.

## Topic Units

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

---

# 2. Real-Life Analogy

Day 05 keeps the GOJ structure familiar while translating it into Go-native simplicity, explicit errors, ownership, concurrency, runtime, and production reasoning.

---

# 3. Visualization

```text
Change Pressure → Principle/Pattern → Go Function/Interface/Composition → Trade-Off
```

---

# 4. Mind Map

```text
SOLID, DRY, KIS, YAGNI & GoF Creational/Structural Patterns in Go
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

Refactor a service that constructs concrete dependencies; implement Go-native Factory, Builder-like options, Adapter, Decorator, Facade and Proxy examples.

---

# 8. Google Interview Drill

Review a Go service full of class-style patterns and remove abstractions that functions/interfaces/composition make unnecessary.

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
