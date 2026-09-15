# Ahead-of-Time Method Profiling

## Problem

JIT compilers normally wait for runtime method profiles before aggressive optimization.

## Java 25 Direction

Persist method execution profile information from an earlier run and make it available earlier.

## Visual

```text
Previous Run
   ↓
Method Profiles
   ↓
AOT Cache
   ↓
Next Startup
   ↓
JIT gets profile earlier
   ↓
faster warmup potential
```

## Why

Important for workloads where peak performance is good but warmup is too slow.

## Trap

AOT profiling does not eliminate JIT compilation.

It helps the JIT make informed decisions sooner.
