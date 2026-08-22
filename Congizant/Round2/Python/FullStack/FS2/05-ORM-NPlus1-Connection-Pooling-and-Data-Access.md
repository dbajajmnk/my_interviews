# FS-02 / File 05 — ORM, N+1, Connection Pooling & Data Access

**Priority:** P0  
**Suggested Time:** 65 minutes  
**GOJ Mapping:** M18 Database & Data Access

---

# 1. Objective

Master:

- ORM purpose;
- object-relational impedance mismatch awareness;
- lazy/eager loading;
- N+1;
- unit of work/session concepts;
- connection pooling;
- transaction boundaries;
- batching/bulk operations;
- raw SQL vs ORM;
- repository/data-access patterns.

---

# 2. 5W+H

## What?

ORM maps application objects/queries to relational data operations.

## Why?

It improves productivity and consistency but can hide expensive SQL.

## Where?

Django ORM, SQLAlchemy, other Python data layers.

## When?

Most CRUD/domain applications benefit; critical queries may still use optimized SQL.

## How?

Model mappings + query abstraction + session/transaction lifecycle.

---

# 3. Real-Life Analogy

An ORM is a translator.

A good translator saves time, but if you never listen to the translated result, you may miss expensive or incorrect meaning.

Always know what SQL your ORM generates for critical paths.

---

# 4. Visualization

```text
Python Model / Query
       ↓
      ORM
       ↓
Generated SQL
       ↓
Connection Pool
       ↓
Database
```

---

# 5. Mind Map

```text
Data Access
│
├── ORM
├── Lazy Load
├── Eager Load
├── N+1
├── Session/UoW
├── Pool
├── Batch
├── Raw SQL
└── Repository
```

---

# 6. Core Concepts

## 6.1 ORM Benefits

- less boilerplate;
- model mapping;
- migrations integration;
- query composition;
- productivity;
- consistent parameterization.

---

## 6.2 ORM Risks

- hidden N+1;
- over-fetching;
- accidental lazy queries;
- inefficient joins;
- abstraction leakage;
- misuse of long-lived sessions.

---

## 6.3 N+1

Example:

```text
1 query: load 100 users
100 queries: load each user's orders
```

Total 101 queries.

Solutions:

- eager loading;
- explicit join/prefetch;
- batch query;
- projection.

Do not solve by blindly loading entire object graph.

---

## 6.4 Lazy Loading

Loads relationship on access.

Good:

- avoids unnecessary data.

Risk:

- hidden I/O;
- N+1;
- query outside transaction/session;
- serialization surprises.

---

## 6.5 Eager Loading

Loads related data upfront.

Risk:

- giant joins;
- duplicate row multiplication;
- memory.

Choose based on use case.

---

## 6.6 Connection Pool

Creating DB connection per request is expensive.

Pool reuses connections.

Important controls:

- pool size;
- timeout;
- max overflow;
- connection lifetime;
- health/recycle.

---

## 6.7 Pool Exhaustion

If API concurrency = 500 and DB pool = 20:

many requests may wait for DB connection.

Adding API workers can worsen DB pressure.

---

## 6.8 Transaction Boundary

Do not let ORM session live across unrelated request operations.

Common approach:

> transaction/session scoped to one application use case/request segment.

---

## 6.9 Batch / Bulk

Instead of:

```text
1000 individual INSERTs
```

use batch/bulk where semantics permit.

But bulk operations may bypass ORM hooks/events depending framework.

---

## 6.10 Raw SQL vs ORM

Use ORM for maintainability/productivity.

Use raw SQL when:

- query is complex;
- performance requires precise control;
- database feature not well represented.

Do not treat raw SQL as failure.

---

# 7. Engineering Depth

## 7.1 Repository Pattern

Can isolate domain/application from data technology.

But generic CRUD repository may add no value over ORM.

Use only when it creates meaningful boundary.

---

## 7.2 Async ORM/Driver

Async only helps if database driver and stack are non-blocking and DB capacity exists.

Async can increase concurrency and overload DB faster without limits.

---

# 8. Implementation / Code

Conceptual SQLAlchemy-style awareness:

```python
# bad conceptual pattern:
users = session.query(User).all()

for user in users:
    print(user.orders)  # possible lazy N+1
```

Fix using explicit eager/batch strategy appropriate to ORM.

Exact APIs vary by version/framework.

---

# 9. Hands-On Practice

Explain how you would diagnose:

> endpoint executes 501 SQL queries for 500 users.

Expected:

- trace/log SQL count;
- identify lazy relationship;
- batch/eager query;
- verify row explosion;
- compare latency.

---

# 10. Google Interview Drill

## Problem — Product Listing API Times Out

Endpoint returns:

- 100 products;
- category;
- inventory;
- latest price.

ORM generates 301 queries.

### Clarify

- required fields?
- relationships?
- response size?
- freshness?
- pagination?

### First Approach

Increase timeout.

Wrong root fix.

### Improve

- inspect SQL;
- batch/eager load needed relationships;
- projection to response DTO;
- indexes;
- cache inventory only if semantics allow.

### Test

- query count;
- latency;
- row count;
- missing relationships.

### Follow-Up

At high traffic:

- DB pool?
- cache?
- replica?
- stale tolerance?
- pagination?

---

# 11. Common Mistakes

1. ORM means no SQL knowledge needed.
2. Eager load everything.
3. Lazy load inside serialization unknowingly.
4. Giant connection pool.
5. One DB connection per request creation.
6. Long-lived session.
7. Generic repository everywhere.
8. Raw SQL forbidden.
9. Async ORM assumed faster automatically.

---

# 12. Best Practices

- inspect generated SQL;
- monitor query count;
- explicit loading strategy;
- project only needed columns;
- right-size pool;
- keep transaction/session scoped;
- batch operations;
- use raw SQL when justified.

---

# 13. Interview Questions

1. Why ORM?
2. ORM disadvantages?
3. N+1?
4. Lazy vs eager?
5. How fix N+1?
6. Connection pool?
7. How size pool?
8. Session/transaction scope?
9. Raw SQL vs ORM?
10. Repository pattern value?

---

# 14. Google-Level Follow-Ups

1. 1000 API workers?
2. DB only allows 200 connections?
3. async backend?
4. read replica?
5. cache?
6. query count regression?
7. batch write failure?

---

# 15. Quick Revision

```text
ORM = productivity, not escape from SQL
N+1 = hidden repeated queries
Lazy = deferred I/O
Eager = upfront I/O
Pool = reusable connections
Pool size follows DB capacity
Transaction/session scope must be explicit
Raw SQL is valid when justified
```

---

# 16. Readiness Gate

- [ ] ORM benefits/risks.
- [ ] N+1.
- [ ] Lazy/eager.
- [ ] Pool.
- [ ] Transaction scope.
- [ ] Batch/bulk.
- [ ] Raw SQL trade-off.
- [ ] Product-listing drill.

**Gate:** READY / REPAIR

---

# 17. References

- SQLAlchemy documentation
- Django ORM documentation
- Database driver/pooling documentation
