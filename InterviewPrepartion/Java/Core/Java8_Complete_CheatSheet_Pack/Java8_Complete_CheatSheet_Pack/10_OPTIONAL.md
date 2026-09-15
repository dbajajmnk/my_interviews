# Optional

## What

A container representing a value that may or may not be present.

## Create

```java
Optional.of(value)
Optional.ofNullable(value)
Optional.empty()
```

## Use

```java
optional.orElse(defaultValue);
optional.orElseGet(() -> expensiveDefault());
optional.orElseThrow(...);
```

```java
optional.map(User::getName)
        .filter(name -> !name.isBlank())
        .ifPresent(System.out::println);
```

## `orElse` vs `orElseGet`

```java
orElse(value)
```

The argument is evaluated before the call.

```java
orElseGet(supplier)
```

The supplier is evaluated only when needed.

## Best Practice

Good for return values where absence is meaningful.

## Common Misuse

Avoid blindly using:

```java
optional.get()
```

Avoid using Optional everywhere as fields/parameters without a clear reason.

## Trap

Optional is not a replacement for all null handling.
