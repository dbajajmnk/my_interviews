# Optional Enhancements

Useful additions after Java 8 include:

## `ifPresentOrElse`

```java
optional.ifPresentOrElse(
    System.out::println,
    () -> System.out.println("missing")
);
```

## `or`

```java
optional.or(() -> backupOptional);
```

## `stream`

```java
optional.stream()
```

Useful in Stream pipelines.

## `isEmpty`

```java
if (optional.isEmpty()) {
    ...
}
```

## Trap

Optional is still not intended as a universal replacement for every nullable field/parameter.
