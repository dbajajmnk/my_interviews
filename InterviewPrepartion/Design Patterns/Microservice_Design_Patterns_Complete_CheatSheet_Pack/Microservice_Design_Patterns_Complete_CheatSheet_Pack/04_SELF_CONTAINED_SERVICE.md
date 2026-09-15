# Self-Contained Service

## Intent
A service should own enough UI/API/business/data responsibilities to evolve independently.

## Visual
```text
Service
 ├── API
 ├── business logic
 ├── persistence
 └── optional UI slice
```

## Benefit
Reduces cross-service dependency.

## Trap
Do not interpret self-contained as “duplicate everything.”
