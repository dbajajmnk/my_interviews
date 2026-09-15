# Stream API Enhancements After Java 8

## `takeWhile`

```java
stream.takeWhile(x -> x < 10)
```

Consumes prefix while predicate remains true.

## `dropWhile`

```java
stream.dropWhile(x -> x < 10)
```

Drops matching prefix.

## `ofNullable`

```java
Stream.ofNullable(value)
```

Produces zero or one element.

## `iterate`

Modern bounded form:

```java
Stream.iterate(
    0,
    n -> n < 10,
    n -> n + 1
)
```

## `toList()`

Modern Java includes:

```java
List<String> names =
    stream.map(User::name)
          .toList();
```

## Trap

Do not assume every `toList()` result has the same mutability semantics as `Collectors.toList()`.
