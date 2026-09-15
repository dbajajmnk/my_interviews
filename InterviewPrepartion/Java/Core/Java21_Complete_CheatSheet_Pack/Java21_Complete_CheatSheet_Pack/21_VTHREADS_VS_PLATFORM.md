# Virtual Threads vs Platform Threads

| Platform Thread | Virtual Thread |
|---|---|
| OS-thread backed | JVM-managed lightweight thread |
| expensive at huge counts | designed for huge counts |
| thread pools common | thread-per-task feasible |
| good for CPU work too | best value for blocking I/O concurrency |
| scarce | plentiful |

## Important Shared Limits

Both ultimately compete for:

```text
CPU
DB connections
remote service capacity
memory
locks
```

## Decision

Use virtual threads when:

```text
many concurrent tasks
+ blocking APIs
+ simple imperative code
```

Do not expect:

```text
CPU algorithm speedup
```
