# Day 20 — Testing, Fuzzing, Sanitizers & Benchmarks

**Module:** M17 — Testing & Quality Engineering  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [Test strategy](01-Test-strategy.md)
2. [Unity test framework awareness](02-Unity-test-framework-awareness.md)
3. [Check framework awareness](03-Check-framework-awareness.md)
4. [cmocka awareness](04-cmocka-awareness.md)
5. [Assertions](05-Assertions.md)
6. [Test fixtures awareness](06-Test-fixtures-awareness.md)
7. [Fakes](07-Fakes.md)
8. [Stubs](08-Stubs.md)
9. [Dependency injection for C](09-Dependency-injection-for-C.md)
10. [Integration tests](10-Integration-tests.md)
11. [File/network tests](11-File-network-tests.md)
12. [Fuzzing](12-Fuzzing.md)
13. [libFuzzer awareness](13-libFuzzer-awareness.md)
14. [AFL++ awareness](14-AFL-awareness.md)
15. [Sanitizers in CI](15-Sanitizers-in-CI.md)
16. [Coverage with gcov awareness](16-Coverage-with-gcov-awareness.md)
17. [lcov awareness](17-lcov-awareness.md)
18. [Mutation testing awareness](18-Mutation-testing-awareness.md)
19. [Microbenchmark methodology](19-Microbenchmark-methodology.md)
20. [Compiler optimization in benchmarks](20-Compiler-optimization-in-benchmarks.md)
21. [Concurrency test flakiness](21-Concurrency-test-flakiness.md)

# 2. Real-Life Analogy

Day 20 translates the locked GOJ structure into C-native bounds, ownership, memory, systems and production reasoning.

# 3. Visualization

```text
Unit → Fuzz/Sanitizer → Integration → Benchmark
```

# 4. Mind Map

```text
Testing, Fuzzing, Sanitizers & Benchmarks
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

Create unit tests, fuzz target, sanitizer test run and meaningful benchmark.

# 8. Google Interview Drill

Explain why compilers can optimize a benchmark away.

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
