# Circuit Breaker

## States
```text
CLOSED → OPEN → HALF-OPEN → CLOSED
```

## Intent
Stop hammering unhealthy dependencies.

## Trap
Still configure timeout.
