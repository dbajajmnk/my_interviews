# Day 20 — Testing: GoogleTest/Catch2 Awareness, Unit, Fuzzing, Sanitizers & Benchmarks

**Module:** M17 — Testing & Quality Engineering  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [Test strategy](01-Test-strategy.md)
2. [GoogleTest awareness](02-GoogleTest-awareness.md)
3. [Catch2 awareness](03-Catch2-awareness.md)
4. [Assertions](04-Assertions.md)
5. [Parameterized tests](05-Parameterized-tests.md)
6. [Test fixtures](06-Test-fixtures.md)
7. [Mocks awareness](07-Mocks-awareness.md)
8. [Fakes](08-Fakes.md)
9. [Stubs](09-Stubs.md)
10. [Dependency injection for tests](10-Dependency-injection-for-tests.md)
11. [Integration tests](11-Integration-tests.md)
12. [File/network tests](12-File-network-tests.md)
13. [Property-based testing awareness](13-Property-based-testing-awareness.md)
14. [Fuzzing](14-Fuzzing.md)
15. [libFuzzer awareness](15-libFuzzer-awareness.md)
16. [Sanitizers in CI](16-Sanitizers-in-CI.md)
17. [ThreadSanitizer tests](17-ThreadSanitizer-tests.md)
18. [Coverage awareness](18-Coverage-awareness.md)
19. [Mutation testing awareness](19-Mutation-testing-awareness.md)
20. [Google Benchmark awareness](20-Google-Benchmark-awareness.md)
21. [Microbenchmark methodology](21-Microbenchmark-methodology.md)
22. [Compiler optimization in benchmarks](22-Compiler-optimization-in-benchmarks.md)
23. [Flaky concurrency tests](23-Flaky-concurrency-tests.md)

---

# 2. Real-Life Analogy

Day 20 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
Unit → Fuzz/Sanitizer → Integration → Benchmark → Production Signals
```

---

# 4. Mind Map

```text
Testing: GoogleTest/Catch2 Awareness, Unit, Fuzzing, Sanitizers & Benchmarks
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

Build unit tests, one fuzz target, sanitizer-enabled test execution, and one benchmark with correct methodology.

---

# 8. Google Interview Drill

A benchmark's loop is optimized away. Explain how to prevent meaningless benchmark results.

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
