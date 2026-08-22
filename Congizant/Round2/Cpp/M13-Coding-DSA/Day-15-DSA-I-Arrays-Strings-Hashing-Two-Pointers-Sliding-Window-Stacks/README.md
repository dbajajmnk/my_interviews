# Day 15 — DSA I: Arrays, Strings, Hashing, Two Pointers, Sliding Window & Stacks

**Module:** M13 — Coding & DSA  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [Google problem-solving flow](01-Google-problem-solving-flow.md)
2. [Big-O](02-Big-O.md)
3. [std::vector](03-std-vector.md)
4. [std::string](04-std-string.md)
5. [std::string_view awareness](05-std-string-view-awareness.md)
6. [unordered_map for hashing](06-unordered-map-for-hashing.md)
7. [unordered_set membership](07-unordered-set-membership.md)
8. [Two pointers](08-Two-pointers.md)
9. [Sliding window](09-Sliding-window.md)
10. [std::stack](10-std-stack.md)
11. [std::queue](11-std-queue.md)
12. [std::deque](12-std-deque.md)
13. [Prefix sums awareness](13-Prefix-sums-awareness.md)
14. [Brute force to optimization](14-Brute-force-to-optimization.md)
15. [Edge cases](15-Edge-cases.md)
16. [Complexity communication](16-Complexity-communication.md)
17. [Iterator safety](17-Iterator-safety.md)

---

# 2. Real-Life Analogy

Day 15 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
Clarify → Brute Force → Hash/Two Pointer/Window → Test → Complexity
```

---

# 4. Mind Map

```text
DSA I: Arrays, Strings, Hashing, Two Pointers, Sliding Window & Stacks
├── Language Semantics
├── Lifetime / Ownership
├── Compiler / Linker / Runtime
├── Concurrency / Memory Model
├── Failure / Undefined Behavior
├── Debugging / Sanitizers
├── Code Review
├── AI Evaluation
├── Performance / Production
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

> **Concept → C++ Guarantee → Lifetime/Ownership → Compiler/Runtime Boundary → Failure/UB → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Solve Two Sum, longest substring, valid parentheses and a sliding-window problem in C++.

---

# 8. Google Interview Drill

Solve longest substring and discuss byte/UTF-8 assumptions, iterator/reference stability and complexity.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Build/Test → Sanitize/Profile if Needed → Edge Cases → Complexity/Cost → Failure/UB → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Raw ownership without RAII.
- Dangling pointers/references/views.
- Iterator invalidation.
- Incorrect copy/move semantics.
- Missing virtual destructor.
- Data races/atomic misuse.
- Overusing templates/patterns.
- Optimizing before profiling.

---

# 10. Day-Level Best Practices

- Rule of Zero first.
- RAII everywhere practical.
- Smart/value ownership explicit.
- Strong warnings + sanitizers.
- Const-correctness.
- Defined behavior only.
- Measure before optimization.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does the C++ standard guarantee?
3. What is compiler/ABI/runtime-specific?
4. What can dangle, race, leak or invoke UB?
5. What tool would you use to prove the problem?
6. What simpler/safer design could replace this?

---

# 12. Google-Level Follow-Ups

1. What changes under optimization?
2. What changes under concurrency?
3. What changes if ownership becomes shared?
4. What changes across a shared-library ABI boundary?
5. What would ASan/TSan/profiler show?
6. What trade-off would make you choose another language/runtime?

---

# 13. Quick Revision

```text
What is it?
Who owns it?
When does lifetime end?
Can anything dangle?
What can be UB?
What allocates/copies/moves?
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
- [ ] I can explain ownership/lifetime/UB risks.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
