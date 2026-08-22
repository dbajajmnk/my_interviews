# Day 21 — SQL, JDBC, Transactions, JPA/Hibernate & Kotlin Data Access

**Module:** M18 — Database & Data Access  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Kotlin mental model.

## Topic Units

1. [JDBC from Kotlin](01-JDBC-from-Kotlin.md)
2. [Prepared statements](02-Prepared-statements.md)
3. [Connection pools](03-Connection-pools.md)
4. [Transactions](04-Transactions.md)
5. [Isolation awareness](05-Isolation-awareness.md)
6. [Locking](06-Locking.md)
7. [Optimistic concurrency](07-Optimistic-concurrency.md)
8. [JPA awareness](08-JPA-awareness.md)
9. [Hibernate awareness](09-Hibernate-awareness.md)
10. [Kotlin JPA pitfalls](10-Kotlin-JPA-pitfalls.md)
11. [No-arg constructor awareness](11-No-arg-constructor-awareness.md)
12. [Open class/proxy issue awareness](12-Open-class-proxy-issue-awareness.md)
13. [Lazy loading](13-Lazy-loading.md)
14. [Eager loading](14-Eager-loading.md)
15. [N+1](15-N-1.md)
16. [Fetch strategies](16-Fetch-strategies.md)
17. [Repository boundary](17-Repository-boundary.md)
18. [Nullable DB columns](18-Nullable-DB-columns.md)
19. [Value classes in persistence awareness](19-Value-classes-in-persistence-awareness.md)
20. [Schema migrations](20-Schema-migrations.md)
21. [Long transactions](21-Long-transactions.md)
22. [Remote calls inside transactions](22-Remote-calls-inside-transactions.md)
23. [Exposed/jOOQ awareness](23-Exposed-jOOQ-awareness.md)

---

# 2. Real-Life Analogy

Day 21 keeps the GOJ structure familiar while translating it into Kotlin-native language, JVM, coroutine, and backend engineering decisions.

---

# 3. Visualization

```text
Service → transaction/pool → SQL/JPA → DB locks → commit/rollback
```

---

# 4. Mind Map

```text
SQL, JDBC, Transactions, JPA/Hibernate & Kotlin Data Access
├── Kotlin Semantics
├── JVM / Platform Internals
├── Coroutines / Runtime
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
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

---

# 6. Engineering Integration

Connect:

> **Concept → Kotlin Guarantee → JVM/Coroutine/Framework Behavior → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Implement parameterized SQL and a transaction; compare JDBC/JPA/Kotlin-friendly data access approaches.

---

# 8. Google Interview Drill

Explain JPA proxy/open/no-arg pitfalls with Kotlin classes and how plugins/design address them.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Java-like Kotlin instead of Kotlin-native modeling.
- `!!` used instead of proving nullability.
- Read-only treated as deep immutable.
- Global/unstructured coroutines.
- Blocking I/O on wrong dispatcher.
- Overusing scope functions/extensions.
- Ignoring JVM and Java interoperability.

---

# 10. Day-Level Best Practices

- Null-safe by design.
- Final/composition/delegation first.
- Structured concurrency.
- Explicit blocking boundaries.
- Sealed/data/value types where they simplify domain modeling.
- JVM evidence before tuning.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does Kotlin guarantee?
3. What is JVM/framework-specific?
4. What production failure could result from misunderstanding this topic?
5. What would you review in AI-generated code?
6. What alternative would be simpler?

---

# 12. Google-Level Follow-Ups

1. What changes at a Java boundary?
2. What changes under concurrency?
3. What happens when the operation blocks?
4. What changes at 10× traffic/data?
5. What would you profile/trace?
6. What would you choose differently in Android vs backend?

---

# 13. Quick Revision

```text
What is it?
Why?
What does Kotlin guarantee?
What is JVM/coroutine/framework specific?
Show code.
What breaks?
How do I debug it?
What do I review?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization.
- [ ] I completed hands-on work.
- [ ] I completed the Google drill.
- [ ] I can distinguish language vs JVM/framework behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
