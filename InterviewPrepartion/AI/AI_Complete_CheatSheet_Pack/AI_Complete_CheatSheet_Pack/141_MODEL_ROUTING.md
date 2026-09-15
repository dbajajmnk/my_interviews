# Model Routing

## What / Why

Select model by task/cost/latency/risk.

## Mental Model

```text
task → classifier/router → model
```

## When to Use

Use heterogeneous workloads.

## Common Mistake / Interview Trap

Routing adds evaluation and fallback complexity.

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

> **Model Routing:** Select model by task/cost/latency/risk.
