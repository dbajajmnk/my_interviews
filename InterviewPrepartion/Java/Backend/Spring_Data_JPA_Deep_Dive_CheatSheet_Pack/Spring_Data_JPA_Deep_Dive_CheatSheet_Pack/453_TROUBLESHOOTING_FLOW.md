# Spring Data / JPA Troubleshooting — Golden Flow

```text
1. Transaction
   ├─ active?
   ├─ proxy applied?
   └─ rollback/commit?

2. Entity State
   ├─ transient?
   ├─ managed?
   ├─ detached?
   └─ removed?

3. Persistence Context
   ├─ stale?
   ├─ dirty?
   ├─ flush?
   └─ too large?

4. Query / Fetch
   ├─ derived/JPQL/native?
   ├─ fetch graph?
   ├─ N+1?
   └─ count/pagination?

5. SQL / DB
   ├─ generated SQL?
   ├─ indexes?
   ├─ lock?
   ├─ execution plan?
   └─ constraint?

6. Provider
   ├─ Hibernate-specific setting?
   ├─ batching?
   └─ cache?
```
