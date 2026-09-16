# Reliability & Resilience — 60-Second Recall

## Formula

```text
Timeout + Retry + Circuit Breaker + Bulkhead + Idempotency + Checkpoint + Fencing + Failover
```

## 60-Second Answer

> I use explicit timeout budgets, retry only transient failures with backoff/jitter, isolate failures with circuit breakers and bulkheads, protect side effects through idempotency, and use durable checkpoints plus fencing for long-running work. Provider/tool/RAG/memory failures have tested fallback or degradation strategies.

## Recall Points

- Lease alone is not enough.
- Fence stale workers.
- Backpressure/load shedding.
- SLO/error budget/DR.
