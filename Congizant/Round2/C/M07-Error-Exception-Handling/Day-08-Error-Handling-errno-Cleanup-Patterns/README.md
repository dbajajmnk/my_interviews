# Day 08 — Error Handling, errno & Cleanup Patterns

**Module:** M07 — Error / Exception Handling  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [Return-code error handling](01-Return-code-error-handling.md)
2. [Boolean success/failure](02-Boolean-success-failure.md)
3. [Out parameters](03-Out-parameters.md)
4. [Sentinel values](04-Sentinel-values.md)
5. [errno](05-errno.md)
6. [perror](06-perror.md)
7. [strerror awareness](07-strerror-awareness.md)
8. [Custom error enums](08-Custom-error-enums.md)
9. [Error structs awareness](09-Error-structs-awareness.md)
10. [Error propagation](10-Error-propagation.md)
11. [Error context](11-Error-context.md)
12. [goto cleanup pattern](12-goto-cleanup-pattern.md)
13. [Single-exit cleanup pattern](13-Single-exit-cleanup-pattern.md)
14. [Partial initialization](14-Partial-initialization.md)
15. [Resource cleanup](15-Resource-cleanup.md)
16. [setjmp awareness](16-setjmp-awareness.md)
17. [longjmp awareness](17-longjmp-awareness.md)
18. [Recoverable vs programmer errors](18-Recoverable-vs-programmer-errors.md)
19. [API error contracts](19-API-error-contracts.md)
20. [Retryable vs non-retryable errors](20-Retryable-vs-non-retryable-errors.md)

# 2. Real-Life Analogy

C error handling is plumbing: status must travel upward while cleanup still happens on every branch.

# 3. Visualization

```text
Failure → Error Code/errno → cleanup → Contract
```

# 4. Mind Map

```text
Error Handling, errno & Cleanup Patterns
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

Build a multi-resource function with structured cleanup and explicit errors.

# 8. Google Interview Drill

Explain the problems with mixing size_t success values and -1 error values.

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
