# FS-02 / File 04 — Indexes, Execution Plans & Query Optimization

**Priority:** P0  
**Suggested Time:** 75 minutes  
**GOJ Mapping:** M18 + M20 Performance

---

# 1. Objective

Master:

- index purpose;
- B-tree concept;
- composite index;
- selectivity/cardinality;
- covering/index-only awareness;
- write cost;
- execution plans;
- scans/joins/sorts;
- slow query diagnosis;
- pagination optimization.

---

# 2. 5W+H

## What?

An index is a data structure helping the database locate/order rows without scanning all data.

## Why?

Correct indexes can dramatically reduce query work.

## Where?

Filters, joins, ordering, uniqueness, range queries.

## When?

Add based on real access patterns and plans.

## How?

Match query predicates/order with index structure and data distribution.

---

# 3. Real-Life Analogy

A book index helps you find “transactions” without reading every page.

But maintaining an index costs extra work whenever the book changes.

---

# 4. Visualization

```text
Without Index:
Table → scan many rows → filter

With Index:
Index → locate candidate rows → fetch rows
```

Composite:

```text
Index(a, b)

supports left-prefix access patterns around:
a
a + b
```

Exact optimizer behavior varies.

---

# 5. Mind Map

```text
Performance
│
├── Index
│   ├── single
│   ├── composite
│   └── unique
├── Selectivity
├── Execution Plan
├── Scan
├── Join
├── Sort
└── Pagination
```

---

# 6. Core Concepts

## 6.1 B-Tree Index

Common relational index suited to:

- equality;
- range;
- ordered traversal.

Do not assume every DB/index is B-tree, but it is common/default.

---

## 6.2 Index Cost

Indexes:

- use disk/memory;
- slow inserts/updates/deletes;
- require maintenance;
- can confuse design if excessive.

More indexes ≠ faster database.

---

## 6.3 Composite Index

For query:

```sql
SELECT *
FROM orders
WHERE customer_id = ?
  AND created_at >= ?
ORDER BY created_at DESC;
```

Potential index:

```text
(customer_id, created_at DESC)
```

depending DB/workload.

Order matters.

---

## 6.4 Selectivity

An index on low-cardinality field such as boolean may be less useful by itself for many workloads.

But combined/partial indexes can still be useful depending database.

Do not make universal claims.

---

## 6.5 Foreign Key Index

Some DBs may not automatically create index on FK column. Join/delete/update performance may benefit from one.

Know your database.

---

## 6.6 Execution Plan

Use `EXPLAIN` / equivalent.

Look for:

- sequential/full scan;
- index scan;
- row estimates;
- joins;
- sorts;
- actual vs estimated rows where analyze option used;
- expensive operators.

Do not read plan by only looking for “index used yes/no.”

---

## 6.7 Query Optimization Flow

```text
Slow query
 ↓
Measure
 ↓
Plan
 ↓
Cardinality / estimates
 ↓
Indexes
 ↓
Query shape
 ↓
Data access volume
 ↓
Retest
```

---

## 6.8 `SELECT *`

Problems:

- unnecessary I/O;
- larger network payload;
- coupling to schema;
- may prevent covering/index-only benefits.

Select needed columns.

---

## 6.9 Pagination

Large offset:

```sql
LIMIT 20 OFFSET 1000000
```

DB may still process/skip many rows.

Keyset/cursor:

```sql
WHERE (created_at, id) < (:created_at, :id)
ORDER BY created_at DESC, id DESC
LIMIT 20
```

can scale better for ordered traversal.

---

# 7. Engineering Depth

## 7.1 Index Is Not Enough

Slow query may come from:

- N+1;
- too many rows returned;
- poor join;
- stale statistics;
- lock wait;
- I/O;
- connection pool;
- network;
- bad pagination.

---

## 7.2 Function on Indexed Column

Query:

```sql
WHERE LOWER(email) = ?
```

may not use a normal `email` index as expected.

Possible functional/expression index depending DB.

Architecture rule:

> inspect plan.

---

# 8. Implementation / Code

Potential index:

```sql
CREATE INDEX idx_orders_customer_created
ON orders(customer_id, created_at);
```

Vendor syntax/options vary.

---

# 9. Hands-On Practice

Given:

```sql
SELECT order_id, total
FROM orders
WHERE customer_id = ?
ORDER BY created_at DESC
LIMIT 20;
```

Propose candidate index and explain.

---

# 10. Google Interview Drill

## Problem — Orders API Becomes Slow at 100M Rows

Endpoint:

```text
GET /customers/{id}/orders?page=50000
```

SQL uses huge OFFSET.

### Clarify

- stable sort key?
- random page jumps required?
- latest-first browsing?
- SLA?
- query plan?

### First Approach

Add more API pods.

Does not solve DB scan work.

### Improve

Use cursor/keyset pagination and composite index:

```text
(customer_id, created_at, order_id)
```

exact order tuned to query/database.

### Test

- duplicate timestamps;
- new inserts while paging;
- deleted rows;
- cursor tampering.

### Follow-Up

- partitioning?
- archive?
- read replica?
- cache?
- sharding?

Only after measuring actual bottleneck.

---

# 11. Common Mistakes

1. Index every column.
2. Ignore index order.
3. “Index means O(1).”
4. No execution plan.
5. Optimize query from intuition only.
6. Huge OFFSET.
7. `SELECT *`.
8. Ignore write amplification.
9. Ignore lock/connection waits.

---

# 12. Best Practices

- index real access paths;
- inspect execution plan;
- keep index count justified;
- select needed columns;
- use stable keyset pagination for deep traversal;
- measure before/after;
- monitor query latency.

---

# 13. Interview Questions

1. What is an index?
2. Why can indexes hurt writes?
3. Composite index?
4. Why order matters?
5. Selectivity?
6. Covering/index-only concept?
7. How read EXPLAIN?
8. Why query may ignore index?
9. Offset vs cursor pagination?
10. How diagnose slow query?

---

# 14. Google-Level Follow-Ups

1. 100M rows?
2. index bigger than memory?
3. heavy writes?
4. read replica?
5. partition?
6. stale estimates?
7. skewed data?
8. multi-tenant index?

---

# 15. Quick Revision

```text
Index reduces lookup work, costs writes/storage
Composite order matters
EXPLAIN before guessing
Slow SQL ≠ always missing index
SELECT only needed columns
Deep pagination → keyset/cursor
Measure before/after
```

---

# 16. Readiness Gate

- [ ] Index purpose/cost.
- [ ] Composite index.
- [ ] Selectivity.
- [ ] Execution-plan reasoning.
- [ ] Slow-query flow.
- [ ] Cursor pagination.
- [ ] 100M-row drill.

**Gate:** READY / REPAIR

---

# 17. References

- PostgreSQL EXPLAIN / indexing docs
- MySQL EXPLAIN / indexing docs
