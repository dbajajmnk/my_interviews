# Pattern Matching for `switch` — Final in Java 21

## Example

```java
static String format(Object obj) {
    return switch (obj) {
        case Integer i -> "int: " + i;
        case Long l -> "long: " + l;
        case String s -> "text: " + s;
        case null -> "null";
        default -> "other";
    };
}
```

## Guarded Pattern

```java
case String s when s.length() > 10 -> "long text";
```

## Why

Combines:

```text
type testing
+ variable extraction
+ branching
```

## Exhaustiveness

With sealed hierarchies, switch can model all valid subtypes cleanly.

## Example

```java
sealed interface Shape permits Circle, Rectangle {}

record Circle(double radius) implements Shape {}
record Rectangle(double w, double h) implements Shape {}

static double area(Shape s) {
    return switch (s) {
        case Circle c -> Math.PI * c.radius() * c.radius();
        case Rectangle r -> r.w() * r.h();
    };
}
```

## Trap

Dominated cases cause compile-time errors.

Order patterns from more specific to more general where required.
