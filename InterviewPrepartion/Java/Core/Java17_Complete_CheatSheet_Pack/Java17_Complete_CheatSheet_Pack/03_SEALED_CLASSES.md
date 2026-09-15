# Sealed Classes — Java 17 Final

## What

Sealed classes/interfaces restrict which types may extend or implement them.

## Syntax

```java
public sealed interface Payment
        permits CardPayment, UpiPayment, CashPayment {
}
```

```java
public final class CardPayment implements Payment {}
```

```java
public non-sealed class UpiPayment implements Payment {}
```

```java
public final class CashPayment implements Payment {}
```

## Why

Useful when a domain has a **closed set of valid variants**.

Examples:
- payment types
- commands
- events
- AST nodes
- workflow states

## Allowed Subclass Modifiers

A direct subclass must be one of:

```text
final
sealed
non-sealed
```

## Design Benefit

```text
Open inheritance
        ↓
Hard to reason about all subtypes

Sealed hierarchy
        ↓
Known finite subtype family
```

## Interview Trap

Sealed classes do **not** mean immutable classes.

They control inheritance, not object mutability.
