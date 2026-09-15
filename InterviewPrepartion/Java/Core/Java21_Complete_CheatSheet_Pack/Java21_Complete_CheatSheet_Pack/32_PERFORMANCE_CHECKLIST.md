# Java 21 Performance Checklist

## Measure

```text
throughput
p50/p95/p99 latency
CPU
heap
allocation rate
GC pause
GC CPU
platform thread count
virtual thread count
DB pool saturation
downstream latency
```

## Virtual Thread Service

Check:

```text
CPU saturation?
DB pool bottleneck?
remote API throttling?
lock contention?
pinning?
memory pressure?
```

## ZGC Evaluation

Compare:

```text
pause time
CPU overhead
heap headroom
latency tail
```

## Rule

Java 21 gives new performance tools.

It does not eliminate the need for profiling and capacity planning.
