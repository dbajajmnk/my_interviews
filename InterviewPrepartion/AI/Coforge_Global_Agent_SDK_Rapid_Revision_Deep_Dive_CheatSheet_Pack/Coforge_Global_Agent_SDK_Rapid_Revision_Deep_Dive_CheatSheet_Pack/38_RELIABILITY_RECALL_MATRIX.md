# Reliability Recall Matrix

## Matrix

| Failure | Pattern |
|---|---|
| transient provider error | retry + jitter |
| persistent dependency failure | circuit breaker |
| resource exhaustion | bulkhead/rate limit |
| duplicate write | idempotency |
| process crash | checkpoint/resume |
| stale worker | fencing |
| provider outage | failover |
| overload | backpressure/load shedding |
