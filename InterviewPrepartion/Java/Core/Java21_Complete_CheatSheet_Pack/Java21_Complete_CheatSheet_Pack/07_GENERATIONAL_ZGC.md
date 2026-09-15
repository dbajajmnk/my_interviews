# Generational ZGC — Java 21

## What

ZGC gained generational capability.

## Why

Most objects die young.

A generational collector exploits this by treating:

```text
young objects
and
long-lived objects
```

differently.

## Mental Model

```text
Allocation
   ↓
Young Generation
   ├── dies quickly → reclaim
   └── survives → older generation
```

## Goal

Maintain ZGC's low-pause design while improving efficiency for common allocation patterns.

## Good Use Cases

- large heaps
- latency-sensitive services
- workloads with strict pause goals

## Measure

```text
allocation rate
GC CPU
pause time
heap occupancy
p95/p99 latency
```

## Trap

Do not select ZGC only because it is newer.

Choose based on measured workload characteristics.
