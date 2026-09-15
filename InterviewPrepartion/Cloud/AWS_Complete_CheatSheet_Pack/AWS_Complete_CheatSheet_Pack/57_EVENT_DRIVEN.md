# Event-Driven Architecture on AWS

## Reference

```text
Service
 ↓ event
EventBridge
 ├── Lambda
 ├── SQS
 ├── Step Functions
 └── other targets
```

## Principles

```text
immutable events
clear ownership
idempotent consumers
schema governance
DLQ/replay plan
observability
```

## Trap

Event-driven architecture reduces temporal coupling but can increase debugging and consistency complexity.
