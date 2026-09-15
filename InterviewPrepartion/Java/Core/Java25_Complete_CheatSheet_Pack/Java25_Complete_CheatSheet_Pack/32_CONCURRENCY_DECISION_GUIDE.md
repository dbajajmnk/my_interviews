# Java 25 Concurrency Decision Guide

## Many Blocking I/O Tasks

```text
Virtual Threads
```

## Immutable Request Context

```text
Scoped Values
```

## Related Child Tasks

```text
Structured Concurrency
```

if preview APIs are allowed.

## Async Dataflow Pipeline

```text
CompletableFuture
```

## CPU Parallelism

```text
ForkJoinPool
parallel algorithms
Vector API for specialized numeric workloads
```

## Durable Background Work

```text
queue / broker / scheduler
```

not merely in-memory threads.

## Rule

Match concurrency model to workload, not trend.
