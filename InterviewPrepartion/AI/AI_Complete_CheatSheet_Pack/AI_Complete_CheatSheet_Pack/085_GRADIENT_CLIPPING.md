# Gradient Clipping

## What / Why

Caps gradient norm/value.

## Mental Model

```text
clip(g)
```

## When to Use

Use RNN/transformer stability.

## Common Mistake / Interview Trap

Does not fix fundamentally bad optimization.

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

> **Gradient Clipping:** Caps gradient norm/value.
