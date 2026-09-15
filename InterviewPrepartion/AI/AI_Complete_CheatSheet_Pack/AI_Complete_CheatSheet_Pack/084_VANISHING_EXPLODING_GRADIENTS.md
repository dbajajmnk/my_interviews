# Vanishing Exploding Gradients

## What / Why

Gradients shrink/explode through deep computation.

## Mental Model

```text
product of derivatives
```

## When to Use

Use residuals/norm/init/clipping.

## Common Mistake / Interview Trap

Can destabilize training silently.

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

> **Vanishing Exploding Gradients:** Gradients shrink/explode through deep computation.
