# Day 08 — Exceptions, Custom Errors, Exception Filters & Resource Safety

**Module:** M07 — Error / Exception Handling  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [System.Exception](01-System-Exception.md)
2. [Exception hierarchy](02-Exception-hierarchy.md)
3. [throw](03-throw.md)
4. [try](04-try.md)
5. [catch](05-catch.md)
6. [finally](06-finally.md)
7. [Exception filters](07-Exception-filters.md)
8. [Custom exceptions](08-Custom-exceptions.md)
9. [InnerException](09-InnerException.md)
10. [Exception wrapping](10-Exception-wrapping.md)
11. [Preserving stack trace](11-Preserving-stack-trace.md)
12. [throw vs throw ex](12-throw-vs-throw-ex.md)
13. [AggregateException awareness](13-AggregateException-awareness.md)
14. [Task exception awareness](14-Task-exception-awareness.md)
15. [ExceptionDispatchInfo awareness](15-ExceptionDispatchInfo-awareness.md)
16. [Result-pattern awareness](16-Result-pattern-awareness.md)
17. [Exception vs result trade-offs](17-Exception-vs-result-trade-offs.md)
18. [IDisposable](18-IDisposable.md)
19. [using statement](19-using-statement.md)
20. [using declaration](20-using-declaration.md)
21. [IAsyncDisposable](21-IAsyncDisposable.md)
22. [await using](22-await-using.md)
23. [Resource ownership](23-Resource-ownership.md)
24. [Error translation](24-Error-translation.md)
25. [API error contracts](25-API-error-contracts.md)
26. [Retryable vs non-retryable errors](26-Retryable-vs-non-retryable-errors.md)

---

# 2. Real-Life Analogy

Day 08 keeps the GOJ structure familiar while translating it into C# language, CLR, async, ASP.NET Core, data and production engineering.

---

# 3. Visualization

```text
Failure → throw/filter/wrap → using/Dispose → translate → API contract
```

---

# 4. Mind Map

```text
Exceptions, Custom Errors, Exception Filters & Resource Safety
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

Build layered error handling with custom exceptions, filters, using/await using, and stable API translation.

---

# 8. Google Interview Drill

A catch block logs and throws ex; explain the lost stack semantics and fix it.

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
