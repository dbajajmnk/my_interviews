# Transactions Cheat Sheet

```java
@Transactional
public void placeOrder(...) { ... }
```

## Flow
```text
Method Call → Spring Proxy → Open/Join Transaction → Business Method → Commit/Rollback
```

## Know
Propagation, isolation, rollback rules, read-only transactions, transaction boundaries.

## Self-Invocation Trap
`this.transactionalMethod()` may bypass proxy interception.

## Boundary
Transactions typically wrap one coherent business use case at service/application level.

## Distributed Systems
`@Transactional` does not create an atomic transaction across independent microservices.
