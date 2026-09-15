# High LLM Cost

## What / Why

Inspect prompt length, repeated context, model size, retrieval K, tool loops, cache hit.

## Mental Model

```text
cost trace
```

## When to Use

Route models, cache, compress context, bound loops.

## Common Mistake / Interview Trap

Do not optimize token cost at expense of business quality.

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

> **High LLM Cost:** Inspect prompt length, repeated context, model size, retrieval K, tool loops, cache hit.
