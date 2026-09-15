# Input Guardrail

## What / Why

Validate/filter user/context before model/tool use.

## Mental Model

```text
classify/PII/injection/schema
```

## When to Use

Use early.

## Common Mistake / Interview Trap

Do not destroy legitimate user intent.

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

> **Input Guardrail:** Validate/filter user/context before model/tool use.
