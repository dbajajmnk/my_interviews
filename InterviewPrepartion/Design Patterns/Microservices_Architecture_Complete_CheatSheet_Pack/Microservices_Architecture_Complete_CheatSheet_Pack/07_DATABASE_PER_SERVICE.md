# Database per Service

## Principle

Each service owns its persistence.

```text
Order Service → Order DB
Payment Service → Payment DB
Inventory Service → Inventory DB
```

## Why

- autonomy
- independent schema evolution
- failure isolation
- team ownership

## Cross-Service Queries

Prefer:

```text
API composition
CQRS read model
events
data products
```

rather than SQL joins across private databases.

## Trap

“Separate schemas in one DB” can be a transitional compromise, but ownership boundaries still matter.
