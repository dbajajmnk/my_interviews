# Transaction Log Tailing / CDC

## Intent
Capture DB changes from transaction log.

```text
DB Log
 ↓
CDC
 ↓
Broker
 ↓
Consumers
```

## Use
Outbox publishing, analytics, legacy integration.

## Trap
Raw row changes are not automatically good domain events.
