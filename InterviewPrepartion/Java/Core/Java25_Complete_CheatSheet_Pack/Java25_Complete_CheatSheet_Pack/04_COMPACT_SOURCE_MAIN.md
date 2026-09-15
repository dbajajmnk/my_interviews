# Compact Source Files & Instance Main Methods — Final in Java 25

## Goal

Reduce ceremony for small programs and beginners without creating a separate Java dialect.

## Traditional

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```

## Compact Style

```java
void main() {
    IO.println("Hello");
}
```

## Important Java 25 Detail

`IO` is in `java.lang`.

Its methods are not automatically statically imported, so write:

```java
IO.println("Hello");
```

unless you explicitly use a static import.

## Best Fit

- teaching
- small utilities
- examples
- scripting-like tasks
- interview demos

## Trap

This does not replace normal classes/packages for large applications.
