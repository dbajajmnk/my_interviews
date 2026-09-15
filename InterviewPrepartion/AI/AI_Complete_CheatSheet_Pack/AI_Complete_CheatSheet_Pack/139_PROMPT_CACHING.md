# Prompt Caching

## What / Why

Reuse common prompt prefix computation to reduce latency/cost where platform supports it.

## Mental Model

```text
shared prefix → cache hit
```

## When to Use

Use large repeated instructions/context.

## Common Mistake / Interview Trap

Cache semantics differ by vendor/model.

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

> **Prompt Caching:** Reuse common prompt prefix computation to reduce latency/cost where platform supports it.
