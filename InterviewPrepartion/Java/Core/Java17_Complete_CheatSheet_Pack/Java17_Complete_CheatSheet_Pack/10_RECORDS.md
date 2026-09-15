# Records

## What

Records provide concise syntax for transparent data carriers.

## Syntax

```java
public record User(
    long id,
    String name,
    String email
) {}
```

Compiler provides:

```text
private final fields
canonical constructor
accessors
equals()
hashCode()
toString()
```

## Accessors

```java
user.name()
```

not:

```java
user.getName()
```

## Compact Constructor

```java
record Money(BigDecimal amount, String currency) {
    Money {
        Objects.requireNonNull(amount);
        Objects.requireNonNull(currency);
    }
}
```

## Good Fits

- DTO
- command
- event
- immutable result
- value-oriented data carrier

## Trap

Records are shallowly immutable.

If a record component points to a mutable object, that object can still mutate.

## Not Simply Lombok

Record semantics are part of the Java language and type model.
