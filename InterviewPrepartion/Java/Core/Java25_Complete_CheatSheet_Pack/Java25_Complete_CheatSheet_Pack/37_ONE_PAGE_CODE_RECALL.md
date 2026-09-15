# Java 25 — One-Page Code Recall

## Module Import

```java
import module java.base;
```

## Compact Main

```java
void main() {
    IO.println("Hello");
}
```

## Flexible Constructor

```java
Child(int x) {
    if (x < 0) throw new IllegalArgumentException();
    super(x);
}
```

## ScopedValue

```java
static final ScopedValue<String> USER =
    ScopedValue.newInstance();

ScopedValue.where(USER, "deepak")
    .run(() -> work());
```

## Structured Concurrency — Preview

```java
try (var scope = StructuredTaskScope.open()) {
    var a = scope.fork(() -> taskA());
    var b = scope.fork(() -> taskB());

    scope.join();

    use(a.get(), b.get());
}
```

## StableValue — Preview

```java
static final StableValue<Service> SERVICE =
    StableValue.of();

Service s =
    SERVICE.orElseSet(() -> createService());
```

## Compact Headers

```bash
java -XX:+UseCompactObjectHeaders -jar app.jar
```

## Preview Compile

```bash
javac --enable-preview --release 25 Demo.java
```

## Preview Run

```bash
java --enable-preview Demo
```
