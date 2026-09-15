# API Composition

## Intent
Join data at application/API level when databases are service-owned.

```text
Composer
 ├── Customer Service
 ├── Order Service
 └── Payment Service
```

## Benefit
Avoids shared database.

## Trade-off
Network latency and partial failure.

## Related
CQRS, Materialized View.
