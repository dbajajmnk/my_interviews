# Saga Orchestration

## Pattern
```text
Orchestrator
 ├── Reserve Inventory
 ├── Charge Payment
 └── Ship
```

## Benefits
Explicit workflow.

## Risks
Orchestrator complexity.

## Trap
Keep domain logic in domain services; orchestrator coordinates.
