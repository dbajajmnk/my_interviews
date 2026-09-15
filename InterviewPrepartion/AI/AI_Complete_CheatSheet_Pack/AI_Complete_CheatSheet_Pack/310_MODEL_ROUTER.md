# Model Router

## What / Why

Choose model dynamically by task/risk/cost.

## Mental Model

```text
request → router → model
```

## When to Use

Use workload segmentation.

## Common Mistake / Interview Trap

Requires per-route evals.

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

> **Model Router:** Choose model dynamically by task/risk/cost.
