# Retry vs Circuit Breaker

| Retry | Circuit Breaker |
|---|---|
| try again | stop calling temporarily |
| transient failure | repeated dependency failure |
| backoff/jitter | state machine |
| can increase load | protects dependency |

## Best Together
```text
Timeout
→ limited Retry
→ Circuit Breaker
```
