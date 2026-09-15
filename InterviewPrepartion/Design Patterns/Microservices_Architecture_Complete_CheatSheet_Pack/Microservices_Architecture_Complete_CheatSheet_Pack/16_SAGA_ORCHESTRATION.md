# Saga Orchestration

## Flow

```text
Saga Orchestrator
 ├── Reserve Inventory
 ├── Charge Payment
 └── Arrange Shipping
```

## Benefits

- workflow visible
- easier compensation
- centralized process control

## Risks

- orchestrator can become complex
- must avoid domain god-service

## Good Fit

Complex workflows with clear process ownership.

## Interview Line

> Orchestration centralizes workflow control; choreography decentralizes it through events.
