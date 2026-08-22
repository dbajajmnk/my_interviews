# Day 03 — Functions, Scope, Storage Duration & Callbacks

**Module:** M03 — Functions, Scope & Core Constructs  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [Function declarations](01-Function-declarations.md)
2. [Function definitions](02-Function-definitions.md)
3. [Prototypes](03-Prototypes.md)
4. [Pass by value](04-Pass-by-value.md)
5. [Pointers for mutation](05-Pointers-for-mutation.md)
6. [Array parameters](06-Array-parameters.md)
7. [Return values](07-Return-values.md)
8. [Returning structs](08-Returning-structs.md)
9. [Returning pointers safely](09-Returning-pointers-safely.md)
10. [Variadic functions awareness](10-Variadic-functions-awareness.md)
11. [stdarg.h awareness](11-stdarg-h-awareness.md)
12. [Function pointers](12-Function-pointers.md)
13. [Callbacks](13-Callbacks.md)
14. [Comparator callbacks](14-Comparator-callbacks.md)
15. [Recursion](15-Recursion.md)
16. [Block scope](16-Block-scope.md)
17. [File scope](17-File-scope.md)
18. [Static storage duration](18-Static-storage-duration.md)
19. [Automatic storage duration](19-Automatic-storage-duration.md)
20. [extern](20-extern.md)
21. [static functions](21-static-functions.md)
22. [inline awareness](22-inline-awareness.md)

# 2. Real-Life Analogy

Day 03 translates the locked GOJ structure into C-native bounds, ownership, memory, systems and production reasoning.

# 3. Visualization

```text
Function → Value/Pointers → Callback → Scope/Storage → Result
```

# 4. Mind Map

```text
Functions, Scope, Storage Duration & Callbacks
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

Implement callback-driven sorting and safe mutation through pointers.

# 8. Google Interview Drill

Explain why returning a pointer to a local variable is invalid.

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
