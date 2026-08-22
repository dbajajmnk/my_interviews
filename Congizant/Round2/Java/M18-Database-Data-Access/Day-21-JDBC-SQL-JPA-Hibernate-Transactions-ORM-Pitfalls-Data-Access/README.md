# Day 21 — JDBC, SQL, JPA/Hibernate, Transactions, ORM Pitfalls & Data Access

**Module:** M18 — Database & Data Access  
**Duration:** 2 Hours  
**Priority:** P0  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [JDBC](01-JDBC.md)
2. [prepared statements](02-prepared-statements.md)
3. [connection pooling](03-connection-pooling.md)
4. [transactions](04-transactions.md)
5. [JPA entities](05-JPA-entities.md)
6. [persistence context](06-persistence-context.md)
7. [lazy/eager](07-lazy-eager.md)
8. [N+1](08-N-1.md)
9. [fetch join](09-fetch-join.md)
10. [locking](10-locking.md)
11. [optimistic version](11-optimistic-version.md)
12. [schema migration](12-schema-migration.md)
13. [repository boundaries](13-repository-boundaries.md)

---

# 2. Real-Life Analogy

An ORM is a translator between object language and database language; a translator makes conversation easier but cannot change the database's laws.

---

# 3. Visualization

```text
Service Transaction → Persistence Context → SQL → DB Locks/Indexes → Commit/Rollback
```

---

# 4. Mind Map

```text
JDBC, SQL, JPA/Hibernate, Transactions, ORM Pitfalls & Data Access
├── Topic Units
├── Java Semantics
├── Runtime / Internal Working
├── Implementation
├── Debugging
├── Code Review
├── AI Evaluation
├── Production Usage
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

Use the 2-hour boundary strictly:

```text
00–15 min  Rapid topic recall / skim
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

For broad days, P1 subtopics receive awareness depth first. Do not sacrifice P0 correctness to memorize low-value trivia.

---

# 6. Engineering Integration

For the whole day, be able to connect:

> **Concept → Java Guarantee → JVM/Framework Behavior → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Implement repository operation with JDBC prepared statement and JPA equivalent. Reproduce N+1, inspect queries, fix with fetch join/entity graph/query projection.

---

# 8. Google Interview Drill

Two users update the same account/settings record. Explain lost update, optimistic locking, transaction boundaries, retry/conflict UX, and why synchronized in one JVM is insufficient.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Remote call inside DB transaction
- EAGER everywhere
- Returning entities directly as API DTOs
- Ignoring N+1
- Connection leaks
- String-built SQL

---

# 10. Day-Level Best Practices

- Parameterize queries
- Keep transaction boundary at business operation
- Measure SQL
- Use explicit fetch plans
- Use schema migration tooling
- Monitor pool/locks

---

# 11. Interview Questions

1. JDBC vs JPA?
2. Persistence context?
3. Lazy vs eager?
4. N+1?
5. Optimistic vs pessimistic locking?
6. Connection pool?
7. Transaction isolation?

---

# 12. Google-Level Follow-Ups

1. First-level vs second-level cache?
2. Dirty checking?
3. What triggers flush?
4. How does `@Transactional` proxying affect self-invocation?

---

# 13. Quick Revision

```text
What is it?
Why use it?
What does Java guarantee?
How does it work internally?
Show code.
What breaks?
How do you debug it?
What do you review?
How would you evaluate AI-generated code?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can draw/explain today's visualization without notes.
- [ ] I completed the hands-on task.
- [ ] I completed the Google drill.
- [ ] I can answer the interview questions with concise senior-level reasoning.
- [ ] I can survive at least two follow-up changes.
- [ ] I did not invent project experience or metrics.

**DAY READY:** 80%+ and no P0 topic failure.  
**DAY REPAIR:** Reopen only failed topic files.
