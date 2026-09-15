# Testing, Test Slices & Testcontainers

## Pyramid
```text
Many Unit Tests → Focused Slice Tests → Integration Tests → Few E2E Tests
```

## Tools
JUnit, Mockito, Spring Test, MockMvc, WebTestClient, Testcontainers.

## Full Context
```java
@SpringBootTest
class ApplicationIT { }
```
Use only when you truly need the application context.

## Testcontainers
Useful for realistic PostgreSQL/MySQL/Kafka/Redis integration tests.

## Rule
Choose the **smallest test scope that proves the behavior**.

## Trap
Using `@SpringBootTest` for every test produces slow, noisy suites.
