# Day 04 — Objects, Prototypes, Classes, Inheritance, Composition & Property Model

**Module:** M04 — OOP / Design Model  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready JavaScript mental model.

## Topic Units

1. [Object literals](01-Object-literals.md)
2. [Prototype chain](02-Prototype-chain.md)
3. [Object.create](03-Object-create.md)
4. [Constructor functions awareness](04-Constructor-functions-awareness.md)
5. [class syntax](05-class-syntax.md)
6. [extends and super](06-extends-and-super.md)
7. [Method overriding](07-Method-overriding.md)
8. [Composition over inheritance](08-Composition-over-inheritance.md)
9. [Private fields](09-Private-fields.md)
10. [Static fields and methods](10-Static-fields-and-methods.md)
11. [Getters and setters](11-Getters-and-setters.md)
12. [Property descriptors](12-Property-descriptors.md)
13. [Enumerable/configurable/writable](13-Enumerable-configurable-writable.md)
14. [Object.freeze awareness](14-Object-freeze-awareness.md)
15. [Encapsulation](15-Encapsulation.md)
16. [Polymorphism in JavaScript](16-Polymorphism-in-JavaScript.md)

---

# 2. Real-Life Analogy

JavaScript objects are a chain of delegation: if an object does not have a property, it asks its prototype, then that prototype's prototype, and so on.

---

# 3. Visualization

```text
Object → Own Properties → Prototype Chain → Class/Composition → Behavior
```

---

# 4. Mind Map

```text
Objects, Prototypes, Classes, Inheritance, Composition & Property Model
├── Language / Runtime Semantics
├── Syntax / APIs
├── Internal Working
├── Browser / Node Boundary
├── Failure / Edge Cases
├── Debugging
├── Code Review
├── AI Evaluation
├── Production Usage
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

```text
00–15 min  Rapid recall / topic scan
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

For broad days, cover P1 topics at awareness depth first. Do not sacrifice P0 correctness for low-value trivia.

---

# 6. Engineering Integration

For today's topics, connect:

> **Concept → ECMAScript Guarantee → Browser/Node/Engine Boundary → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Model payment processors using classes and composition. Inspect the prototype chain and property descriptors in the console.

---

# 8. Google Interview Drill

A legacy codebase uses deep prototype inheritance and mutates shared prototype state. Explain the bug and redesign with composition.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Mixing ECMAScript language semantics with browser/Node host APIs.
- Memorizing output without being able to derive it.
- Hiding async behavior or mutation.
- Adding framework/package complexity before the language/runtime model is clear.
- Ignoring failure, security, or production observability.

---

# 10. Day-Level Best Practices

- Explain semantics before framework behavior.
- Use explicit, readable JavaScript.
- Keep async ownership, cancellation, and errors visible.
- Prefer measured evidence over performance folklore.
- Keep security boundaries deterministic.
- Use Evidence First / No Bluff in project discussion.

---

# 11. Interview Questions

1. Explain the three most important concepts from today in 60 seconds each.
2. Show one runnable example and predict its output before executing.
3. What is one production failure caused by misunderstanding today's topic?
4. What is one code-review smell?
5. What is one AI-generated-code risk?
6. What trade-off would make you choose a different design?

---

# 12. Google-Level Follow-Ups

1. What changes in browser vs Node.js?
2. What changes under 10× traffic or data size?
3. What if the operation becomes asynchronous?
4. What if input is attacker-controlled?
5. What would you measure in production?
6. What would you change if the runtime/framework version differs?

---

# 13. Quick Revision

```text
What is it?
Why?
What does ECMAScript guarantee?
What is host/engine specific?
Show code.
What breaks?
How do I debug it?
What do I review?
How do I evaluate AI-generated code?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization without notes.
- [ ] I completed the hands-on exercise.
- [ ] I completed the Google drill.
- [ ] I can answer follow-ups without restarting my solution.
- [ ] I can separate ECMAScript vs host/runtime behavior.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topic files.
