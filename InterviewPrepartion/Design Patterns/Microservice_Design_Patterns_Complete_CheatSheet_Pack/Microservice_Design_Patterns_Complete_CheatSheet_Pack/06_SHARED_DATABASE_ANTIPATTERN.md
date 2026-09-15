# Shared Database — Anti-Pattern

## Problem
Multiple services directly modify the same database/schema.

## Consequences
```text
tight coupling
hidden dependencies
coordinated schema releases
weak ownership
cross-service transactions
```

## Transitional Use
Sometimes tolerated during migration.

## Rule
If used temporarily, assign table/schema ownership and an exit plan.
