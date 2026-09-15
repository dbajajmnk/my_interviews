# Java 17 — One-Page Code Recall

## Record

```java
record User(long id, String name) {}
```

## Sealed

```java
sealed interface Shape permits Circle, Rectangle {}
```

## Pattern `instanceof`

```java
if (obj instanceof String s) {
    System.out.println(s.length());
}
```

## Switch Expression

```java
String type = switch (code) {
    case 1 -> "ONE";
    case 2 -> "TWO";
    default -> "OTHER";
};
```

## Text Block

```java
String json = """
    {"status":"OK"}
    """;
```

## `var`

```java
var users = new ArrayList<User>();
```

## Collections

```java
List<String> list = List.of("A", "B");
Map<String,Integer> map = Map.of("A",1);
```

## Stream Additions

```java
stream.takeWhile(x -> x < 10);
stream.dropWhile(x -> x < 10);
Stream.ofNullable(value);
```

## Optional

```java
optional.ifPresentOrElse(
    System.out::println,
    () -> System.out.println("missing")
);
```

## HTTP Client

```java
HttpClient client = HttpClient.newHttpClient();
```

## CompletableFuture Timeout

```java
future.orTimeout(2, TimeUnit.SECONDS);
```

## RandomGenerator

```java
RandomGenerator rg = RandomGenerator.getDefault();
```
