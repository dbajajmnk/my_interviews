# Caching Strategy

## What / Why

Cache deterministic/common model, embedding, retrieval or prompt prefixes appropriately.

## Mental Model

```text
request → cache layers
```

## When to Use

Use cost/latency optimization.

## Common Mistake / Interview Trap

Avoid caching sensitive/personalized stale answers incorrectly.

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

> **Caching Strategy:** Cache deterministic/common model, embedding, retrieval or prompt prefixes appropriately.
