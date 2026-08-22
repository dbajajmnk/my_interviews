# Day 03 — Methods, Scope, Parameters, Varargs, Lambdas & Functional Interfaces

**Module:** M03 — Functions, Scope & Core Constructs  
**Duration:** 2 Hours  
**Priority:** P0  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [method signature](01-method-signature.md)
2. [overloading](02-overloading.md)
3. [parameter passing](03-parameter-passing.md)
4. [scope/lifetime](04-scope-lifetime.md)
5. [varargs](05-varargs.md)
6. [static vs instance](06-static-vs-instance.md)
7. [lambda expressions](07-lambda-expressions.md)
8. [functional interfaces](08-functional-interfaces.md)
9. [method references](09-method-references.md)
10. [effectively final capture](10-effectively-final-capture.md)

---

# 2. Real-Life Analogy

A method is a service counter with a defined input/output contract; a lambda is a small instruction card you hand to the counter to customize one piece of behavior.

---

# 3. Visualization

```text
Caller → Method Contract → Parameters/Scope → Behavior; Functional Interface → Lambda/Method Reference
```

---

# 4. Mind Map

```text
Methods, Scope, Parameters, Varargs, Lambdas & Functional Interfaces
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

Implement reusable validators using lambdas and method references. Add overloaded utility methods and explain exactly which overload is selected for primitive, wrapper, and null arguments.

---

# 8. Google Interview Drill

A utility class has eight overloaded methods and callers are ambiguous after a new overload is added. Refactor toward clearer domain APIs and explain when overloading helps vs harms maintainability.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Thinking return type participates in overload resolution
- Mutating captured local variables
- Overusing static utility methods
- Using varargs where collection is clearer
- Creating ambiguous overloads involving wrappers/null

---

# 10. Day-Level Best Practices

- Keep method contracts narrow
- Prefer domain names over clever overload sets
- Use lambdas for behavior injection
- Use functional interfaces deliberately
- Keep side effects visible

---

# 11. Interview Questions

1. Overloading vs overriding?
2. How does Java pass parameters?
3. What is effectively final?
4. What is a functional interface?
5. Lambda vs anonymous class?
6. When is method reference useful?

---

# 12. Google-Level Follow-Ups

1. How does lambda `this` differ from anonymous class `this`?
2. What checked-exception problem appears with standard functional interfaces?
3. How does overload resolution interact with lambdas?

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
