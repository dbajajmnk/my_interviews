# Multi Head Attention

## What / Why

Runs multiple attention subspaces in parallel.

## Mental Model

```text
heads → concat/project
```

## When to Use

Captures varied relationships.

## Common Mistake / Interview Trap

More heads alone does not guarantee quality.

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

> **Multi Head Attention:** Runs multiple attention subspaces in parallel.
