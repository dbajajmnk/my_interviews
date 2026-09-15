# Java 17 — 30-Second Recall

## Formula

**Java 17 = Modern Java Language + Stronger Encapsulation + Better Runtime + LTS Baseline**

## Must Remember

```text
Sealed Classes
Records
Pattern Matching instanceof
Switch Expressions
Text Blocks
var
Modules
HTTP Client
Collection Factory Methods
Stream / Optional additions
Helpful NPE
Strong Encapsulation
RandomGenerator API
```

## Key Example

```java
sealed interface Shape permits Circle, Rectangle {}

record Circle(double radius) implements Shape {}

record Rectangle(double width, double height) implements Shape {}
```

```java
static double area(Shape shape) {
    if (shape instanceof Circle c) {
        return Math.PI * c.radius() * c.radius();
    }
    if (shape instanceof Rectangle r) {
        return r.width() * r.height();
    }
    throw new IllegalArgumentException();
}
```

## Interview Traps

- Sealed classes are **final in Java 17**.
- Pattern matching for `switch` is **preview in Java 17**.
- Records are not “just Lombok”.
- `var` is local-variable type inference, not dynamic typing.
- `List.of()` creates an unmodifiable list.
- Modules are not the same thing as Maven modules.
- Strong encapsulation can break code relying on internal JDK APIs.
