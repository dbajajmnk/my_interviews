# Day 15 — DSA I: Arrays, Strings, Hashing & Sliding Windows

**Module:** M13 — Coding & DSA  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [Google problem-solving flow](01-Google-problem-solving-flow.md)
2. [Big-O](02-Big-O.md)
3. [Arrays](03-Arrays.md)
4. [C strings](04-C-strings.md)
5. [Length-aware string processing](05-Length-aware-string-processing.md)
6. [Hash table implementation awareness](06-Hash-table-implementation-awareness.md)
7. [Two pointers](07-Two-pointers.md)
8. [Sliding window](08-Sliding-window.md)
9. [Stack using array](09-Stack-using-array.md)
10. [Queue using circular buffer](10-Queue-using-circular-buffer.md)
11. [Deque awareness](11-Deque-awareness.md)
12. [Prefix sums awareness](12-Prefix-sums-awareness.md)
13. [Brute force to optimization](13-Brute-force-to-optimization.md)
14. [Boundary conditions](14-Boundary-conditions.md)
15. [Off-by-one errors](15-Off-by-one-errors.md)
16. [Integer overflow in algorithms](16-Integer-overflow-in-algorithms.md)
17. [Complexity communication](17-Complexity-communication.md)

# 2. Real-Life Analogy

Day 15 translates the locked GOJ structure into C-native bounds, ownership, memory, systems and production reasoning.

# 3. Visualization

```text
Clarify → Brute Force → Hash/Window → Bounds → Complexity
```

# 4. Mind Map

```text
DSA I: Arrays, Strings, Hashing & Sliding Windows
├── C Semantics
├── Bounds / Integers / Pointers
├── Ownership / Storage Duration
├── Toolchain / OS
├── Concurrency
├── Failure / UB
├── Debugging / Security
└── Interview Defense
```

# 5. Two-Hour Execution Plan

```text
00–15  Rapid recall
15–55  P0 topics
55–85  Hands-on/debugging
85–105 Google drill
105–115 Follow-ups
115–120 Readiness gate
```

# 6. Engineering Integration

> **Concept → C Guarantee → Bounds/Ownership → Compiler/OS Boundary → Failure/UB → Evidence → Review Rule → Trade-Off**

# 7. Hands-On Integration

Solve Two Sum, valid parentheses and a sliding-window problem with explicit bounds.

# 8. Google Interview Drill

Defend every index/capacity operation in a sliding-window solution.

# 9. Day-Level Common Mistakes

- Pointer/array confusion.
- Missing bounds and cleanup.
- Signed/unsigned mistakes.
- UB and volatile misuse.
- Unsafe string handling.
- Optimizing without evidence.

# 10. Day-Level Best Practices

Explicit sizes, ownership, strong warnings, structured cleanup, sanitizers/fuzzing, correct synchronization, portable representations, Evidence First / No Bluff.

# 11. Interview Questions

Explain three key topics, one failure, one debugging artifact, one production use, and one safer alternative.

# 12. Google-Level Follow-Ups

What changes on another compiler/architecture, under concurrency, for untrusted input, under optimization, or if a safer language is allowed?

# 13. Quick Revision

```text
What is it?
What is the type/size?
Who owns it?
What is the lifetime/capacity?
What can be NULL/overflow/out-of-bounds?
How is cleanup guaranteed?
What tool proves failure?
```

# 14. Day Readiness Gate

- [ ] Every P0 topic READY.
- [ ] Hands-on complete.
- [ ] Drill complete.
- [ ] Bounds/ownership/lifetime explainable.
- [ ] Two follow-up changes survivable.
- [ ] No invented evidence.

**DAY READY:** 80%+ and no P0 failure.
