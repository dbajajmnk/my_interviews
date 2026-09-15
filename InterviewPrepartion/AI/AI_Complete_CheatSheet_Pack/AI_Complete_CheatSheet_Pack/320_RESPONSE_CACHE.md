# Response Cache

## What / Why

Cache exact deterministic responses.

## Mental Model

```text
key(prompt/model/version)
```

## When to Use

Use stable tasks.

## Common Mistake / Interview Trap

Include model/prompt/context version in key.

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

> **Response Cache:** Cache exact deterministic responses.
