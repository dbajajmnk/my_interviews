# Saga Pattern

## Problem

One business transaction spans multiple services.

Example:

```text
Create Order
Reserve Inventory
Charge Payment
Arrange Shipping
```

No single ACID transaction covers all services.

## Saga

A sequence of local transactions.

```text
T1 → T2 → T3 → T4
```

If failure occurs:

```text
C3 ← C2 ← C1
```

where `C` = compensating action.

## Why

Maintains business consistency without distributed 2PC.

## Trap

Compensation is business logic, not database rollback.
