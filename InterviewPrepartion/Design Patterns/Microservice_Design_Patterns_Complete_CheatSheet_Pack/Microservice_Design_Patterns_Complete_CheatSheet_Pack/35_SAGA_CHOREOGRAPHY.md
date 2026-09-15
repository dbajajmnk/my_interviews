# Saga Choreography

## Pattern
```text
OrderCreated
 ↓
InventoryReserved
 ↓
PaymentCharged
 ↓
ShippingScheduled
```

Each service reacts to events.

## Benefits
Decentralized.

## Risks
Event spaghetti and poor workflow visibility.

## Use
Simpler workflows.
