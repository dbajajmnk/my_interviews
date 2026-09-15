# Top P

## What / Why

Samples from smallest token set reaching cumulative probability p.

## Mental Model

```text
nucleus sampling
```

## When to Use

Use creative/open-ended generation.

## Common Mistake / Interview Trap

Deterministic business tasks often prefer lower variance.

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

> **Top P:** Samples from smallest token set reaching cumulative probability p.
