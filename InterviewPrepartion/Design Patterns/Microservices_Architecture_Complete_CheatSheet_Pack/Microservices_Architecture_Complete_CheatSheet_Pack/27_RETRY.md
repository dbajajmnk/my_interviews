# Retry

## Use For

Transient failures:

```text
timeout
temporary network failure
brief service overload
```

## Pattern

```text
attempt
 ↓ fail
backoff
 ↓
retry
```

## Good Retry

```text
bounded attempts
exponential backoff
jitter
idempotent operation
```

## Trap

Retrying permanent failures creates retry storms.
