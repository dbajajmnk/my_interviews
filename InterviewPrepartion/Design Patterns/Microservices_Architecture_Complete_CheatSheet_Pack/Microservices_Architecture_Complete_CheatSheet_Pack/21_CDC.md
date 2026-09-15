# Change Data Capture (CDC)

## What

Capture database changes and publish them as events.

## Flow

```text
Database Log
   ↓
CDC Connector
   ↓
Broker
   ↓
Consumers
```

## Uses

- outbox publishing
- analytics
- cache/index sync
- legacy integration

## Trap

CDC exposes data changes; it does not automatically create good domain events.
