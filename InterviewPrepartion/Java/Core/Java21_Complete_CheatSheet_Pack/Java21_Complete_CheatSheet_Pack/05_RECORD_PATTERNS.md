# Record Patterns — Final in Java 21

## What

Record patterns deconstruct record values directly.

## Record

```java
record Point(int x, int y) {}
```

## Pattern

```java
if (obj instanceof Point(int x, int y)) {
    System.out.println(x + "," + y);
}
```

## Nested Pattern

```java
record Address(String city) {}
record User(String name, Address address) {}

if (obj instanceof User(
        String name,
        Address(String city))) {

    System.out.println(name + " - " + city);
}
```

## Why

Avoids repetitive accessor calls.

## Visual

```text
User
 ├── name
 └── Address
      └── city

Pattern
 ↓
extract name + city directly
```

## Great Fit

- immutable domain data
- algebraic-style data models
- sealed hierarchies
- switch pattern matching

## Trap

Record patterns deconstruct record state; they do not change record immutability rules.
