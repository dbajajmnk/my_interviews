# Amazon SNS

## What

Managed publish/subscribe notifications.

## Pattern

```text
Publisher
 ↓
SNS Topic
 ├── SQS
 ├── Lambda
 ├── HTTP/S
 └── other subscribers
```

## Good Fit

Fan-out.

## Common Pattern

```text
SNS → multiple SQS queues
```

for independent durable consumers.

## Trap

SNS is not primarily a work queue.
