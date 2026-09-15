# SQS vs SNS vs EventBridge

| SQS | SNS | EventBridge |
|---|---|---|
| queue | pub/sub topic | event bus |
| consumer pulls | push fan-out | rules route events |
| buffering | broadcasting | event routing/integration |
| durable queue | subscriber delivery | event-driven integration |

## Quick Decision

```text
Work queue? → SQS
Fan-out notification? → SNS
Event routing/integration? → EventBridge
```

## Common Combination

```text
EventBridge / SNS
       ↓
      SQS
       ↓
consumer
```
