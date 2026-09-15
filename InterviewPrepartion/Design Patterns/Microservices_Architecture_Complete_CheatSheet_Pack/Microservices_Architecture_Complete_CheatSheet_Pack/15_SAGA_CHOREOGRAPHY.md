# Saga Choreography

## Flow

```text
Order Created
   ↓ event
Inventory Reserved
   ↓ event
Payment Charged
   ↓ event
Shipping Scheduled
```

## Benefits

- decentralized
- loose runtime coupling
- good event-driven fit

## Risks

- hard to see end-to-end flow
- event cycles
- debugging complexity
- logic scattered across services

## Best Fit

Simple/medium workflows.

## Trap

If business flow is impossible to understand without searching 10 repositories, choreography may be overused.
