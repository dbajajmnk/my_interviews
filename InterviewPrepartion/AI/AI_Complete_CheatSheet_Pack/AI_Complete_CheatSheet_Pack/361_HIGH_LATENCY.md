# High Latency

## What / Why

Break down retrieval/model/tool/queue/network timings.

## Mental Model

```text
latency trace
```

## When to Use

Parallelize, cache, route, stream.

## Common Mistake / Interview Trap

Tail latency often comes from tools/retries.

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

> **High Latency:** Break down retrieval/model/tool/queue/network timings.
