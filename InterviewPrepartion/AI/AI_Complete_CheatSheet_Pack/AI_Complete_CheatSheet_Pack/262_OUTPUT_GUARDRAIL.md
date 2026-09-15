# Output Guardrail

## What / Why

Validate generated output before delivery/action.

## Mental Model

```text
schema/safety/factuality
```

## When to Use

Use high-risk domains.

## Common Mistake / Interview Trap

Post-filtering cannot undo already executed unsafe tool action.

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

> **Output Guardrail:** Validate generated output before delivery/action.
