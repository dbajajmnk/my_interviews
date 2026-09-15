# Training Divergence

## What / Why

Check LR, data, loss, precision, gradients, initialization.

## Mental Model

```text
loss NaN/explode
```

## When to Use

Use logging and gradient checks.

## Common Mistake / Interview Trap

Bad data can look like optimizer problem.

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

> **Training Divergence:** Check LR, data, loss, precision, gradients, initialization.
