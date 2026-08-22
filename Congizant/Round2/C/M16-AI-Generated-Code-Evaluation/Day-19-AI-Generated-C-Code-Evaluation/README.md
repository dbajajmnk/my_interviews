# Day 19 — AI-Generated C Code Evaluation

**Module:** M16 — AI-Generated Code Evaluation  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [AI code as untrusted proposal](01-AI-code-as-untrusted-proposal.md)
2. [Hallucinated standard APIs](02-Hallucinated-standard-APIs.md)
3. [Wrong C standard assumptions](03-Wrong-C-standard-assumptions.md)
4. [Buffer overflow bugs](04-Buffer-overflow-bugs.md)
5. [Off-by-one errors](05-Off-by-one-errors.md)
6. [Use-after-free](06-Use-after-free.md)
7. [Double free](07-Double-free.md)
8. [Dangling pointers](08-Dangling-pointers.md)
9. [realloc misuse](09-realloc-misuse.md)
10. [Integer overflow](10-Integer-overflow.md)
11. [Signed/unsigned bugs](11-Signed-unsigned-bugs.md)
12. [Undefined behavior](12-Undefined-behavior.md)
13. [Strict-aliasing violations](13-Strict-aliasing-violations.md)
14. [Incorrect volatile use](14-Incorrect-volatile-use.md)
15. [Atomic-ordering mistakes](15-Atomic-ordering-mistakes.md)
16. [Data races](16-Data-races.md)
17. [Unsafe string handling](17-Unsafe-string-handling.md)
18. [Serialization mistakes](18-Serialization-mistakes.md)
19. [Generated Make/CMake](19-Generated-Make-CMake.md)
20. [Generated tests](20-Generated-tests.md)
21. [Generated benchmarks](21-Generated-benchmarks.md)
22. [Security review](22-Security-review.md)
23. [Performance claims](23-Performance-claims.md)
24. [Human approval](24-Human-approval.md)
25. [Accept repair reject rubric](25-Accept-repair-reject-rubric.md)

# 2. Real-Life Analogy

Day 19 translates the locked GOJ structure into C-native bounds, ownership, memory, systems and production reasoning.

# 3. Visualization

```text
AI Output → Compile/Warn/Sanitize/Fuzz → Verdict
```

# 4. Mind Map

```text
AI-Generated C Code Evaluation
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

Evaluate AI-generated parsing, allocation, threading, sockets and strings with sanitizers/tests.

# 8. Google Interview Drill

Repair AI code using strlen/strcpy on untrusted input.

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
