# Default & Static Interface Methods

## Why

They allowed interfaces to evolve without immediately breaking all implementations.

## Default Method

```java
interface Vehicle {
    default void start() {
        System.out.println("Starting");
    }
}
```

## Static Method

```java
interface MathUtil {
    static int square(int x) {
        return x * x;
    }
}
```

## Conflict Rule

If two interfaces provide the same default method:

```java
InterfaceA.super.method();
```

may be used to resolve explicitly.

## Priority Rules

Remember broadly:

```text
Class method wins over interface default
More specific interface wins
Otherwise resolve explicitly
```

## Trap

Static interface methods are not inherited like instance methods.
