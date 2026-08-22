# Day 21 — Database Access, Transactions, Drivers/ORM Awareness & Resource Safety

**Module:** M18 — Database & Data Access  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [SQL from C++](01-SQL-from-C.md)
2. [Parameterized queries](02-Parameterized-queries.md)
3. [Prepared statements](03-Prepared-statements.md)
4. [Connection lifecycle](04-Connection-lifecycle.md)
5. [Connection pools awareness](05-Connection-pools-awareness.md)
6. [Transactions](06-Transactions.md)
7. [Isolation awareness](07-Isolation-awareness.md)
8. [Locking](08-Locking.md)
9. [Optimistic concurrency](09-Optimistic-concurrency.md)
10. [Result-set lifetime](10-Result-set-lifetime.md)
11. [RAII wrappers for DB resources](11-RAII-wrappers-for-DB-resources.md)
12. [SQLite C/C++ API awareness](12-SQLite-C-C-API-awareness.md)
13. [libpq/PostgreSQL awareness](13-libpq-PostgreSQL-awareness.md)
14. [ODBC awareness](14-ODBC-awareness.md)
15. [SOCI awareness](15-SOCI-awareness.md)
16. [ODB ORM awareness](16-ODB-ORM-awareness.md)
17. [N+1 problem](17-N-1-problem.md)
18. [Batch queries](18-Batch-queries.md)
19. [Repository boundary](19-Repository-boundary.md)
20. [Schema migrations](20-Schema-migrations.md)
21. [Long transactions](21-Long-transactions.md)
22. [Remote calls inside transactions](22-Remote-calls-inside-transactions.md)
23. [Error translation](23-Error-translation.md)
24. [Retryable database failures](24-Retryable-database-failures.md)

---

# 2. Real-Life Analogy

Day 21 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
Service → RAII DB Resource → Tx/SQL → Commit/Rollback → Metrics
```

---

# 4. Mind Map

```text
Database Access, Transactions, Drivers/ORM Awareness & Resource Safety
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

Design an RAII-based DB access layer with parameterized queries and transaction rollback safety.

---

# 8. Google Interview Drill

A transaction wrapper throws halfway through an operation. Show how RAII guarantees rollback/cleanup.

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
