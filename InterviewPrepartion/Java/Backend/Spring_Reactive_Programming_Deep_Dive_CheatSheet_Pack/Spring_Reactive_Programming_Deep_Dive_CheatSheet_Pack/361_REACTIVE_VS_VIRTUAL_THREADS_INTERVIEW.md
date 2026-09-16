# Reactive vs Virtual Threads Interview

## What / Why
continuations/backpressure vs lightweight blocking style.

## Mental Model
```text
Reactive vs Virtual Threads Interview → source → signals → demand → execution → terminal outcome
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
> **Reactive vs Virtual Threads Interview:** continuations/backpressure vs lightweight blocking style.
