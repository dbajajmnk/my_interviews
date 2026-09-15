# Sources & Accuracy Notes

This pack is vendor-neutral and pattern-first.

Pattern families align with established microservices and enterprise integration literature, including:

- Domain-Driven Design
- Microservices patterns
- Enterprise Integration Patterns
- Cloud-native resilience patterns
- distributed systems consistency patterns
- progressive delivery patterns

## Core Principle

Patterns are not mandatory building blocks.

Use a pattern only when the problem it solves actually exists.

## Important Distinctions

```text
Architecture pattern
!=
framework feature
!=
product/service
```

For example:

```text
Saga = architecture pattern
Step Functions / Temporal / Camunda = possible implementations
```

```text
Outbox = consistency pattern
Debezium / DMS / CDC tools = possible implementation mechanisms
```

## Rule

Prefer:
```text
simple local transaction
simple synchronous call
simple modular monolith
```
until distributed complexity is justified.
