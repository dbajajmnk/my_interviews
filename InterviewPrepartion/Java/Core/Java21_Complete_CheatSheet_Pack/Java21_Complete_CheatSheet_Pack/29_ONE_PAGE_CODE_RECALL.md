# Java 21 — One-Page Code Recall

## Virtual Thread

```java
Thread.startVirtualThread(() -> work());
```

## Virtual Thread Executor

```java
try (var executor =
        Executors.newVirtualThreadPerTaskExecutor()) {
    executor.submit(() -> work());
}
```

## Switch Pattern

```java
return switch (obj) {
    case String s -> s.length();
    case Integer i -> i;
    case null -> 0;
    default -> -1;
};
```

## Record Pattern

```java
if (obj instanceof Point(int x, int y)) {
    System.out.println(x + y);
}
```

## Sequenced Collection

```java
list.getFirst();
list.getLast();
list.reversed();
```

## RandomGenerator

```java
RandomGenerator generator =
    RandomGenerator.getDefault();
```

## Scoped Value — Preview Concept

```java
ScopedValue.where(USER, value)
    .run(() -> work());
```

## Preview Compile

```bash
javac --enable-preview --release 21 Demo.java
```

## Preview Run

```bash
java --enable-preview Demo
```
