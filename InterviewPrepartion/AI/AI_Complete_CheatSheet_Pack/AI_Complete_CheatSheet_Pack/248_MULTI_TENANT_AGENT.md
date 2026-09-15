# Multi Tenant Agent

## What / Why

Isolate prompts, memory, tools and data per tenant.

## Mental Model

```text
tenant identity → isolated context/tools
```

## When to Use

Use SaaS.

## Common Mistake / Interview Trap

Cross-tenant leakage is critical risk.

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

> **Multi Tenant Agent:** Isolate prompts, memory, tools and data per tenant.
