# Reranker

## What / Why

Score query-passage relevance with stronger model.

## Mental Model

```text
candidate K → reranker → top N
```

## When to Use

Use when vector search is noisy.

## Common Mistake / Interview Trap

Latency/cost trade-off.

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

> **Reranker:** Score query-passage relevance with stronger model.
