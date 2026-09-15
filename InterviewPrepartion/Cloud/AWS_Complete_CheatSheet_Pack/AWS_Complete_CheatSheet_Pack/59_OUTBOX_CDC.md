# Outbox / CDC / DMS

## Dual-Write Problem

```text
DB commit ✓
event publish ✗
```

## Outbox Pattern

```text
Business Row
+
Outbox Row
same transaction
```

then publish asynchronously.

## AWS Tools

Depending architecture:

```text
DMS
DynamoDB Streams
Lambda
MSK/Kinesis
custom outbox publisher
```

## Trap

CDC publishes data changes; good domain-event design is still your responsibility.
