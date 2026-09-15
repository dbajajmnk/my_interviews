# Outbox Pattern

## Problem
Database update + message publish is a dual write.

## Pattern
Same local transaction:

```text
Business Row
+
Outbox Row
```

Later:
```text
Outbox → Broker
```

## Benefit
Reliable event publication.

## Trap
Consumer idempotency is still required.
