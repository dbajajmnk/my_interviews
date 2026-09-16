# Spring Data / JPA Production Checklist

## Mapping
- explicit ownership/cascade
- LAZY-first association strategy where appropriate
- no accidental giant graphs
- stable equals/hashCode
- indexes/unique constraints match model

## Transactions
- service-layer business boundaries
- no slow remote calls inside DB transaction
- correct rollback rules
- concurrency strategy defined
- lock timeout configured where used

## Queries
- SQL inspected
- N+1 tested
- projections for read-heavy endpoints
- pagination/count cost measured
- dynamic filters safe/parameterized

## Performance
- JDBC pool sized to DB capacity
- batching verified in SQL
- persistence context bounded in bulk jobs
- slow-query/EXPLAIN process
- cache only where justified

## Operations
- Flyway/Liquibase migrations
- production database integration tests
- metrics/traces
- tenant isolation
- backup/recovery handled at DB layer
