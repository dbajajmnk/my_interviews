# Day 02 — JavaScript Types, Coercion, Equality, Objects & Value Semantics

**Module:** M02 — Language Model & Type System  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready JavaScript mental model.

## Topic Units

1. [Primitive types](01-Primitive-types.md)
2. [undefined vs null](02-undefined-vs-null.md)
3. [Number and IEEE-754](03-Number-and-IEEE-754.md)
4. [BigInt](04-BigInt.md)
5. [String](05-String.md)
6. [Boolean](06-Boolean.md)
7. [Symbol](07-Symbol.md)
8. [Objects and references](08-Objects-and-references.md)
9. [Dynamic typing](09-Dynamic-typing.md)
10. [Type coercion](10-Type-coercion.md)
11. [Abstract equality vs strict equality](11-Abstract-equality-vs-strict-equality.md)
12. [Object.is](12-Object-is.md)
13. [NaN](13-NaN.md)
14. [Wrapper objects](14-Wrapper-objects.md)
15. [typeof quirks](15-typeof-quirks.md)
16. [Property keys](16-Property-keys.md)
17. [Immutability awareness](17-Immutability-awareness.md)

---

# 2. Real-Life Analogy

JavaScript values are like labeled objects on a desk: some labels hold values directly, while object variables point to shared boxes; coercion is the language automatically converting labels before an operation.

---

# 3. Visualization

```text
Value → Type Semantics → Coercion/Equality → Object Identity → Correct Contract
```

---

# 4. Mind Map

```text
JavaScript Types, Coercion, Equality, Objects & Value Semantics
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

Create an output-prediction sheet for coercion/equality/NaN/object identity and verify every result in a real runtime. Explain each answer from the language model, not folklore.

---

# 8. Google Interview Drill

An API bug is caused by `'0'`, `0`, `false`, and empty strings being treated inconsistently. Redesign validation to avoid implicit coercion.

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
