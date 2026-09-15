# Retry Queue

## Intent
Delay reprocessing instead of immediate retry.

```text
Main Queue
 ↓ fail
Retry Queue / Delay
 ↓
Main Consumer
```

## Benefit
Avoid hot retry loops.

## Trap
Retry only transient failures.
