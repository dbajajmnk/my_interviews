# Prompt Versioning

## What / Why

Store prompts as versioned artifacts with tests.

## Mental Model

```text
prompt v17 → eval suite
```

## When to Use

Use production changes.

## Common Mistake / Interview Trap

Prompt edits are code changes.

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

> **Prompt Versioning:** Store prompts as versioned artifacts with tests.
