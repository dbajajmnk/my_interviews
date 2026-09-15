# Flexible Constructor Bodies — Final in Java 25

## What

A constructor may execute permitted statements before an explicit `super(...)` or `this(...)` call.

## Example

```java
class PositiveNumber extends NumberBase {

    PositiveNumber(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("positive only");
        }

        super(value);
    }
}
```

## Why

Previously, explicit constructor invocation had to be the first statement.

Now you can:

```text
validate
prepare arguments
initialize permitted state
then
invoke super(...) / this(...)
```

## Benefit

Safer object construction and less need for awkward static helper methods.

## Important Restriction

The early-construction region cannot freely use the under-construction object as though initialization were complete.

## Trap

This is not permission to call arbitrary overridable instance methods before superclass construction.
