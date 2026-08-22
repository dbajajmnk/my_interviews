# Day 01 — JavaScript Ecosystem, Runtimes, Syntax, Strict Mode & Execution

**Module:** M01 — Language Foundations  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready JavaScript mental model.

## Topic Units

1. [JavaScript vs ECMAScript](01-JavaScript-vs-ECMAScript.md)
2. [Browser vs Node.js runtime](02-Browser-vs-Node-js-runtime.md)
3. [JavaScript engines](03-JavaScript-engines.md)
4. [Source parsing and execution](04-Source-parsing-and-execution.md)
5. [Statements and expressions](05-Statements-and-expressions.md)
6. [Variables with let/const/var](06-Variables-with-let-const-var.md)
7. [Operators](07-Operators.md)
8. [Control flow](08-Control-flow.md)
9. [Strict mode](09-Strict-mode.md)
10. [Automatic semicolon insertion awareness](10-Automatic-semicolon-insertion-awareness.md)
11. [Truthy and falsy values](11-Truthy-and-falsy-values.md)
12. [Coding conventions](12-Coding-conventions.md)

---

# 2. Real-Life Analogy

ECMAScript is the grammar of the language; browser and Node.js are different cities that provide different public services around that same language.

---

# 3. Visualization

```text
ECMAScript Source → Engine → Host Runtime (Browser / Node.js) → APIs / I/O
```

---

# 4. Mind Map

```text
JavaScript Ecosystem, Runtimes, Syntax, Strict Mode & Execution
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

Build a small CLI or browser script that accepts input, validates it, applies branching and loops, and explains why `const` does not make an object deeply immutable.

---

# 8. Google Interview Drill

A script behaves differently between a browser and Node.js. Explain which capabilities come from ECMAScript and which come from the host runtime before changing the code.

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
