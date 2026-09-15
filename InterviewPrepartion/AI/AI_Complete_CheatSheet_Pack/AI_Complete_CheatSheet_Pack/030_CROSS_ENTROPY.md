# Cross Entropy

## What / Why

Measures mismatch between target distribution and predictions.

## Mental Model

```text
-Σ y log p
```

## When to Use

Use classification/LLM training.

## Common Mistake / Interview Trap

Very confident wrong predictions are heavily penalized.

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

> **Cross Entropy:** Measures mismatch between target distribution and predictions.
