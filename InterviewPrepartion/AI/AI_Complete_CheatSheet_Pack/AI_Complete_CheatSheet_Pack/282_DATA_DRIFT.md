# Data Drift

## What / Why

Input distribution changes.

## Mental Model

```text
P_train(X) ≠ P_prod(X)
```

## When to Use

Monitor feature distributions.

## Common Mistake / Interview Trap

Drift does not always mean performance drop.

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

> **Data Drift:** Input distribution changes.
