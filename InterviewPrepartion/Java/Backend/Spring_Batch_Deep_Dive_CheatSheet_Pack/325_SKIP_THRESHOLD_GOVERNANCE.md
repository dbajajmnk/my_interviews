# Skip Threshold Governance

## What / Why
A job that completes with massive skips may still be business failure.

## Mental Model
```text
Skip Threshold Governance → Job/Step state → transaction/checkpoint → restart behavior
```

## How to Think About It
1. What is the logical `JobInstance`?
2. What state must survive process failure?
3. Where is the transaction boundary?
4. What can execute more than once after retry/restart?
5. Is the reader/writer thread-safe if concurrency is added?
6. What does the JobRepository record?
7. How will operations restart, stop, reconcile and audit the job?

## Production Questions
```text
Business identity?
Restart point?
Chunk size?
Idempotency?
Retry / skip?
Transaction?
Metadata repository?
Concurrency?
SLA?
Reconciliation?
Observability?
```

## Common Trap
A batch job is not production-ready just because it processes all rows once. Production batch requires deterministic identity, checkpointing, safe restart, reconciliation and operational control.

## 20-Second Recall
> **Skip Threshold Governance:** A job that completes with massive skips may still be business failure.
