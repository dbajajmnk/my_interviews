# Dropout

## What / Why

Randomly zeros activations during training.

## Mental Model

```text
mask activations
```

## When to Use

Use where architecture benefits.

## Common Mistake / Interview Trap

Disabled at inference.

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

> **Dropout:** Randomly zeros activations during training.
