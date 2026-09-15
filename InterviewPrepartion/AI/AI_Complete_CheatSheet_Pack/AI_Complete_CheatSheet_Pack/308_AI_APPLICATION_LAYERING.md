# AI Application Layering

## What / Why

Separate UX/orchestration/model/data/tools/policy/observability.

## Mental Model

```text
client → orchestration → model/tools/data
```

## When to Use

Use maintainable systems.

## Common Mistake / Interview Trap

Do not call model directly from every UI component.

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

> **AI Application Layering:** Separate UX/orchestration/model/data/tools/policy/observability.
