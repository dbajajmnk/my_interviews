# Enhanced Pseudo-Random Number Generators

## What

Java 17 introduced a more extensible random-generator API.

## Package

```java
java.util.random
```

## Example

```java
RandomGenerator generator =
    RandomGenerator.getDefault();

int value = generator.nextInt(100);
```

## Discover Algorithms

```java
RandomGeneratorFactory.all()
    .forEach(factory ->
        System.out.println(factory.name()));
```

## Why

A common abstraction over multiple random algorithms.

## Important

Pseudo-random != cryptographically secure.

For security-sensitive random values, use security-focused APIs such as `SecureRandom`.

## Trap

Never use ordinary pseudo-random generators for tokens/password-reset secrets merely because the API is newer.
