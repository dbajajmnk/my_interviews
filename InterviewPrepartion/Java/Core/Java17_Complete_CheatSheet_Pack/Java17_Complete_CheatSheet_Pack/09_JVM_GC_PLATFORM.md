# JVM / GC / Platform Recall

## Java 17 Era Highlights

Important runtime context includes:

- mature G1 GC baseline
- low-pause collectors such as ZGC
- modern macOS/AArch64 support
- improved diagnostics
- tighter JDK encapsulation

## Collector Selection Mindset

```text
Throughput?
Latency?
Heap size?
Pause target?
CPU budget?
Container limits?
```

## Rule

Do not choose a GC because it is newer.

Measure:

```text
allocation rate
heap occupancy
pause duration
CPU
throughput
p95/p99 latency
```

## Common Tools

```text
jcmd
jstack
jmap
jstat
Java Flight Recorder
Mission Control
GC logs
```
