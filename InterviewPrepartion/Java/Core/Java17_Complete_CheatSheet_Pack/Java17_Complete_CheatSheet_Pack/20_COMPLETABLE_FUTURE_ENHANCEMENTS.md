# CompletableFuture — Java 9+ Enhancements

## Timeout

```java
future.orTimeout(2, TimeUnit.SECONDS);
```

## Fallback on Timeout

```java
future.completeOnTimeout(
    defaultValue,
    2,
    TimeUnit.SECONDS
);
```

## Delayed Executor

```java
Executor executor =
    CompletableFuture.delayedExecutor(
        1,
        TimeUnit.SECONDS
    );
```

## Rule

Timeout is not cancellation of every underlying operation automatically.

Understand what your task/executor/resource is doing.
