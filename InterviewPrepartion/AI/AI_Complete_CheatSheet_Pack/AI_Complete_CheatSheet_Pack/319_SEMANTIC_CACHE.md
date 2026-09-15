# Semantic Cache

## What / Why

Reuse responses for semantically similar queries.

## Mental Model

```text
query embedding → cache lookup
```

## When to Use

Use repetitive low-risk Q&A.

## Common Mistake / Interview Trap

Wrong semantic match can return incorrect answer.

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

> **Semantic Cache:** Reuse responses for semantically similar queries.
