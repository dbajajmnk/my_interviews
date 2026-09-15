# Parallel Streams

## What

A parallel stream may process parts of a pipeline concurrently.

```java
list.parallelStream()
```

## Mental Model

```text
Input
 ↓ split
Task1 Task2 Task3 Task4
 ↓
ForkJoinPool
 ↓
combine
 ↓
Result
```

## Good Candidates

- large datasets
- CPU-bound operations
- stateless independent operations
- associative reductions

## Poor Candidates

- small collections
- blocking I/O
- order-sensitive logic
- shared mutable state
- expensive splitting/merging
- latency-sensitive shared servers without measurement

## Trap

Parallel stream ≠ guaranteed faster.

Always benchmark realistic workloads.
