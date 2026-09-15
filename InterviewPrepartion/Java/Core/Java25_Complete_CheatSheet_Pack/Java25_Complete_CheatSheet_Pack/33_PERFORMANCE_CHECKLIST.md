# Java 25 Performance Checklist

## Measure First

```text
startup
warmup
throughput
p50/p95/p99
CPU
heap
allocation
GC
thread count
virtual-thread count
locks
DB saturation
network latency
```

## Java 25-Specific Opportunities

- Compact Object Headers
- AOT cache
- AOT method profiling
- JFR CPU profiling
- JFR method tracing
- Vector API for specialized work

## Rule

Enable one optimization at a time and re-measure.
