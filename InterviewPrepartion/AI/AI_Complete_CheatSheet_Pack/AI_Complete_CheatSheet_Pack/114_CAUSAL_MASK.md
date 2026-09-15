# Causal Mask

## What / Why

Prevents decoder from attending to future tokens.

## Mental Model

```text
triangular attention mask
```

## When to Use

Required for autoregressive training.

## Common Mistake / Interview Trap

Does not itself guarantee factuality.

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

> **Causal Mask:** Prevents decoder from attending to future tokens.
