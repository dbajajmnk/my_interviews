# Day 21 — SQL, Node Database Drivers, Transactions, Pools, ORMs & Data Access

**Module:** M18 — Database & Data Access  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready JavaScript mental model.

## Topic Units

1. [SQL from JavaScript](01-SQL-from-JavaScript.md)
2. [Parameterized queries](02-Parameterized-queries.md)
3. [Database drivers](03-Database-drivers.md)
4. [Connection pools](04-Connection-pools.md)
5. [Transactions](05-Transactions.md)
6. [Isolation awareness](06-Isolation-awareness.md)
7. [Locking](07-Locking.md)
8. [Optimistic concurrency](08-Optimistic-concurrency.md)
9. [N+1](09-N-1.md)
10. [Batch queries](10-Batch-queries.md)
11. [ORM awareness](11-ORM-awareness.md)
12. [Prisma awareness](12-Prisma-awareness.md)
13. [Sequelize awareness](13-Sequelize-awareness.md)
14. [Query builder awareness](14-Query-builder-awareness.md)
15. [Repository boundary](15-Repository-boundary.md)
16. [Schema migrations](16-Schema-migrations.md)
17. [Long transactions](17-Long-transactions.md)
18. [Remote calls inside transactions](18-Remote-calls-inside-transactions.md)

---

# 2. Real-Life Analogy

The database is the authoritative warehouse; an ORM/driver is a translator, not a replacement for transaction and locking rules.

---

# 3. Visualization

```text
Service → Pool/Transaction → SQL/DB Locks → Commit/Rollback → Metrics
```

---

# 4. Mind Map

```text
SQL, Node Database Drivers, Transactions, Pools, ORMs & Data Access
├── Language / Runtime Semantics
├── Syntax / APIs
├── Internal Working
├── Browser / Node Boundary
├── Failure / Edge Cases
├── Debugging
├── Code Review
├── AI Evaluation
├── Production Usage
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

```text
00–15 min  Rapid recall / topic scan
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

For broad days, cover P1 topics at awareness depth first. Do not sacrifice P0 correctness for low-value trivia.

---

# 6. Engineering Integration

For today's topics, connect:

> **Concept → ECMAScript Guarantee → Browser/Node/Engine Boundary → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Implement parameterized query and transaction logic, then reproduce an N+1 access pattern and replace it with a bulk/fetch strategy.

---

# 8. Google Interview Drill

Two requests update the same record and one silently overwrites the other. Explain optimistic concurrency/versioning and why an in-process mutex is not enough across multiple Node instances.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Mixing ECMAScript language semantics with browser/Node host APIs.
- Memorizing output without being able to derive it.
- Hiding async behavior or mutation.
- Adding framework/package complexity before the language/runtime model is clear.
- Ignoring failure, security, or production observability.

---

# 10. Day-Level Best Practices

- Explain semantics before framework behavior.
- Use explicit, readable JavaScript.
- Keep async ownership, cancellation, and errors visible.
- Prefer measured evidence over performance folklore.
- Keep security boundaries deterministic.
- Use Evidence First / No Bluff in project discussion.

---

# 11. Interview Questions

1. Explain the three most important concepts from today in 60 seconds each.
2. Show one runnable example and predict its output before executing.
3. What is one production failure caused by misunderstanding today's topic?
4. What is one code-review smell?
5. What is one AI-generated-code risk?
6. What trade-off would make you choose a different design?

---

# 12. Google-Level Follow-Ups

1. What changes in browser vs Node.js?
2. What changes under 10× traffic or data size?
3. What if the operation becomes asynchronous?
4. What if input is attacker-controlled?
5. What would you measure in production?
6. What would you change if the runtime/framework version differs?

---

# 13. Quick Revision

```text
What is it?
Why?
What does ECMAScript guarantee?
What is host/engine specific?
Show code.
What breaks?
How do I debug it?
What do I review?
How do I evaluate AI-generated code?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization without notes.
- [ ] I completed the hands-on exercise.
- [ ] I completed the Google drill.
- [ ] I can answer follow-ups without restarting my solution.
- [ ] I can separate ECMAScript vs host/runtime behavior.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topic files.
