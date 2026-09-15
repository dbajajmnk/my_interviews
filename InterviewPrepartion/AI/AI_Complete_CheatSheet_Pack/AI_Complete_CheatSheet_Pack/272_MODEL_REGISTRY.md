# Model Registry

## What / Why

Store approved model artifacts and metadata.

## Mental Model

```text
candidate → staging → prod
```

## When to Use

Use controlled promotion.

## Common Mistake / Interview Trap

Registry entry should include evaluation lineage.

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

> **Model Registry:** Store approved model artifacts and metadata.
