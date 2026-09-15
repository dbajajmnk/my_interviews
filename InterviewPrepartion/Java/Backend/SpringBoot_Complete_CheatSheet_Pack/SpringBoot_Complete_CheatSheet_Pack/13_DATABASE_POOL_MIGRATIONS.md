# Database, Connection Pool & Migrations

```text
Application → Connection Pool → JDBC Driver → Database
```

## Pool Concerns
Max pool size, connection timeout, idle timeout, DB connection limit, query latency, transaction duration.

## Migrations
Common: Flyway, Liquibase.

## Rule
Schema evolution should be versioned and repeatable.

## Trap
Increasing pool size is not automatically a performance fix; it can overload the database.

## Debug Order
```text
Threads → Pool Saturation → Slow Query → Locking → DB Capacity → Network
```
