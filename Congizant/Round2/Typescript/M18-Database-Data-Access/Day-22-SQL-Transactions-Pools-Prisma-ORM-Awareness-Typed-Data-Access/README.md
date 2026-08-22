# Day 22 — SQL, Transactions, Pools, Prisma/ORM Awareness & Typed Data Access

**Module:** M18 — Database & Data Access  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units and integrate them into one interview-ready TypeScript mental model.

## Topic Units

1. [Parameterized SQL](01-Parameterized-SQL.md)
2. [Database drivers](02-Database-drivers.md)
3. [Connection pools](03-Connection-pools.md)
4. [Transactions](04-Transactions.md)
5. [Isolation awareness](05-Isolation-awareness.md)
6. [Locking](06-Locking.md)
7. [Optimistic concurrency](07-Optimistic-concurrency.md)
8. [N+1](08-N-1.md)
9. [Batch queries](09-Batch-queries.md)
10. [Repository boundaries](10-Repository-boundaries.md)
11. [Prisma awareness](11-Prisma-awareness.md)
12. [Generated ORM types](12-Generated-ORM-types.md)
13. [Sequelize awareness](13-Sequelize-awareness.md)
14. [Query builders awareness](14-Query-builders-awareness.md)
15. [Database types vs domain types](15-Database-types-vs-domain-types.md)
16. [Nullable columns](16-Nullable-columns.md)
17. [Date/decimal mapping](17-Date-decimal-mapping.md)
18. [Schema migrations](18-Schema-migrations.md)
19. [Long transactions](19-Long-transactions.md)
20. [Remote calls inside transactions](20-Remote-calls-inside-transactions.md)
21. [Typed query result validation](21-Typed-query-result-validation.md)

---

# 2. Real-Life Analogy

Generated ORM types are a map of intended storage shape; the database and migration history remain the actual terrain.

---

# 3. Visualization

```text
Typed Repository → Pool/Transaction → SQL/DB → Runtime Mapping → Domain/API
```

---

# 4. Mind Map

```text
SQL, Transactions, Pools, Prisma/ORM Awareness & Typed Data Access
├── Type-System Guarantee
├── Emitted JavaScript
├── Runtime Validation Boundary
├── Implementation
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
105–115 min Questions/follow-ups
115–120 min Readiness gate + repair note
```

Broad P1 topics are awareness-first. Do not sacrifice P0 correctness to memorize type-system trivia.

---

# 6. Engineering Integration

Connect:

> **Requirement → Static Type Invariant → Runtime Boundary → JavaScript Behavior → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Implement parameterized data access with a typed repository, then compare database-generated types with domain/API types.

---

# 8. Google Interview Drill

A generated ORM type says a field is non-null but production DB contains legacy nulls. Explain schema/runtime truth vs compile-time assumptions.

Use:

> **Clarify → First Approach → Improve → Code/Design → Type-Check → Run/Test → Edge Cases → Runtime Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Treating TypeScript types as runtime guards.
- Replacing evidence with `any`, assertions, or `!`.
- Forgetting JavaScript event-loop/memory/module behavior.
- Sharing internal types across boundaries without runtime/schema contracts.
- Building type-level complexity that exceeds business value.
- Ignoring framework/package/runtime version differences.

---

# 10. Day-Level Best Practices

- Strict mode by default.
- `unknown` at uncertain boundaries.
- Runtime validation at external boundaries.
- Keep types readable and stable.
- Preserve JavaScript/Node runtime literacy.
- Use type-level abstraction only when it reduces real duplication/risk.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. Which parts disappear after compilation?
3. What could still fail at runtime?
4. What boundary needs runtime validation?
5. What would you review in AI-generated code?
6. What trade-off would make you simplify the type design?

---

# 12. Google-Level Follow-Ups

1. What changes if the input comes from JSON/network/database?
2. What changes if strict mode is enabled?
3. What changes for a library vs an application?
4. What happens if JavaScript callers bypass your types?
5. What would you measure if compiler performance is slow?
6. What would you measure if runtime performance is slow?

---

# 13. Quick Revision

```text
What does the type checker know?
What gets emitted?
What exists at runtime?
Where is data validated?
What can still fail?
How do I debug it?
What do I review?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization without notes.
- [ ] I completed hands-on work.
- [ ] I completed the Google drill.
- [ ] I can distinguish static vs runtime guarantees.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
