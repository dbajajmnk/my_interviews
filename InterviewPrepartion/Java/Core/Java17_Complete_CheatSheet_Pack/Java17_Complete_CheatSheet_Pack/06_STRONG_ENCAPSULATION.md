# Strong Encapsulation of JDK Internals

## What

Java 17 strongly encapsulates internal JDK implementation details.

## Why

Historically, some libraries accessed internal packages such as:

```text
sun.*
com.sun.*
```

This was fragile and unsupported.

## Java 17 Direction

```text
Public Supported API
        ✓

Internal JDK API
        ✗ strongly restricted
```

## Migration Impact

Legacy applications may fail because they used reflection against internal JDK classes.

## Fix Strategy

1. identify internal API usage
2. upgrade the dependent library
3. move to supported public API
4. use temporary command-line opens only as a bridge

## Trap

`--add-opens` is a migration escape hatch, not the ideal permanent architecture.
