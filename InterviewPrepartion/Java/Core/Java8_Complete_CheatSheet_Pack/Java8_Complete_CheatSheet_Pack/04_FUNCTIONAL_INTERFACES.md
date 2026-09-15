# Functional Interfaces

## What

An interface with exactly one abstract method.

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
```

## Standard Interfaces

| Interface | Input | Output |
|---|---|---|
| `Predicate<T>` | T | boolean |
| `Function<T,R>` | T | R |
| `Consumer<T>` | T | void |
| `Supplier<T>` | none | T |
| `UnaryOperator<T>` | T | T |
| `BinaryOperator<T>` | T,T | T |

## Examples

```java
Predicate<Integer> even = x -> x % 2 == 0;
```

```java
Function<String, Integer> length = String::length;
```

```java
Consumer<String> print = System.out::println;
```

```java
Supplier<UUID> supplier = UUID::randomUUID;
```

## Composition

```java
predicate1.and(predicate2)
predicate1.or(predicate2)
predicate.negate()
```

```java
f.andThen(g)
f.compose(g)
```

## Trap

Default and static methods do not count toward the single abstract method rule.
