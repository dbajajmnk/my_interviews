# Timeout

## Intent
Stop waiting forever for remote work.

```text
Call → wait up to budget → fail
```

## Rule
Every network call should have a timeout.

## Trap
Timeout values must fit an end-to-end latency budget.
