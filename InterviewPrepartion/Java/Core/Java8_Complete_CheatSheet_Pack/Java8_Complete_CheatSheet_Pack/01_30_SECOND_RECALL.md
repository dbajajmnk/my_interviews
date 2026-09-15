# Java 8 — 30-Second Recall

## Java 8 Formula

**Java 8 = Functional Programming + Stream Processing + Better Date/Time + Async Composition + Interface Evolution**

## Must Remember

```text
Lambda
Functional Interface
Method Reference
Stream
Optional
Default Method
java.time
CompletableFuture
Collectors
Map enhancements
```

## Core Examples

```java
list.forEach(System.out::println);
```

```java
list.stream()
    .filter(x -> x > 10)
    .map(x -> x * 2)
    .collect(Collectors.toList());
```

```java
Optional.ofNullable(value)
        .orElse("default");
```

```java
CompletableFuture.supplyAsync(() -> loadData())
                 .thenApply(this::transform);
```

## Interview Traps

- Stream does not store data.
- Intermediate stream operations are lazy.
- A stream cannot normally be reused after a terminal operation.
- `map()` and `flatMap()` are different.
- `Optional.get()` is usually a smell when used blindly.
- Parallel streams are not automatically faster.
- Default methods solved interface evolution.
- `LocalDateTime` has no timezone.
