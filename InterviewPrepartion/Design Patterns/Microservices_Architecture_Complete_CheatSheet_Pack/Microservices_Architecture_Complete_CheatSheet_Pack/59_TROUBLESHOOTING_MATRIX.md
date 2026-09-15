# Troubleshooting Matrix

| Symptom | First Checks | Likely Cause |
|---|---|---|
| High latency | trace waterfall | slow downstream / DB |
| Timeouts | dependency latency | capacity / network |
| Retry storm | retry metrics | excessive retry layers |
| Duplicate orders | idempotency | redelivery / retry |
| Missing event | outbox / broker | dual write / publisher |
| DB overload | query + pool | N+1 / pool / hot service |
| Cascading failure | dependency graph | no isolation |
| CPU high | profiler | compute / serialization |
| Queue lag | consumer rate | under-capacity |
| 5xx spike | deploy timeline | bad release / dependency |
| Partial transaction | saga state | compensation failure |
| Auth failures | identity / clock | token / trust / config |

## Debug Flow

```text
Metric
 ↓
Trace
 ↓
Logs
 ↓
Dependency health
 ↓
Profile / Query Plan
 ↓
Fix
 ↓
Re-measure
```
