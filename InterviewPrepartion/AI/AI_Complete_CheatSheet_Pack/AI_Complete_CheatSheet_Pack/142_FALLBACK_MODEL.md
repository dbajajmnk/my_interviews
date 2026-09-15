# Fallback Model

## What / Why

Use alternate model/provider on failure or policy.

## Mental Model

```text
primary → fallback
```

## When to Use

Use resilience/cost strategies.

## Common Mistake / Interview Trap

Behavior changes across models must be evaluated.

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

> **Fallback Model:** Use alternate model/provider on failure or policy.
