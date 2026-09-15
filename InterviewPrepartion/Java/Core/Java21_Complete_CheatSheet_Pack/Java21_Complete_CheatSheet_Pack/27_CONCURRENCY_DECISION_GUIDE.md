# Java 21 Concurrency Decision Guide

## Blocking I/O Service

```text
Virtual Threads
```

## Related Child Tasks Per Request

```text
Virtual Threads
+ Structured Concurrency (if preview allowed)
```

## Context Propagation

```text
Scoped Values (if preview allowed)
```

## Async Pipeline

```text
CompletableFuture
```

## CPU Parallelism

Consider:

```text
ForkJoinPool
parallel algorithms
Vector API for suitable numeric work
```

## Durable Background Processing

Use:

```text
queue / broker / job platform
```

not merely threads.

## Key Rule

Concurrency model should match the workload:

```text
CPU-bound
I/O-bound
latency-sensitive
throughput-sensitive
durable
request-scoped
```
