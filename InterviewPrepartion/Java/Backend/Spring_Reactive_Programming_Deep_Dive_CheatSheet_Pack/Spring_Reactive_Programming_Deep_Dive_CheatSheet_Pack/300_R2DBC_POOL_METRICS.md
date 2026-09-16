# R2DBC Pool Metrics

## What / Why
Track acquire/usage/timeout.

## Mental Model
```text
R2DBC Pool Metrics → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **R2DBC Pool Metrics:** Track acquire/usage/timeout.
