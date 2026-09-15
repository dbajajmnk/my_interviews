# Gateway Routing

## Intent
Route requests based on host/path/header/etc.

```text
/orders/* → Order Service
/payments/* → Payment Service
```

## Benefits
Stable external API surface.

## Trap
Do not encode domain decisions in route rules.
