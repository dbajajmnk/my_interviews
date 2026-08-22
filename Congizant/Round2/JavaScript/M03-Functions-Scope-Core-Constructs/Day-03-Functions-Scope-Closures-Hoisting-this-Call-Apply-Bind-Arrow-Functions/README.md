# Day 03 — Functions, Scope, Closures, Hoisting, this, Call/Apply/Bind & Arrow Functions

**Module:** M03 — Functions, Scope & Core Constructs  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready JavaScript mental model.

## Topic Units

1. [Function declarations](01-Function-declarations.md)
2. [Function expressions](02-Function-expressions.md)
3. [Arrow functions](03-Arrow-functions.md)
4. [First-class functions](04-First-class-functions.md)
5. [Lexical scope](05-Lexical-scope.md)
6. [Closures](06-Closures.md)
7. [Hoisting](07-Hoisting.md)
8. [Temporal dead zone](08-Temporal-dead-zone.md)
9. [var function scope](09-var-function-scope.md)
10. [let/const block scope](10-let-const-block-scope.md)
11. [this binding rules](11-this-binding-rules.md)
12. [call](12-call.md)
13. [apply](13-apply.md)
14. [bind](14-bind.md)
15. [Arrow this](15-Arrow-this.md)
16. [Rest parameters](16-Rest-parameters.md)
17. [Spread syntax](17-Spread-syntax.md)
18. [Default parameters](18-Default-parameters.md)
19. [Higher-order functions](19-Higher-order-functions.md)
20. [IIFE awareness](20-IIFE-awareness.md)

---

# 2. Real-Life Analogy

A closure is a function carrying a backpack of lexical bindings from where it was created; `this` is different—it depends on how a normal function is called.

---

# 3. Visualization

```text
Lexical Scope → Function/Closure → Call Site → this / Arguments → Result
```

---

# 4. Mind Map

```text
Functions, Scope, Closures, Hoisting, this, Call/Apply/Bind & Arrow Functions
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

Implement a rate limiter or counter factory with closures, then rewrite one callback with arrow syntax and explain the `this` behavior difference.

---

# 8. Google Interview Drill

A method is passed as a callback and loses its receiver. Diagnose `this`, then compare bind, wrapper function, and arrow-property approaches.

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
