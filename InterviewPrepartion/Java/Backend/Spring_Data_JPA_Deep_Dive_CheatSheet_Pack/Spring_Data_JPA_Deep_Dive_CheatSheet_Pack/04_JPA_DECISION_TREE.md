# Spring Data / JPA Decision Tree

```text
Need ordinary transactional relational CRUD/domain persistence?
→ JPA + Spring Data JPA

Need dynamic filters?
→ Specification

Need simple probe matching?
→ Query by Example

Need optimized read shape?
→ DTO/interface Projection

Need exact DB-specific query?
→ Native SQL / JdbcClient / custom repository

Need large deep pagination?
→ Keyset/Window

Need read-modify-write concurrency?
├─ low contention → @Version optimistic lock
└─ short high contention → pessimistic lock

Need huge batch/ETL?
→ JDBC batching / bulk JPQL / JdbcClient / Spring Batch
  rather than keeping millions of managed entities

Need end-to-end reactive database access?
→ R2DBC, not JpaRepository wrapped in Mono
```
