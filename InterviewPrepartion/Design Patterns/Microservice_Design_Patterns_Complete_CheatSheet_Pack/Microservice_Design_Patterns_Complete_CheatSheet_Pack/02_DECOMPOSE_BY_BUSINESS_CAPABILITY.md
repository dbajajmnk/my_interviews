# Decompose by Business Capability

## Problem
Large systems become difficult to evolve when services are split by technical layers.

## Intent
Organize services around business capabilities.

## Visual
```text
Business
 ├── Orders
 ├── Payments
 ├── Inventory
 └── Shipping
```

## Use When
- domain has clear capabilities
- teams own business outcomes
- independent delivery is required

## Avoid
Splitting as:
```text
Controller Service
Validation Service
Database Service
```

## Trade-off
Business boundaries are harder to discover than technical layers, but far more stable.

## Interview Trap
A business capability is not the same thing as one entity/table.
