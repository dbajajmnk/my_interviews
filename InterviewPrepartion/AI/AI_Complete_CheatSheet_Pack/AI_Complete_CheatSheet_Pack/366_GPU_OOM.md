# GPU OOM

## What / Why

Reduce batch/context/model size, quantize, checkpoint, shard.

## Mental Model

```text
memory budget
```

## When to Use

Use profiling.

## Common Mistake / Interview Trap

More GPU is not always first fix.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **GPU OOM:** Reduce batch/context/model size, quantize, checkpoint, shard.
