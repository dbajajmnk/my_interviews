# Amazon EventBridge

## What

Serverless event bus and event routing service.

## Pattern

```text
Event Producer
 ↓
Event Bus
 ↓ rules/patterns
Targets
```

## Sources

```text
AWS services
custom apps
SaaS integrations
```

## Good Fits

```text
event-driven architecture
routing by event pattern
cross-service integration
```

## Trap

EventBridge event routing is different from SQS queue semantics.
