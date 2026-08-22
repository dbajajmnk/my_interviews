# Day 20 — Testing: xUnit/NUnit/MSTest Awareness, Mocks, Integration & Benchmarks

**Module:** M17 — Testing & Quality Engineering  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [Test strategy](01-Test-strategy.md)
2. [xUnit awareness](02-xUnit-awareness.md)
3. [NUnit awareness](03-NUnit-awareness.md)
4. [MSTest awareness](04-MSTest-awareness.md)
5. [Assertions](05-Assertions.md)
6. [Theory/data-driven tests](06-Theory-data-driven-tests.md)
7. [Fixtures](07-Fixtures.md)
8. [Mocks](08-Mocks.md)
9. [Stubs](09-Stubs.md)
10. [Fakes](10-Fakes.md)
11. [Moq awareness](11-Moq-awareness.md)
12. [NSubstitute awareness](12-NSubstitute-awareness.md)
13. [Mocking pitfalls](13-Mocking-pitfalls.md)
14. [Async tests](14-Async-tests.md)
15. [Cancellation tests](15-Cancellation-tests.md)
16. [Integration tests](16-Integration-tests.md)
17. [WebApplicationFactory awareness](17-WebApplicationFactory-awareness.md)
18. [HTTP API tests](18-HTTP-API-tests.md)
19. [Database tests](19-Database-tests.md)
20. [Testcontainers awareness](20-Testcontainers-awareness.md)
21. [Contract tests](21-Contract-tests.md)
22. [Snapshot testing awareness](22-Snapshot-testing-awareness.md)
23. [Coverage limitations](23-Coverage-limitations.md)
24. [Mutation testing awareness](24-Mutation-testing-awareness.md)
25. [BenchmarkDotNet awareness](25-BenchmarkDotNet-awareness.md)
26. [Flaky tests](26-Flaky-tests.md)

---

# 2. Real-Life Analogy

Day 20 keeps the GOJ structure familiar while translating it into C# language, CLR, async, ASP.NET Core, data and production engineering.

---

# 3. Visualization

```text
Unit → Integration/API/DB → Contract → Benchmark → Production Signals
```

---

# 4. Mind Map

```text
Testing: xUnit/NUnit/MSTest Awareness, Mocks, Integration & Benchmarks
├── C# Semantics
├── CLR / IL / Runtime
├── Async / Lifetime
├── Framework / Data
├── Implementation
├── Failure / Edge Cases
├── Debugging
├── Code Review
├── AI Evaluation
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

> **Concept → C# Guarantee → CLR/Framework Boundary → Lifetime/Ownership → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Build unit, async, integration and API tests, plus one benchmark using BenchmarkDotNet awareness.

---

# 8. Google Interview Drill

A suite has 95% coverage but mocks EF/HTTP so heavily that production regressions escape. Explain the testing gap.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Build/Test → Edge Cases → Complexity/Allocation → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Confusing C# with .NET/CLR.
- Sync-over-async.
- Missing cancellation.
- Resource leaks.
- Wrong DI lifetime.
- Overusing inheritance/patterns.
- Trusting LINQ/EF/runtime behavior without evidence.
- Optimizing without diagnostics.

---

# 10. Day-Level Best Practices

- Nullable enabled.
- Async all the way for I/O.
- CancellationToken propagated.
- Deterministic disposal.
- Constructor injection and correct lifetimes.
- Inspect SQL and traces.
- Measure before tuning.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does C# guarantee?
3. What is CLR/framework-specific?
4. What can allocate/block/race/leak?
5. What evidence would you collect?
6. What simpler design could replace the abstraction?

---

# 12. Google-Level Follow-Ups

1. What changes under 10× concurrency?
2. What happens when CancellationToken fires?
3. What if the DB/API is saturated?
4. What changes under Native AOT/trimming?
5. What would counters/trace/dump/profile show?
6. What would you choose differently for library vs ASP.NET Core service?

---

# 13. Quick Revision

```text
What is it?
Why?
What does C# guarantee?
What does CLR/framework do?
What allocates?
What can block/race/leak?
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
- [ ] I can distinguish language vs CLR/framework behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
