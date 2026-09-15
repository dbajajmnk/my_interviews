# Pattern Matching for `switch` — Preview in Java 17

## Status

Pattern matching for `switch` was a **preview feature in Java 17**.

That status matters in interviews.

## Idea

```java
static String describe(Object obj) {
    return switch (obj) {
        case Integer i -> "int " + i;
        case String s  -> "text " + s;
        default        -> "other";
    };
}
```

## Why

It combines:

```text
type test
+ variable binding
+ branching
```

## Preview Compile / Run

```bash
javac --enable-preview --release 17 Demo.java
java --enable-preview Demo
```

## Important

Do not present Java 17 pattern-switch syntax as a non-preview production language feature.

## Modern Context

Pattern matching for switch was finalized in later Java releases, but in **Java 17 specifically** it remains preview.
