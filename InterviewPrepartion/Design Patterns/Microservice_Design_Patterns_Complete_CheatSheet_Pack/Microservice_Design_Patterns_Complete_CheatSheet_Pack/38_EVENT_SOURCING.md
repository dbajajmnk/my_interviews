# Event Sourcing

## Intent
Store state transitions as events.

```text
OrderCreated
ItemAdded
PaymentAuthorized
OrderShipped
```

## Benefits
Audit, replay, temporal model.

## Costs
Versioning, replay, operational complexity.

## Trap
Not every event-driven system should use Event Sourcing.
