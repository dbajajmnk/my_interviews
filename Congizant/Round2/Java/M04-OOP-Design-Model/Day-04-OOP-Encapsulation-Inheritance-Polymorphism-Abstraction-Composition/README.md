# Day 04 — OOP, Encapsulation, Inheritance, Polymorphism, Abstraction & Composition

**Module:** M04 — OOP / Design Model  
**Duration:** 2 Hours  
**Priority:** P0  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [classes/objects](01-classes-objects.md)
2. [encapsulation](02-encapsulation.md)
3. [constructors](03-constructors.md)
4. [inheritance](04-inheritance.md)
5. [method overriding](05-method-overriding.md)
6. [polymorphism](06-polymorphism.md)
7. [abstract classes](07-abstract-classes.md)
8. [interfaces](08-interfaces.md)
9. [composition over inheritance](09-composition-over-inheritance.md)
10. [immutability](10-immutability.md)
11. [records awareness](11-records-awareness.md)

---

# 2. Real-Life Analogy

A well-designed object is like a bank account: outsiders cannot directly rewrite the balance; they must use controlled operations that preserve rules.

---

# 3. Visualization

```text
Client → Interface → Polymorphic Implementation; Object → Encapsulated State + Invariants; Composition → Collaborators
```

---

# 4. Mind Map

```text
OOP, Encapsulation, Inheritance, Polymorphism, Abstraction & Composition
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

Model a notification system using an interface plus Email/SMS implementations. Then redesign an inheritance-heavy version using composition and compare extensibility/testability.

---

# 8. Google Interview Drill

A base class has 25 protected fields and six subclasses override lifecycle methods in fragile order. Explain the risks and propose a composition-based design with explicit collaborators.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Inheritance for code reuse only
- Public mutable fields
- God classes
- Calling overridable methods from constructors
- Breaking Liskov substitution

---

# 10. Day-Level Best Practices

- Protect invariants
- Depend on abstractions
- Prefer composition for variability
- Keep classes cohesive
- Use immutable domain values where practical

---

# 11. Interview Questions

1. Four OOP pillars?
2. Interface vs abstract class?
3. Overloading vs overriding?
4. Dynamic dispatch?
5. Why composition over inheritance?
6. How do you design an immutable class?

---

# 12. Google-Level Follow-Ups

1. What changes with sealed classes?
2. When is inheritance actually the best choice?
3. How do records support value modeling?
4. What is covariance in overridden return types?

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
