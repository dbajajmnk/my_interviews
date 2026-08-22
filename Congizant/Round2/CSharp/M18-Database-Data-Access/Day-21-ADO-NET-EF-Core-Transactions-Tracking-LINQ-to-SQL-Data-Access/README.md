# Day 21 — ADO.NET, EF Core, Transactions, Tracking, LINQ-to-SQL & Data Access

**Module:** M18 — Database & Data Access  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [ADO.NET awareness](01-ADO-NET-awareness.md)
2. [DbConnection](02-DbConnection.md)
3. [DbCommand](03-DbCommand.md)
4. [Parameterized queries](04-Parameterized-queries.md)
5. [Connection pooling](05-Connection-pooling.md)
6. [Transactions](06-Transactions.md)
7. [Isolation awareness](07-Isolation-awareness.md)
8. [Locking](08-Locking.md)
9. [Optimistic concurrency](09-Optimistic-concurrency.md)
10. [EF Core](10-EF-Core.md)
11. [DbContext](11-DbContext.md)
12. [DbSet](12-DbSet.md)
13. [Change tracking](13-Change-tracking.md)
14. [No-tracking queries](14-No-tracking-queries.md)
15. [Entity states](15-Entity-states.md)
16. [LINQ translation](16-LINQ-translation.md)
17. [Client vs server evaluation awareness](17-Client-vs-server-evaluation-awareness.md)
18. [Lazy loading awareness](18-Lazy-loading-awareness.md)
19. [Eager loading](19-Eager-loading.md)
20. [Explicit loading](20-Explicit-loading.md)
21. [N+1](21-N-1.md)
22. [Include](22-Include.md)
23. [Projection](23-Projection.md)
24. [Split queries awareness](24-Split-queries-awareness.md)
25. [Compiled queries awareness](25-Compiled-queries-awareness.md)
26. [Migrations](26-Migrations.md)
27. [Concurrency tokens](27-Concurrency-tokens.md)
28. [Repository pattern trade-offs](28-Repository-pattern-trade-offs.md)
29. [Unit of Work awareness](29-Unit-of-Work-awareness.md)
30. [Long transactions](30-Long-transactions.md)
31. [Remote calls inside transactions](31-Remote-calls-inside-transactions.md)

---

# 2. Real-Life Analogy

Day 21 keeps the GOJ structure familiar while translating it into C# language, CLR, async, ASP.NET Core, data and production engineering.

---

# 3. Visualization

```text
ASP/API → DbContext/Pool → LINQ→SQL → Tx/Locks → Commit/Rollback
```

---

# 4. Mind Map

```text
ADO.NET, EF Core, Transactions, Tracking, LINQ-to-SQL & Data Access
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

Implement parameterized ADO.NET and an EF Core query/transaction; reproduce N+1 and fix it.

---

# 8. Google Interview Drill

A LINQ query looks cheap in C# but emits terrible SQL. Explain why generated SQL must be inspected.

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
