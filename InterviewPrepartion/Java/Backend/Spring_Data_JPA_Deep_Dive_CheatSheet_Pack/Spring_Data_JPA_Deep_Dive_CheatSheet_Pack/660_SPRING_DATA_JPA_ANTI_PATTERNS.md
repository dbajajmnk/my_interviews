# Spring Data JPA Anti Patterns

## What / Why
Entity everywhere, EAGER everywhere, save managed entities, OSIV reliance, N+1, giant aggregates, no indexes, H2-only tests.

## Mental Model
```text
Spring Data JPA Anti Patterns → persistence context → generated SQL → database behavior
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
> **Spring Data JPA Anti Patterns:** Entity everywhere, EAGER everywhere, save managed entities, OSIV reliance, N+1, giant aggregates, no indexes, H2-only tests.
