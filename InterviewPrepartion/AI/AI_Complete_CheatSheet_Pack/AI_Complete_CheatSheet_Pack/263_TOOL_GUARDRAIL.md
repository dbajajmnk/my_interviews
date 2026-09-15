# Tool Guardrail

## What / Why

Authorize tool/arguments/action separately.

## Mental Model

```text
model request → policy → tool
```

## When to Use

Critical for agents.

## Common Mistake / Interview Trap

Never let model choose its own permission.

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

> **Tool Guardrail:** Authorize tool/arguments/action separately.
