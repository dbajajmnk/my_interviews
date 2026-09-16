# When Not to Use JPA

## What / Why
Complex analytical SQL, bulk ETL, highly specialized DB features or reactive end-to-end stack may fit SQL/JdbcClient/jOOQ/R2DBC better.

## Mental Model
```text
When Not to Use JPA → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **When Not to Use JPA:** Complex analytical SQL, bulk ETL, highly specialized DB features or reactive end-to-end stack may fit SQL/JdbcClient/jOOQ/R2DBC better.
