# FS-02 / File 02 — SQL Joins, Subqueries, CTEs, Aggregations & Window Functions

**Priority:** P0  
**Suggested Time:** 85 minutes  
**GOJ Mapping:** M18 Database & Data Access

---

# 1. Objective

Master:

- SELECT/filter/order;
- INNER/LEFT joins;
- grouping;
- HAVING;
- subqueries;
- EXISTS;
- CTEs;
- window functions;
- ranking;
- running totals;
- duplicate-safe querying;
- SQL reasoning.

---

# 2. 5W+H

## What?

SQL expresses what data is required; optimizer decides an execution strategy.

## Why?

Correct data retrieval is core to full-stack backend performance and correctness.

## Where?

APIs, reports, analytics, operational workflows.

## When?

Every relational data access path.

## How?

Start from result grain → choose tables → joins → filters → grouping/windowing → ordering.

---

# 3. Real-Life Analogy

A join is like matching records from two filing cabinets using a shared identifier.

The most important question is:

> What should one output row represent?

That is the **grain**.

---

# 4. Visualization

```text
Customer          Order
--------          -----
id                id
name              customer_id
                  total

INNER JOIN:
customers with matching orders

LEFT JOIN:
all customers, matching order when present
```

---

# 5. Mind Map

```text
SQL Querying
│
├── SELECT
├── WHERE
├── JOIN
├── GROUP BY
├── HAVING
├── Subquery
├── EXISTS
├── CTE
└── Window Function
```

---

# 6. Core Concepts

## 6.1 INNER JOIN

```sql
SELECT c.customer_id, o.order_id
FROM customer c
JOIN orders o
  ON o.customer_id = c.customer_id;
```

Returns matching rows.

---

## 6.2 LEFT JOIN

```sql
SELECT c.customer_id, o.order_id
FROM customer c
LEFT JOIN orders o
  ON o.customer_id = c.customer_id;
```

Keeps all customers.

---

## 6.3 Join Multiplication

One customer with five orders produces five joined rows.

If you then join order items, row count grows again.

Architect lesson:

> Understand cardinality before aggregating.

---

## 6.4 WHERE vs HAVING

`WHERE` filters rows before grouping.

`HAVING` filters grouped results.

```sql
SELECT customer_id, COUNT(*) AS order_count
FROM orders
WHERE created_at >= :start_date
GROUP BY customer_id
HAVING COUNT(*) >= 5;
```

---

## 6.5 Subquery

```sql
SELECT *
FROM orders
WHERE customer_id IN (
    SELECT customer_id
    FROM vip_customer
);
```

Readable depending case.

---

## 6.6 EXISTS

Useful when asking whether a matching row exists.

```sql
SELECT c.*
FROM customer c
WHERE EXISTS (
    SELECT 1
    FROM orders o
    WHERE o.customer_id = c.customer_id
);
```

Can avoid duplicate customer rows from a join when only existence matters.

---

## 6.7 CTE

```sql
WITH recent_orders AS (
    SELECT *
    FROM orders
    WHERE created_at >= :start_date
)
SELECT customer_id, COUNT(*)
FROM recent_orders
GROUP BY customer_id;
```

CTEs improve readability and composition.

Do not assume every CTE is automatically faster.

---

## 6.8 Window Function

Window functions calculate across related rows without collapsing result rows.

Example:

```sql
SELECT
    customer_id,
    order_id,
    total,
    ROW_NUMBER() OVER (
        PARTITION BY customer_id
        ORDER BY created_at DESC
    ) AS rn
FROM orders;
```

---

## 6.9 Top Order per Customer

```sql
WITH ranked AS (
    SELECT
        o.*,
        ROW_NUMBER() OVER (
            PARTITION BY customer_id
            ORDER BY total DESC
        ) AS rn
    FROM orders o
)
SELECT *
FROM ranked
WHERE rn = 1;
```

---

## 6.10 Running Total

```sql
SELECT
    order_id,
    created_at,
    total,
    SUM(total) OVER (
        ORDER BY created_at
    ) AS running_total
FROM orders;
```

---

# 7. Engineering Depth

## 7.1 `IN` vs `EXISTS`

Do not memorize:

> EXISTS is always faster.

Optimizer, data shape, null semantics, and query form matter.

Choose semantically correct form and inspect plan for critical paths.

---

## 7.2 NULL

Important:

```sql
NULL = NULL
```

is not true; it is unknown.

Use:

```sql
IS NULL
```

SQL uses three-valued logic.

This can surprise `NOT IN` queries if subquery returns NULL.

---

## 7.3 `COUNT(*)` vs `COUNT(column)`

`COUNT(*)` counts rows.

`COUNT(column)` counts non-NULL values in that column.

---

# 8. Implementation / Code

## Latest Order per Customer

```sql
WITH ranked AS (
    SELECT
        o.*,
        ROW_NUMBER() OVER (
            PARTITION BY customer_id
            ORDER BY created_at DESC
        ) AS rn
    FROM orders o
)
SELECT *
FROM ranked
WHERE rn = 1;
```

---

# 9. Hands-On Practice

Write queries for:

1. customers with no orders;
2. top 3 orders per customer;
3. monthly revenue;
4. duplicate emails;
5. customers with >5 orders;
6. running revenue total.

---

# 10. Google Interview Drill

## Problem — Top 3 Salaries per Department

Table:

```text
employee(id, department_id, salary)
```

### Clarify

- ties?
- top 3 employees or top 3 distinct salary levels?

This changes solution.

### First Approach

Correlated subquery / complex counting.

### Improve

Use window:

```sql
SELECT *
FROM (
    SELECT
        e.*,
        DENSE_RANK() OVER (
            PARTITION BY department_id
            ORDER BY salary DESC
        ) AS salary_rank
    FROM employee e
) x
WHERE salary_rank <= 3;
```

Use `ROW_NUMBER` if exactly three rows are required despite ties.

### Test

- fewer than 3 employees;
- equal salaries;
- NULL salary policy.

### Follow-Up

What index helps?

Potential:

```text
(department_id, salary DESC)
```

depending DB/query plan.

---

# 11. Common Mistakes

1. Wrong join type.
2. Missing join predicate.
3. Aggregating after row multiplication without realizing it.
4. WHERE/HAVING confusion.
5. `= NULL`.
6. `NOT IN` with NULL surprise.
7. Window function confused with GROUP BY.
8. Ranking tie semantics ignored.
9. Assuming CTE always materializes/is faster.

---

# 12. Best Practices

- define result grain first;
- use aliases clearly;
- parameterize values;
- understand join cardinality;
- use EXISTS for existence semantics;
- use windows for rank/running metrics;
- test NULL/tie cases.

---

# 13. Interview Questions

1. INNER vs LEFT join?
2. WHERE vs HAVING?
3. Subquery vs CTE?
4. EXISTS vs JOIN?
5. Window vs GROUP BY?
6. ROW_NUMBER vs RANK vs DENSE_RANK?
7. COUNT(*) vs COUNT(col)?
8. NULL semantics?
9. How find duplicates?
10. How find top N per group?

---

# 14. Google-Level Follow-Ups

1. ties?
2. billions of rows?
3. index?
4. partitioned table?
5. latest row per group?
6. pagination of ranked results?
7. NULL handling?

---

# 15. Quick Revision

```text
INNER = matches
LEFT = preserve left
WHERE = rows
HAVING = groups
EXISTS = existence
CTE = readable named query
Window = analytics without collapsing rows
ROW_NUMBER = unique sequence
RANK = gaps with ties
DENSE_RANK = no gaps
NULL uses IS NULL
```

---

# 16. Readiness Gate

- [ ] Joins.
- [ ] Group/HAVING.
- [ ] EXISTS.
- [ ] CTE.
- [ ] Window functions.
- [ ] NULL.
- [ ] Top-N-per-group drill.

**Gate:** READY / REPAIR

---

# 17. References

- PostgreSQL / MySQL SQL documentation
- SQL window function documentation
