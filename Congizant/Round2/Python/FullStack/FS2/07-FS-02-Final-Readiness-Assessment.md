# FS-02 — Final Readiness Assessment

**Priority:** P0  
**Suggested Time:** 60 minutes  
**Rule:** Answer/query without notes first. Repair only weak areas.

---

# 1. Rapid Recall — 12 Minutes

Answer in 30–60 seconds:

1. Primary vs unique key?
2. Foreign key?
3. Why normalize?
4. When denormalize?
5. INNER vs LEFT join?
6. WHERE vs HAVING?
7. EXISTS?
8. CTE?
9. Window function?
10. ROW_NUMBER vs RANK?
11. NULL comparison?
12. ACID?
13. Isolation levels?
14. MVCC?
15. Deadlock?
16. Optimistic locking?
17. Why index?
18. Composite index?
19. Why indexes hurt writes?
20. What is EXPLAIN?
21. N+1?
22. Lazy vs eager?
23. Connection pool?
24. Parameterized query?
25. Replica lag?
26. Partition vs shard?
27. SQL vs NoSQL?

---

# 2. SQL Coding — 12 Minutes

## Problem

Find top 3 salaries per department including ties.

Expected direction:

```sql
DENSE_RANK() OVER (
    PARTITION BY department_id
    ORDER BY salary DESC
)
```

Explain tie semantics.

---

# 3. Transaction Scenario — 10 Minutes

Two buyers attempt to purchase the last unit.

Explain:

- unsafe read-then-write;
- atomic conditional update or locking/versioning;
- affected-row check;
- rollback;
- retry policy.

---

# 4. Performance Scenario — 10 Minutes

Orders table = 100M rows.

Query:

```sql
SELECT order_id, total
FROM orders
WHERE customer_id = ?
ORDER BY created_at DESC
LIMIT 20 OFFSET 1000000;
```

Discuss:

- plan;
- composite index;
- keyset pagination;
- stable tie-breaker;
- why more API pods do not fix DB scan cost.

---

# 5. ORM / Review Scenario — 6 Minutes

Endpoint loads 500 users and lazily loads orders.

Explain N+1 and fix options.

---

# 6. Google Interview Drill — 10 Minutes

## Design Data Layer for AI Document Platform

Need:

- users/permissions;
- document metadata;
- file content;
- embeddings;
- processing jobs;
- search results.

Use:

> **Clarify → First Design → Improve → Test → Edge Cases → Trade-Off → Follow-Up → Defend**

Expected reasoning may include:

```text
Relational DB → users, ACL, jobs, metadata
Object storage → documents
Vector store → embeddings/search
Cache → hot derived results where valid
```

Do not force everything into one store.

---

# 7. Scoring Rubric

| Dimension | Weight | Score |
|---|---:|---:|
| Data Modeling & SQL Correctness | 20% | ___ / 20 |
| Query Design & Optimization | 20% | ___ / 20 |
| Transactions / Concurrency | 20% | ___ / 20 |
| Google Interview Drill | 20% | ___ / 20 |
| ORM / Security / Data Access | 10% | ___ / 10 |
| Architect-Level Defense | 10% | ___ / 10 |
| **Total** | **100%** | **___ / 100** |

---

# 8. Readiness Gate

FS-02 is READY only if:

- [ ] 80%+ overall
- [ ] no P0 weakness
- [ ] schema design is sound
- [ ] joins/windows can be written
- [ ] ACID/isolation can be explained
- [ ] concurrency anomaly can be solved
- [ ] index can be justified
- [ ] slow query can be diagnosed
- [ ] N+1/pool understood
- [ ] SQL injection prevented
- [ ] migration/scaling trade-offs defended
- [ ] AI data-store selection defended

---

# 9. Final Quick Notes

```text
Model integrity first
Know result grain before JOIN
Window ≠ GROUP BY
NULL uses IS NULL
Transaction protects business invariant
MVCC ≠ no locks
Deadlocks can happen; retry safely
Index real access paths
EXPLAIN before guessing
N+1 = repeated hidden queries
Pool size must respect DB capacity
Parameterized SQL
Safe migrations use compatibility
Replica may lag
Partition ≠ shard
Choose SQL/NoSQL/store by access pattern
```

---

# 10. Decision

### READY

Move to:

> **FS-03 — React, JavaScript/TypeScript & Full-Stack Integration**

### REPAIR

Return only to weak topics.

---

> **GOJ Rule: Repair the gap, not the whole syllabus.**
