# Amazon SQS

## What

Managed message queue.

## Pattern

```text
Producer
 ↓
Queue
 ↓
Consumer
```

## Benefits

```text
decoupling
buffering
retry
backpressure
```

## Queue Types

```text
Standard
FIFO
```

## Design

Use:

```text
visibility timeout
DLQ
idempotency
long polling
```

## Trap

At-least-once delivery means consumers must be duplicate-safe.
