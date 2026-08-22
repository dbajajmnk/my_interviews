# Day 13 — Generators, Iterators, Proxy, Reflect, Symbols & Advanced Language Features

**Module:** M11 — Modern & Advanced Features  
**Duration:** 2 Hours  
**Priority:** P1

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready JavaScript mental model.

## Topic Units

1. [Generator functions](01-Generator-functions.md)
2. [yield](02-yield.md)
3. [Custom iterables](03-Custom-iterables.md)
4. [Symbol.iterator](04-Symbol-iterator.md)
5. [Well-known symbols awareness](05-Well-known-symbols-awareness.md)
6. [Proxy](06-Proxy.md)
7. [Reflect](07-Reflect.md)
8. [Meta-programming trade-offs](08-Meta-programming-trade-offs.md)
9. [Property access traps](09-Property-access-traps.md)
10. [Optional chaining](10-Optional-chaining.md)
11. [Nullish coalescing](11-Nullish-coalescing.md)
12. [Logical assignment operators](12-Logical-assignment-operators.md)
13. [Private class fields](13-Private-class-fields.md)
14. [Static initialization blocks awareness](14-Static-initialization-blocks-awareness.md)
15. [Top-level await awareness](15-Top-level-await-awareness.md)
16. [Structured cloning awareness](16-Structured-cloning-awareness.md)

---

# 2. Real-Life Analogy

Proxy/Reflect/generators are power tools: useful for framework-like problems, dangerous when they hide ordinary behavior.

---

# 3. Visualization

```text
Object/Iterable → Proxy/Reflect/Generator → Meta/Lazy Behavior → Trade-Off
```

---

# 4. Mind Map

```text
Generators, Iterators, Proxy, Reflect, Symbols & Advanced Language Features
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

Build a custom iterable and a validation/logging Proxy. Then identify when explicit functions/classes are clearer than meta-programming.

---

# 8. Google Interview Drill

A framework uses Proxy-based lazy objects. Explain how traps work, what can surprise debuggers, and why transparent meta-programming has limits.

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
