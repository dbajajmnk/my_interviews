# Day 09 — Headers, Linkage, Libraries & Build Systems

**Module:** M08 — Modules, Packages, Build & Dependency Management  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [Header discipline](01-Header-discipline.md)
2. [Include guards](02-Include-guards.md)
3. [pragma once awareness](03-pragma-once-awareness.md)
4. [Declarations vs definitions](04-Declarations-vs-definitions.md)
5. [External linkage](05-External-linkage.md)
6. [Internal linkage](06-Internal-linkage.md)
7. [static at file scope](07-static-at-file-scope.md)
8. [extern](08-extern.md)
9. [Tentative definitions awareness](09-Tentative-definitions-awareness.md)
10. [Multiple definition errors](10-Multiple-definition-errors.md)
11. [Static libraries](11-Static-libraries.md)
12. [Shared libraries](12-Shared-libraries.md)
13. [Dynamic linking awareness](13-Dynamic-linking-awareness.md)
14. [Symbol visibility awareness](14-Symbol-visibility-awareness.md)
15. [ABI awareness](15-ABI-awareness.md)
16. [Make awareness](16-Make-awareness.md)
17. [Makefile targets](17-Makefile-targets.md)
18. [CMake awareness](18-CMake-awareness.md)
19. [pkg-config awareness](19-pkg-config-awareness.md)
20. [Compiler flags](20-Compiler-flags.md)
21. [Feature-test macros awareness](21-Feature-test-macros-awareness.md)
22. [Cross compilation](22-Cross-compilation.md)
23. [Vendoring](23-Vendoring.md)
24. [Supply-chain risk](24-Supply-chain-risk.md)

# 2. Real-Life Analogy

Day 09 translates the locked GOJ structure into C-native bounds, ownership, memory, systems and production reasoning.

# 3. Visualization

```text
Header/TU → Linkage/Library/ABI → Executable
```

# 4. Mind Map

```text
Headers, Linkage, Libraries & Build Systems
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

Create a static library and reproduce/fix duplicate and undefined symbols.

# 8. Google Interview Drill

Diagnose a global definition accidentally placed in a header.

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
