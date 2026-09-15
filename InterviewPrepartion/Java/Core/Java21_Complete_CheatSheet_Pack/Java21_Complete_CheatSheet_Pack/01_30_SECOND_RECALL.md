# Java 21 — 30-Second Recall

## Formula

**Java 21 = Modern Pattern Matching + Lightweight Concurrency + Ordered Collections + GC Evolution + Native Interop Evolution**

## Final Features to Remember

```text
Virtual Threads
Pattern Matching for switch
Record Patterns
Sequenced Collections
Generational ZGC
KEM API
```

## Preview / Incubator in Java 21

```text
Scoped Values — Preview
Structured Concurrency — Preview
Unnamed Patterns & Variables — Preview
Unnamed Classes & Instance Main Methods — Preview
String Templates — Preview
FFM API — Third Preview
Vector API — Sixth Incubator
```

## Key Example

```java
try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
    executor.submit(() -> handleRequest());
}
```

```java
static String describe(Object obj) {
    return switch (obj) {
        case Integer i -> "int " + i;
        case String s when !s.isBlank() -> "text " + s;
        case null -> "null";
        default -> "other";
    };
}
```

## Interview Traps

- Virtual threads improve scalability for blocking tasks; they do not make CPU work faster.
- Pattern Matching for `switch` is **final in Java 21**.
- Record Patterns are **final in Java 21**.
- Scoped Values are **preview** in Java 21.
- Structured Concurrency is **preview** in Java 21.
- FFM is still **preview** in Java 21.
- Vector API is still **incubator** in Java 21.
- String Templates were preview in Java 21 and later withdrawn from the platform before finalization.
