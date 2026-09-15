# Java Platform Module System (JPMS)

## What

Introduced strong named modules into the Java platform.

## Descriptor

```java
module com.example.orders {
    requires java.sql;

    exports com.example.orders.api;
}
```

## Concepts

```text
module
requires
exports
opens
uses
provides
```

## Why

- explicit dependencies
- stronger encapsulation
- reliable configuration
- modular runtime images

## `exports` vs `opens`

```text
exports → normal public access
opens   → deep reflective access
```

## Trap

JPMS modules are not the same as Maven/Gradle multi-module builds.
