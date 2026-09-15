# Transactional Outbox Pattern

## Problem

Need to update DB and publish event reliably.

Bad:

```text
DB commit succeeds
message publish fails
```

## Pattern

Same local transaction:

```text
Business Table
+
Outbox Table
```

Then:

```text
Outbox Publisher
  ↓
Broker
```

## Visual

```text
Service Transaction
 ├── UPDATE orders
 └── INSERT outbox
          ↓
      Publisher / CDC
          ↓
        Broker
```

## Benefit

Avoids dual-write inconsistency.

## Trap

Outbox gives reliable handoff, not automatic exactly-once business processing.
