# Event Sourcing

## What

Store state changes as events rather than only current state.

```text
OrderCreated
ItemAdded
PaymentAuthorized
OrderShipped
```

Current state is rebuilt from event history.

## Benefits

- audit history
- temporal analysis
- replay
- event-driven integration

## Costs

- schema evolution
- replay complexity
- event versioning
- storage growth
- operational learning curve

## Trap

Event sourcing is not required for ordinary event-driven microservices.
