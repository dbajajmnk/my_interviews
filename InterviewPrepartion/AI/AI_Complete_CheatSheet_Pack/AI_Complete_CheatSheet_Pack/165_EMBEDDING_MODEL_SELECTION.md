# Embedding Model Selection

## What / Why

Choose embedding model based on language/domain/cost/quality.

## Mental Model

```text
documents + query → same compatible vector space
```

## When to Use

Benchmark retrieval.

## Common Mistake / Interview Trap

Changing embedding model usually requires reindexing.

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

> **Embedding Model Selection:** Choose embedding model based on language/domain/cost/quality.
