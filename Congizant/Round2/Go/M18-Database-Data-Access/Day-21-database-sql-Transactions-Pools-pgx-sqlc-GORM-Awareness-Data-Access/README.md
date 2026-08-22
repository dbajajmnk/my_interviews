# Day 21 — database/sql, Transactions, Pools, pgx, sqlc/GORM Awareness & Data Access

**Module:** M18 — Database & Data Access  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Go mental model.

## Topic Units

1. [database/sql](01-database-sql.md)
2. [sql.DB is a pool](02-sql-DB-is-a-pool.md)
3. [Open vs Ping awareness](03-Open-vs-Ping-awareness.md)
4. [Parameterized queries](04-Parameterized-queries.md)
5. [Query](05-Query.md)
6. [QueryRow](06-QueryRow.md)
7. [Exec](07-Exec.md)
8. [Rows close](08-Rows-close.md)
9. [Scan](09-Scan.md)
10. [Null types awareness](10-Null-types-awareness.md)
11. [Context-aware DB calls](11-Context-aware-DB-calls.md)
12. [Transactions](12-Transactions.md)
13. [Tx lifecycle](13-Tx-lifecycle.md)
14. [Isolation awareness](14-Isolation-awareness.md)
15. [Locking](15-Locking.md)
16. [Optimistic concurrency](16-Optimistic-concurrency.md)
17. [Connection pool settings](17-Connection-pool-settings.md)
18. [MaxOpenConns](18-MaxOpenConns.md)
19. [MaxIdleConns](19-MaxIdleConns.md)
20. [ConnMaxLifetime awareness](20-ConnMaxLifetime-awareness.md)
21. [N+1](21-N-1.md)
22. [Batch queries](22-Batch-queries.md)
23. [Repository boundaries](23-Repository-boundaries.md)
24. [pgx awareness](24-pgx-awareness.md)
25. [sqlc awareness](25-sqlc-awareness.md)
26. [GORM awareness](26-GORM-awareness.md)
27. [Migrations](27-Migrations.md)
28. [Long transactions](28-Long-transactions.md)
29. [Remote calls inside transactions](29-Remote-calls-inside-transactions.md)

---

# 2. Real-Life Analogy

Day 21 keeps the GOJ structure familiar while translating it into Go-native simplicity, explicit errors, ownership, concurrency, runtime, and production reasoning.

---

# 3. Visualization

```text
Handler → DB Pool → Tx/SQL → Locks → Commit/Rollback → Metrics
```

---

# 4. Mind Map

```text
database/sql, Transactions, Pools, pgx, sqlc/GORM Awareness & Data Access
├── Language Semantics
├── Toolchain / Runtime
├── Ownership / Resources
├── Concurrency
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

> **Concept → Go Guarantee → Runtime/OS Boundary → Ownership → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Implement parameterized queries and a transaction; tune/observe a connection pool and reproduce N+1.

---

# 8. Google Interview Drill

An API times out while CPU is low because every DB connection is busy. Explain pool saturation.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Race/Profile if Needed → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Ignoring errors.
- Over-abstracting with interfaces/patterns.
- Leaking goroutines/resources.
- Using unbounded concurrency.
- Misunderstanding slice/interface nil semantics.
- Treating race-free as automatically deadlock/leak-free.
- Optimizing without pprof/trace/benchmark evidence.

---

# 10. Day-Level Best Practices

- Standard library first.
- Small consumer-owned interfaces.
- Explicit errors and context.
- Bounded concurrency.
- Clear ownership and cleanup.
- Measure runtime behavior.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does the Go spec guarantee?
3. What is runtime/compiler implementation detail?
4. What can leak, block, or race?
5. What evidence would you collect?
6. What simpler design could replace this abstraction?

---

# 12. Google-Level Follow-Ups

1. What changes under 10× concurrency?
2. What happens when the client cancels?
3. What if the downstream DB/API is saturated?
4. What if this function receives a typed-nil interface?
5. What would pprof/trace/-race show?
6. What would you change for a library vs a service?

---

# 13. Quick Revision

```text
What is it?
Why?
Who owns the resource?
What can be nil?
What can block/race/leak?
What does the runtime do?
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
- [ ] I can explain ownership/cancellation/resource behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
