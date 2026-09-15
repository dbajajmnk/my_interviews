# Virtual Threads with Spring Boot

## What
Lightweight JVM-managed threads that make thread-per-request style much more scalable for many blocking I/O workloads.

## Visual
```text
Many Virtual Threads → JVM Scheduler → Fewer Carrier/Platform Threads
```

## Good Fit
High concurrency with blocking DB/HTTP/file I/O.

## Not Magic
They do not make CPU-heavy algorithms faster.

## Review
Thread-local usage, synchronized/pinning-sensitive regions, DB pool limits, downstream capacity, observability and rate limits.

## Trap
More virtual threads do not create more database connections or downstream capacity.
