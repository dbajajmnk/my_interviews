# CompletableFuture

## What

An API for composing asynchronous computations.

## Basic

```java
CompletableFuture<String> future =
    CompletableFuture.supplyAsync(() -> "data");
```

## Transform

```java
future.thenApply(String::toUpperCase);
```

## Consume

```java
future.thenAccept(System.out::println);
```

## Chain Async Work

```java
future.thenCompose(this::loadDetailsAsync);
```

## Combine Independent Futures

```java
f1.thenCombine(f2, (a, b) -> a + b);
```

## Error Handling

```java
future.exceptionally(ex -> "fallback");
```

## Coordination

```java
CompletableFuture.allOf(f1, f2, f3);
CompletableFuture.anyOf(f1, f2, f3);
```

## `thenApply` vs `thenCompose`

```text
thenApply   = map
thenCompose = flatMap
```

## Trap

Default async methods commonly use the common ForkJoinPool unless you provide an executor. For production systems, executor strategy matters.
