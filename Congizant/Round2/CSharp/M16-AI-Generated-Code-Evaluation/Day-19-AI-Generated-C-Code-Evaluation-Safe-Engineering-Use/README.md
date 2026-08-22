# Day 19 — AI-Generated C# Code Evaluation & Safe Engineering Use

**Module:** M16 — AI-Generated Code Evaluation  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [AI code as untrusted proposal](01-AI-code-as-untrusted-proposal.md)
2. [Hallucinated NuGet packages](02-Hallucinated-NuGet-packages.md)
3. [Hallucinated .NET APIs](03-Hallucinated-NET-APIs.md)
4. [Wrong target framework assumptions](04-Wrong-target-framework-assumptions.md)
5. [Async void misuse](05-Async-void-misuse.md)
6. [Sync-over-async](06-Sync-over-async.md)
7. [Missing cancellation](07-Missing-cancellation.md)
8. [HttpClient misuse](08-HttpClient-misuse.md)
9. [IDisposable leaks](09-IDisposable-leaks.md)
10. [Unsafe null-forgiving](10-Unsafe-null-forgiving.md)
11. [Incorrect EF Core usage](11-Incorrect-EF-Core-usage.md)
12. [N+1](12-N-1.md)
13. [SQL injection](13-SQL-injection.md)
14. [Reflection misuse](14-Reflection-misuse.md)
15. [Unsafe code awareness](15-Unsafe-code-awareness.md)
16. [Generated tests](16-Generated-tests.md)
17. [Generated benchmarks](17-Generated-benchmarks.md)
18. [Generated configuration](18-Generated-configuration.md)
19. [Performance claims](19-Performance-claims.md)
20. [Security review](20-Security-review.md)
21. [Human approval](21-Human-approval.md)
22. [Accept repair reject rubric](22-Accept-repair-reject-rubric.md)

---

# 2. Real-Life Analogy

Day 19 keeps the GOJ structure familiar while translating it into C# language, CLR, async, ASP.NET Core, data and production engineering.

---

# 3. Visualization

```text
AI Proposal → build/analyzers/tests → async/EF/security review → Verdict
```

---

# 4. Mind Map

```text
AI-Generated C# Code Evaluation & Safe Engineering Use
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

Evaluate AI-generated snippets for async services, HttpClient, EF Core, JSON, LINQ and DI.

---

# 8. Google Interview Drill

AI generates Task.Run around an ASP.NET Core async database call. Explain why it is harmful and repair it.

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
