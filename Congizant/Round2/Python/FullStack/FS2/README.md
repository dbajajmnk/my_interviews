# GOJ Interview Preparation — Cognizant
## Area 03 — Full Stack
### FS-02 — SQL, Database & Data Access

**Role:** Python Full Stack Development Architect with AI  
**Company:** Cognizant  
**Interview Date:** 24 August 2026  
**Interview Time:** 3:00 PM – 4:00 PM  
**Experience Level:** 16+ Years  
**Priority:** P0  
**GOJ Mapping:** M18 Database & Data Access + selected M20 Performance & Security + M21 Architecture  
**Baseline:** KIS + DRY + SOLID + Google-Level + 360° Coverage  
**Execution Rule:** One file at a time → readiness gate → repair only weak areas

> **Source Rule:** No detailed JD was provided. This pack is role-derived and vendor-neutral. PostgreSQL/MySQL examples are used only where useful; do not assume either is the Cognizant client database.

---

# 1. Pack Objective

FS-02 prepares you to reason about relational data, SQL, transactions, indexes, ORM/data access, and production database behavior at architect depth.

By the end of this pack you should be able to:

- design normalized relational schemas;
- explain keys, constraints, relationships, and integrity;
- write and review joins, subqueries, CTEs, aggregations, and window functions;
- explain ACID, transactions, isolation levels, locking, deadlocks, and MVCC conceptually;
- choose and defend indexes;
- read query-plan concepts and diagnose slow SQL;
- explain N+1, eager/lazy loading, connection pooling, and transaction boundaries;
- prevent SQL injection and unsafe dynamic queries;
- discuss pagination, batching, bulk operations, migrations, and schema evolution;
- choose SQL vs NoSQL based on access patterns and consistency needs;
- design data access for full-stack and AI-enabled systems;
- survive architect-level database trade-off follow-ups.

Target:

> **Model → Query → Protect Integrity → Transact → Optimize → Scale → Observe → Defend**

---

# 2. Directory Structure

```text
GOJ-Cognizant-FS-02-Final/
│
├── README.md
├── 01-Relational-Modeling-Keys-Constraints-and-Normalization.md
├── 02-SQL-Joins-Subqueries-CTEs-Aggregations-and-Window-Functions.md
├── 03-Transactions-Isolation-Locking-MVCC-and-Deadlocks.md
├── 04-Indexes-Execution-Plans-and-Query-Optimization.md
├── 05-ORM-NPlus1-Connection-Pooling-and-Data-Access.md
├── 06-Database-Security-Migrations-Scaling-and-Architecture.md
└── 07-FS-02-Final-Readiness-Assessment.md
```

KIS rule:

- no separate SQL exercise folder;
- SQL practice stays inside the relevant file;
- vendor-specific internals are kept secondary;
- focus on concepts, engineering decisions, and interview survival.

---

# 3. Time Allocation

| File | Focus | Suggested Time |
|---|---|---:|
| 01 | Modeling, keys, constraints, normalization | 55 min |
| 02 | SQL queries, joins, CTEs, windows | 85 min |
| 03 | Transactions, isolation, MVCC, deadlocks | 70 min |
| 04 | Indexes, plans, optimization | 75 min |
| 05 | ORM, N+1, pooling, data access | 65 min |
| 06 | Security, migrations, scaling, architecture | 65 min |
| 07 | Final readiness assessment | 60 min |
| **Total** |  | **~7 hr 55 min** |

Time rule:

> **Do not memorize SQL tricks. Understand data shape, access pattern, consistency, and cost.**

---

# 4. Locked GOJ Google-Level File Standard

Every learning file follows:

> **Objective → 5W+H → Real-Life Analogy → Visualization → Mind Map → Core Concepts → Engineering Depth → Implementation / Code → Hands-On Practice → Google Interview Drill → Common Mistakes → Best Practices → Interview Questions → Google-Level Follow-Ups → Quick Revision → Readiness Gate → References**

Mandatory reasoning flow:

> **Clarify → First Approach → Improve → Query / Design → Test → Edge Cases → Complexity / Cost → Trade-Off → Follow-Up → Defend**

---

# 5. Database Interview Standard

For every database question:

```text
1. Clarify data model
2. Clarify read/write pattern
3. Define integrity/consistency need
4. Write simplest correct query/design
5. Analyze cardinality and cost
6. Add index only when justified
7. Define transaction boundary
8. Consider concurrency/failure
9. Test edge cases
10. Add observability
11. Scale only the actual bottleneck
12. Defend trade-offs
```

---

# 6. Final Scoring Standard

| Dimension | Weight |
|---|---:|
| Data Modeling & SQL Correctness | 20% |
| Query Design & Optimization | 20% |
| Transactions / Concurrency | 20% |
| Google Interview Drill | 20% |
| ORM / Security / Data Access | 10% |
| Architect-Level Defense | 10% |
| **Total** | **100%** |

### READY

- 80%+ overall;
- no critical P0 weakness;
- can write joins/aggregations/windows;
- can explain transaction isolation;
- can justify indexes;
- can diagnose N+1/slow query;
- can defend database architecture.

---

# 7. FS-02 Completion Criteria

You must be able to:

- explain normalization pragmatically;
- choose primary/foreign/unique constraints;
- write joins correctly;
- use CTE/window functions;
- explain ACID;
- explain common isolation anomalies;
- explain deadlocks and mitigation;
- explain MVCC at conceptual level;
- design index based on access path;
- explain why indexes can hurt writes;
- identify N+1;
- explain connection pooling;
- use parameterized queries;
- design safe migrations;
- choose SQL vs NoSQL based on requirements.

---

# 8. Next Pack

After FS-02:

> **FS-03 — React, JavaScript/TypeScript & Full-Stack Integration**
