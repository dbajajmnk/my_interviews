# Cross Validation

## What / Why

Rotate validation folds to estimate generalization robustly.

## Mental Model

```text
K folds → repeated train/validate
```

## When to Use

Use with limited tabular data.

## Common Mistake / Interview Trap

Expensive for large deep models.

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

> **Cross Validation:** Rotate validation folds to estimate generalization robustly.
