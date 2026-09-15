# Model Serving

## What / Why

Expose model via batch/online/stream endpoint.

## Mental Model

```text
request → inference server
```

## When to Use

Choose latency/throughput needs.

## Common Mistake / Interview Trap

GPU utilization and queueing dominate cost.

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

> **Model Serving:** Expose model via batch/online/stream endpoint.
