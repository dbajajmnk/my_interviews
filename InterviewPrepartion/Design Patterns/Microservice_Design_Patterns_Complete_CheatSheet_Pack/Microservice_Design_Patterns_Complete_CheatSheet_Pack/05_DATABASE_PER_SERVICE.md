# Database per Service

## Problem
Shared databases create coupling.

## Pattern
```text
Order Service → Order DB
Payment Service → Payment DB
Inventory Service → Inventory DB
```

## Benefits
- schema autonomy
- deployment independence
- fault isolation
- technology choice

## Trade-offs
- no cross-service joins
- distributed consistency
- duplicated read models

## Related
Saga, CQRS, API Composition, Outbox.
