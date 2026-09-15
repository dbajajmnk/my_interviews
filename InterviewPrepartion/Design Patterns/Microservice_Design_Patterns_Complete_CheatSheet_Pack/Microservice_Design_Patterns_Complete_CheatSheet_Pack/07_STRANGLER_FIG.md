# Strangler Fig Pattern

## Intent
Incrementally replace a monolith.

## Visual
```text
Client
 ↓
Router/Gateway
 ├── old capability → Monolith
 └── migrated capability → New Service
```

## Use When
Large rewrite is too risky.

## Benefit
Gradual migration and rollback.

## Trap
Do not maintain duplicated business logic indefinitely.
