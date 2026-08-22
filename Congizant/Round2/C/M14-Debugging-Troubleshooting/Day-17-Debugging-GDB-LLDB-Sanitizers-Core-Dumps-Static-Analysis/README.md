# Day 17 — Debugging: GDB/LLDB, Sanitizers, Core Dumps & Static Analysis

**Module:** M14 — Debugging & Troubleshooting  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [Debugging workflow](01-Debugging-workflow.md)
2. [GDB awareness](02-GDB-awareness.md)
3. [LLDB awareness](03-LLDB-awareness.md)
4. [Breakpoints](04-Breakpoints.md)
5. [Watchpoints](05-Watchpoints.md)
6. [Backtraces](06-Backtraces.md)
7. [Core dumps](07-Core-dumps.md)
8. [AddressSanitizer](08-AddressSanitizer.md)
9. [UndefinedBehaviorSanitizer](09-UndefinedBehaviorSanitizer.md)
10. [ThreadSanitizer awareness](10-ThreadSanitizer-awareness.md)
11. [MemorySanitizer awareness](11-MemorySanitizer-awareness.md)
12. [LeakSanitizer awareness](12-LeakSanitizer-awareness.md)
13. [Valgrind awareness](13-Valgrind-awareness.md)
14. [Static analyzers awareness](14-Static-analyzers-awareness.md)
15. [clang-tidy awareness](15-clang-tidy-awareness.md)
16. [cppcheck awareness](16-cppcheck-awareness.md)
17. [Compiler warnings](17-Compiler-warnings.md)
18. [Memory corruption diagnosis](18-Memory-corruption-diagnosis.md)
19. [Use-after-free diagnosis](19-Use-after-free-diagnosis.md)
20. [Double-free diagnosis](20-Double-free-diagnosis.md)
21. [Race diagnosis](21-Race-diagnosis.md)
22. [Optimized build debugging](22-Optimized-build-debugging.md)
23. [Symbol files](23-Symbol-files.md)
24. [Root-cause evidence](24-Root-cause-evidence.md)

# 2. Real-Life Analogy

When logging changes a crash, trust sanitizer/core-dump evidence over the moved symptom.

# 3. Visualization

```text
Symptom → Warning/Sanitizer/Core → Hypothesis → Fix
```

# 4. Mind Map

```text
Debugging: GDB/LLDB, Sanitizers, Core Dumps & Static Analysis
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

Diagnose memory corruption, leak, invalid free and race using the right tool.

# 8. Google Interview Drill

Explain why changing logging can move a memory corruption symptom.

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
