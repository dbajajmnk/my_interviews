# Flexible Constructors — Quick Recall

## Before

```text
super(...) / this(...)
must be first
```

## Java 25

```text
validation / permitted preparation
        ↓
super(...) / this(...)
        ↓
rest of construction
```

## Good Pattern

```java
Child(int value) {
    if (value < 0) throw new IllegalArgumentException();
    super(value);
}
```

## Why

Validation can happen before superclass side effects.

## Trap

Object construction still has strict safety rules.
