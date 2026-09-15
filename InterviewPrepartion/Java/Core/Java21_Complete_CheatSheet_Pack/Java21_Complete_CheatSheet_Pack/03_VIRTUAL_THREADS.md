# Virtual Threads — Final in Java 21

## What

Virtual threads are lightweight JVM-managed threads.

## Why

Traditional platform threads are expensive when an application creates huge numbers of blocking tasks.

Virtual threads allow a familiar:

```text
one task
→ one thread
```

programming model at much larger scale.

## Basic Example

```java
Thread.startVirtualThread(() -> {
    System.out.println("running");
});
```

## Executor

```java
try (var executor =
        Executors.newVirtualThreadPerTaskExecutor()) {

    Future<String> future =
        executor.submit(() -> loadData());

    System.out.println(future.get());
}
```

## Mental Model

```text
Thousands / Millions of Virtual Threads
                ↓
            JVM Scheduler
                ↓
       Carrier Platform Threads
                ↓
              CPU
```

## Best Fit

```text
HTTP calls
DB calls
file I/O
network I/O
blocking APIs
request-per-thread servers
```

## Poor Fit

Pure CPU-bound work.

## Important

Virtual threads remove the need to use tiny thread pools merely to protect thread count.

They do **not** remove the need to protect scarce resources such as:

```text
DB connections
remote APIs
rate limits
memory
CPU
```

## Pinning / Blocking Concern

Certain blocking situations around monitor usage/native operations can reduce scalability.

## Interview Line

> Virtual threads make blocking code scalable; they do not make blocking operations themselves faster.
