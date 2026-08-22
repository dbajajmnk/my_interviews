# Day 15 — DSA I: Arrays, Strings, Hashing, Two Pointers, Sliding Window, Stack & Queue

**Module:** M13 — Coding & DSA  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready JavaScript mental model.

## Topic Units

1. [Google problem-solving flow](01-Google-problem-solving-flow.md)
2. [Big-O](02-Big-O.md)
3. [Arrays](03-Arrays.md)
4. [Strings](04-Strings.md)
5. [Hashing](05-Hashing.md)
6. [Map for lookup](06-Map-for-lookup.md)
7. [Set for membership](07-Set-for-membership.md)
8. [Two pointers](08-Two-pointers.md)
9. [Sliding window](09-Sliding-window.md)
10. [Stack](10-Stack.md)
11. [Queue](11-Queue.md)
12. [Deque implementation choices](12-Deque-implementation-choices.md)
13. [Prefix sums awareness](13-Prefix-sums-awareness.md)
14. [Brute force to optimization](14-Brute-force-to-optimization.md)
15. [Edge-case testing](15-Edge-case-testing.md)

---

# 2. Real-Life Analogy

Two pointers and sliding windows move markers intelligently instead of rescanning every possible range.

---

# 3. Visualization

```text
Clarify → Brute Force → Repeated Work → Hash/Pointer/Window → Test/Complexity
```

---

# 4. Mind Map

```text
DSA I: Arrays, Strings, Hashing, Two Pointers, Sliding Window, Stack & Queue
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

Solve Two Sum, longest substring without repeating characters, valid parentheses, maximum window sum, and deduplication with full complexity reasoning.

---

# 8. Google Interview Drill

Solve longest substring without repeating characters. Start O(n²), derive O(n), code, test empty/repeated/Unicode assumptions, and defend the window invariant.

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
