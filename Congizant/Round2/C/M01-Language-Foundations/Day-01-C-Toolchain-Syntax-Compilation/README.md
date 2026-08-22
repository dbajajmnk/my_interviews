# Day 01 — C Toolchain, Syntax & Compilation

**Module:** M01 — Language Foundations  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [C language overview](01-C-language-overview.md)
2. [Compiler toolchain](02-Compiler-toolchain.md)
3. [Preprocessor](03-Preprocessor.md)
4. [Compilation](04-Compilation.md)
5. [Linking](05-Linking.md)
6. [Translation units](06-Translation-units.md)
7. [Header files](07-Header-files.md)
8. [Source files](08-Source-files.md)
9. [main function](09-main-function.md)
10. [Variables](10-Variables.md)
11. [const](11-const.md)
12. [volatile awareness](12-volatile-awareness.md)
13. [Operators](13-Operators.md)
14. [if](14-if.md)
15. [switch](15-switch.md)
16. [for](16-for.md)
17. [while](17-while.md)
18. [do-while](18-do-while.md)
19. [break](19-break.md)
20. [continue](20-continue.md)
21. [goto awareness](21-goto-awareness.md)
22. [Compiler warnings](22-Compiler-warnings.md)

# 2. Real-Life Analogy

C source passes through preprocessor, compiler and linker before it can execute.

# 3. Visualization

```text
Source → Preprocessor → Compiler → Object → Linker → Executable
```

# 4. Mind Map

```text
C Toolchain, Syntax & Compilation
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

Build a multi-file C program and explain preprocessing, compile and link stages.

# 8. Google Interview Drill

Explain why C source is not executed directly.

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
