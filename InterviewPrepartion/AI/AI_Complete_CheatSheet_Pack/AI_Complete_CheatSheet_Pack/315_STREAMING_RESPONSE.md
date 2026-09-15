# Streaming Response

## What / Why

Stream partial tokens/events to improve responsiveness.

## Mental Model

```text
model stream → UI
```

## When to Use

Use chat/long generation.

## Common Mistake / Interview Trap

Need cancel/error/reconnect semantics.

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

> **Streaming Response:** Stream partial tokens/events to improve responsiveness.
