# Delivery Semantics

## At-Most-Once

```text
may lose
no duplicates
```

## At-Least-Once

```text
no intentional loss
duplicates possible
```

## Exactly-Once

Usually applies within specific infrastructure/transaction boundaries.

## Business Reality

End-to-end exactly-once effects are difficult.

Prefer:

```text
at-least-once
+
idempotent processing
+
deduplication
```

## Trap

Exactly-once messaging does not automatically mean exactly-once business outcome.
