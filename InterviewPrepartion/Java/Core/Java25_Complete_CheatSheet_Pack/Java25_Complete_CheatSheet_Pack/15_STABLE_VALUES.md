# Stable Values — Preview in Java 25

## What

A StableValue is a holder whose contents can be set at most once.

## Example

```java
private static final StableValue<Logger> LOGGER =
    StableValue.of();
```

Conceptually initialize lazily:

```java
Logger logger =
    LOGGER.orElseSet(() -> createLogger());
```

## Goal

Provide deferred initialization while preserving "constant-like" semantics after initialization.

## Mental Model

```text
Unset
 ↓
compute at most once
 ↓
Set
 ↓
never changes
```

## Why

Traditional choices often trade between:

```text
final field → eager initialization
lazy field  → mutable synchronization complexity
```

Stable Values aim for deferred immutability.

## Status

Preview API.

## Trap

StableValue is not a general mutable container.

Once set, it cannot be replaced.
