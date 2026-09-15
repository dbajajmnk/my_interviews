# Lambda Expressions

## What

A lambda is a concise way to provide the implementation of a functional interface.

## Syntax

```java
(parameters) -> expression
```

or

```java
(parameters) -> {
    statements;
}
```

## Before

```java
Comparator<String> c = new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
};
```

## After

```java
Comparator<String> c = (a, b) -> a.compareTo(b);
```

## Why

- less boilerplate
- functions can be passed as values
- enables streams
- supports declarative programming

## Variable Capture

A local variable captured by a lambda must be **final or effectively final**.

```java
int limit = 10;

list.stream()
    .filter(x -> x > limit)
    .forEach(System.out::println);
```

## Important Difference

`this` inside a lambda refers to the enclosing instance, unlike an anonymous inner class.

## Trap

A lambda is not simply “a shorter anonymous class.” Semantics such as `this`, scope, and target typing differ.
