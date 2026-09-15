# Saga Pattern

## Problem
Business transaction spans services.

## Pattern
Sequence of local transactions:

```text
T1 → T2 → T3
```

Failure:
```text
C2 ← C1
```

`C` = compensating transaction.

## Benefit
Avoid distributed 2PC.

## Trap
Compensation is domain-specific and may not perfectly reverse reality.
