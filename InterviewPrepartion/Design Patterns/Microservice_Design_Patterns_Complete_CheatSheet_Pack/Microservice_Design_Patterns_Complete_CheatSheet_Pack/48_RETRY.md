# Retry

## Intent
Re-attempt transient failures.

Use:
```text
bounded attempts
exponential backoff
jitter
idempotency
```

## Trap
Retrying permanent failure creates storms.
