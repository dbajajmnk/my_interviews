# KV Cache

## What / Why

Caches attention key/value states during autoregressive decoding.

## Mental Model

```text
past K/V reused
```

## When to Use

Improves generation efficiency.

## Common Mistake / Interview Trap

Consumes memory proportional to sequence/layers.

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

> **KV Cache:** Caches attention key/value states during autoregressive decoding.
