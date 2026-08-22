# Day 15 — DSA I: Slices, Strings, Hashing, Two Pointers, Sliding Window & Stacks

**Module:** M13 — Coding & DSA  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Go mental model.

## Topic Units

1. [Google problem-solving flow](01-Google-problem-solving-flow.md)
2. [Big-O](02-Big-O.md)
3. [Slices](03-Slices.md)
4. [Strings](04-Strings.md)
5. [Bytes vs runes in algorithms](05-Bytes-vs-runes-in-algorithms.md)
6. [Maps for hashing](06-Maps-for-hashing.md)
7. [Sets with map[T]struct{}](07-Sets-with-map-T-struct.md)
8. [Two pointers](08-Two-pointers.md)
9. [Sliding window](09-Sliding-window.md)
10. [Stack with slice](10-Stack-with-slice.md)
11. [Queue with slice pitfalls](11-Queue-with-slice-pitfalls.md)
12. [ArrayDeque equivalent patterns awareness](12-ArrayDeque-equivalent-patterns-awareness.md)
13. [Prefix sums awareness](13-Prefix-sums-awareness.md)
14. [Brute force to optimization](14-Brute-force-to-optimization.md)
15. [Edge cases](15-Edge-cases.md)
16. [Complexity communication](16-Complexity-communication.md)

---

# 2. Real-Life Analogy

Day 15 keeps the GOJ structure familiar while translating it into Go-native simplicity, explicit errors, ownership, concurrency, runtime, and production reasoning.

---

# 3. Visualization

```text
Clarify → Brute Force → Map/Two Pointer/Window → Test → Complexity
```

---

# 4. Mind Map

```text
DSA I: Slices, Strings, Hashing, Two Pointers, Sliding Window & Stacks
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

Solve Two Sum, longest substring, valid parentheses and a sliding-window problem in Go.

---

# 8. Google Interview Drill

Solve longest substring without repeating characters and discuss byte vs rune semantics.

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
