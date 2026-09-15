# Deterministic Outer Loop

## What / Why

Application controls workflow while model handles bounded decisions/content.

## Mental Model

```text
code state machine → LLM nodes
```

## When to Use

Strong enterprise default.

## Common Mistake / Interview Trap

Prefer over fully autonomous loop for critical processes.

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

> **Deterministic Outer Loop:** Application controls workflow while model handles bounded decisions/content.
