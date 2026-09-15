# JFR CPU-Time Profiling — Experimental

## What

Adds more accurate CPU-time profiling information to JFR on Linux.

## Wall Time vs CPU Time

```text
Wall time
= waiting + blocked + sleeping + CPU

CPU time
= actual CPU execution
```

## Why

A method may be slow without consuming much CPU.

CPU-time profiling helps distinguish:

```text
compute bottleneck
vs
waiting bottleneck
```

## Status

Experimental in Java 25.

## Trap

Experimental JVM feature != preview Java SE API.
