# Try-with-resources Improvement

## Java 7 Style

Resource often declared inside try header.

## Java 9+ Improvement

An effectively final variable can be declared earlier and reused.

```java
BufferedReader reader =
    Files.newBufferedReader(path);

try (reader) {
    System.out.println(reader.readLine());
}
```

## Rule

Resource must still be final/effectively final.

## Benefit

Cleaner code when resource creation occurs before the try block.
