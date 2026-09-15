# Java 8 — One-Page Code Recall

## Lambda

```java
(x, y) -> x + y
```

## Predicate

```java
Predicate<Integer> p = x -> x > 10;
```

## Function

```java
Function<String, Integer> f = String::length;
```

## Consumer

```java
Consumer<String> c = System.out::println;
```

## Supplier

```java
Supplier<UUID> s = UUID::randomUUID;
```

## Stream

```java
list.stream()
    .filter(x -> x > 10)
    .map(x -> x * 2)
    .collect(Collectors.toList());
```

## Grouping

```java
Collectors.groupingBy(Employee::getDepartment)
```

## Reduce

```java
numbers.stream().reduce(0, Integer::sum);
```

## Optional

```java
Optional.ofNullable(value)
        .map(String::trim)
        .orElse("N/A");
```

## Date

```java
LocalDate.now();
Instant.now();
ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
```

## CompletableFuture

```java
CompletableFuture
    .supplyAsync(this::load)
    .thenApply(this::transform)
    .thenAccept(System.out::println);
```

## Map

```java
map.computeIfAbsent(key, k -> new ArrayList<>());
map.merge(key, 1, Integer::sum);
```
