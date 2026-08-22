# Day 05 — SOLID, DRY, KIS, YAGNI, Cohesion/Coupling & GoF Creational/Structural Patterns

**Module:** M05 — Design Principles & Gang of Four Patterns  
**Duration:** 2 Hours  
**Priority:** P0  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [Single Responsibility Principle (SRP)](01-Single-Responsibility-Principle-SRP.md)
2. [Open/Closed Principle (OCP)](02-Open-Closed-Principle-OCP.md)
3. [Liskov Substitution Principle (LSP)](03-Liskov-Substitution-Principle-LSP.md)
4. [Interface Segregation Principle (ISP)](04-Interface-Segregation-Principle-ISP.md)
5. [Dependency Inversion Principle (DIP)](05-Dependency-Inversion-Principle-DIP.md)
6. [DRY](06-DRY.md)
7. [KIS](07-KIS.md)
8. [YAGNI](08-YAGNI.md)
9. [cohesion/coupling](09-cohesion-coupling.md)
10. [dependency inversion](10-dependency-inversion.md)
11. [composition](11-composition.md)
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

---

# 2. Real-Life Analogy

Design patterns are like architectural blueprints for recurring building problems: useful when the same forces exist, wasteful when copied into the wrong building.

---

# 3. Visualization

```text
Change Pressure → Principle → Stable Abstraction → Concrete Variation; GoF: Creational | Structural
```

---

# 4. Mind Map

```text
SOLID, DRY, KIS, YAGNI, Cohesion/Coupling & GoF Creational/Structural Patterns
├── Topic Units
├── Java Semantics
├── Runtime / Internal Working
├── Implementation
├── Debugging
├── Code Review
├── AI Evaluation
├── Production Usage
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

Use the 2-hour boundary strictly:

```text
00–15 min  Rapid topic recall / skim
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

For broad days, P1 subtopics receive awareness depth first. Do not sacrifice P0 correctness to memorize low-value trivia.

---

# 6. Engineering Integration

For the whole day, be able to connect:

> **Concept → Java Guarantee → JVM/Framework Behavior → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Take a service that directly constructs DB, cache, and HTTP clients. Refactor using DIP. Then identify one real use case each for Builder, Adapter, Decorator, Facade, and Proxy.

---

# 8. Google Interview Drill

You are shown a 500-line `OrderService`. Break responsibilities into cohesive collaborators and justify which patterns help. Reject patterns that add ceremony without solving a change axis.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Treating SOLID as rigid rules
- Pattern-first design
- Singleton for global mutable state
- Factory wrapping trivial constructors
- DRY applied before duplication is understood

---

# 10. Day-Level Best Practices

- Use principles to reduce change cost
- Choose patterns from forces/trade-offs
- Keep abstractions narrow
- Prefer composition
- Refactor toward cohesion

---

# 11. Interview Questions

1. Explain SOLID with Java examples.
2. Factory Method vs Abstract Factory?
3. Builder vs telescoping constructor?
4. Adapter vs Facade?
5. Decorator vs Proxy?
6. Why can Singleton hurt testing?

---

# 12. Google-Level Follow-Ups

1. Where would Spring DI fit relative to DIP?
2. How do Java records affect Builder use?
3. When would Flyweight matter?
4. Bridge vs Strategy?

---

# 13. Quick Revision

```text
What is it?
Why use it?
What does Java guarantee?
How does it work internally?
Show code.
What breaks?
How do you debug it?
What do you review?
How would you evaluate AI-generated code?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can draw/explain today's visualization without notes.
- [ ] I completed the hands-on task.
- [ ] I completed the Google drill.
- [ ] I can answer the interview questions with concise senior-level reasoning.
- [ ] I can survive at least two follow-up changes.
- [ ] I did not invent project experience or metrics.

**DAY READY:** 80%+ and no P0 topic failure.  
**DAY REPAIR:** Reopen only failed topic files.
