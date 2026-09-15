# JVM / GC / Performance Recall

## Java 21 Runtime Themes

```text
Virtual-thread scalability
Generational ZGC
JFR / diagnostics
modern container deployment
strong runtime observability
```

## Performance Layers

```text
Algorithm
 ↓
Allocation
 ↓
Threads / Virtual Threads
 ↓
Locks / Contention
 ↓
GC
 ↓
I/O
 ↓
Database / Network
```

## Tools

```text
jcmd
jstack
jmap
jstat
jfr
Java Flight Recorder
Mission Control
async-profiler (external)
```

## Rule

Profile first.

Do not assume:
- more threads = more throughput
- newer GC = better
- virtual threads = faster CPU
