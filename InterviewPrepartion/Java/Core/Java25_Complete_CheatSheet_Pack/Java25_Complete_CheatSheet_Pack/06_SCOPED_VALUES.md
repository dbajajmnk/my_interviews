# Scoped Values — Final in Java 25

## What

Scoped Values safely share contextual data with callees without passing it through every method parameter.

## Example

```java
private static final ScopedValue<String> USER =
    ScopedValue.newInstance();

ScopedValue.where(USER, "deepak")
    .run(() -> processRequest());
```

Read:

```java
String user = USER.get();
```

## Mental Model

```text
Bind
 ↓
Dynamic Call Scope
 ├── method A
 │    └── method B reads value
 └── child structured tasks can inherit
 ↓
Scope ends
 ↓
binding automatically disappears
```

## Why Better Than ThreadLocal for One-Way Context

- bounded lifetime
- immutable binding
- no manual cleanup
- efficient with virtual threads
- structured inheritance

## Good Uses

```text
request identity
tenant
trace context
authorization context
locale
```

## Trap

ScopedValue became final in Java 25.

Do not keep describing it as preview if discussing Java 25.
