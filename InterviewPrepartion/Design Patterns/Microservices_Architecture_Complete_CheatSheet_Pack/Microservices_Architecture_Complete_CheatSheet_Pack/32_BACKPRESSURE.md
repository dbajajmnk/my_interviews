# Backpressure

## Problem

Producer is faster than consumer.

```text
Producer >>> Consumer
```

Queue grows until failure.

## Solutions

```text
slow producer
bounded queue
reject
drop
batch
scale consumers
```

## Trap

Infinite queues postpone failure and increase latency.
