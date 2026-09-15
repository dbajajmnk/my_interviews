# Dual-Write Anti-Pattern

## Problem
Service independently writes:

```text
Database
and
Broker
```

without atomic coordination.

## Failure
```text
DB ✓
Broker ✗
```

or reverse.

## Fix
Outbox / CDC / idempotent reconciliation.
