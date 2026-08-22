# Day 18 — Code Review, Refactoring & Safe C

**Module:** M15 — Code Review & Refactoring Mastery  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [Risk-first code review](01-Risk-first-code-review.md)
2. [Correctness](02-Correctness.md)
3. [Bounds review](03-Bounds-review.md)
4. [Pointer lifetime review](04-Pointer-lifetime-review.md)
5. [Ownership review](05-Ownership-review.md)
6. [Allocation/free pairing](06-Allocation-free-pairing.md)
7. [realloc review](07-realloc-review.md)
8. [Integer conversion review](08-Integer-conversion-review.md)
9. [Signed/unsigned review](09-Signed-unsigned-review.md)
10. [String safety](10-String-safety.md)
11. [Null handling](11-Null-handling.md)
12. [Error propagation](12-Error-propagation.md)
13. [goto cleanup review](13-goto-cleanup-review.md)
14. [Concurrency review](14-Concurrency-review.md)
15. [volatile misuse review](15-volatile-misuse-review.md)
16. [Atomic review](16-Atomic-review.md)
17. [Undefined behavior review](17-Undefined-behavior-review.md)
18. [Macro review](18-Macro-review.md)
19. [Global state](19-Global-state.md)
20. [Header hygiene](20-Header-hygiene.md)
21. [API contracts](21-API-contracts.md)
22. [Const-correctness](22-Const-correctness.md)
23. [Refactoring](23-Refactoring.md)
24. [Characterization tests](24-Characterization-tests.md)
25. [Naming](25-Naming.md)
26. [Public ABI compatibility](26-Public-ABI-compatibility.md)
27. [Technical debt](27-Technical-debt.md)
28. [MISRA C awareness](28-MISRA-C-awareness.md)
29. [CERT C awareness](29-CERT-C-awareness.md)

# 2. Real-Life Analogy

Day 18 translates the locked GOJ structure into C-native bounds, ownership, memory, systems and production reasoning.

# 3. Visualization

```text
Requirement → Bounds/Pointer/Integer/Error → Review
```

# 4. Mind Map

```text
Code Review, Refactoring & Safe C
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

Review a flawed module with unsafe strings, leaks, conversions and globals.

# 8. Google Interview Drill

Rank blockers vs suggestions in a 20-minute PR review.

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
