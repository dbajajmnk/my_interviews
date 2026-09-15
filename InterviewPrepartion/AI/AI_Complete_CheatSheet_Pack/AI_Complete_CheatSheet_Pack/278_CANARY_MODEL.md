# Canary Model

## What / Why

Send small traffic to new model.

## Mental Model

```text
5% → new model
```

## When to Use

Use safe rollout.

## Common Mistake / Interview Trap

Compare model/business metrics.

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

> **Canary Model:** Send small traffic to new model.
