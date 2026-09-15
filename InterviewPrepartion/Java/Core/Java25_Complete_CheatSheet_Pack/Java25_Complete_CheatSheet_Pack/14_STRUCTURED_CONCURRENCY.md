# Structured Concurrency — Fifth Preview in Java 25

## What

Treat related concurrent subtasks as one unit of work.

## Basic Shape

```java
try (var scope = StructuredTaskScope.open()) {

    var user = scope.fork(() -> loadUser());
    var orders = scope.fork(() -> loadOrders());

    scope.join();

    use(user.get(), orders.get());
}
```

## Default

The default scope uses virtual threads for subtasks.

## Mental Model

```text
Request
 ├── Load User
 └── Load Orders
       ↓
      join
       ↓
combined result
```

## Benefits

- bounded lifetime
- failure propagation
- cancellation
- easier observability
- natural virtual-thread composition

## Status

Preview API in Java 25.

## Trap

Scoped Values are final in Java 25; Structured Concurrency is not.
