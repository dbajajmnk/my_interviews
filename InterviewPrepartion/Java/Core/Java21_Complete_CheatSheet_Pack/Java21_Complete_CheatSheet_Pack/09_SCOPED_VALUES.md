# Scoped Values — Preview in Java 21

## What

Scoped Values provide a way to share immutable contextual data with callees within a bounded execution scope.

## Why

They address problems often handled with `ThreadLocal`.

## Concept

```text
Bind Context
   ↓
Call Tree
   ↓
Nested Methods Read Context
   ↓
Scope Ends
```

## Example Concept

```java
static final ScopedValue<String> USER =
    ScopedValue.newInstance();

ScopedValue.where(USER, "deepak")
    .run(() -> process());
```

## Good Use

- request context
- identity/context propagation
- tracing metadata
- structured concurrent tasks

## Benefits vs ThreadLocal

```text
bounded lifetime
immutable binding
better fit with virtual threads
clearer context ownership
```

## Trap

Scoped Values are preview in Java 21.

Do not present them as fully final Java 21 API.
