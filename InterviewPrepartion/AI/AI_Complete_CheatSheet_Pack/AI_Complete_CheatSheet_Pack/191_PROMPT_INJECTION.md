# Prompt Injection

## What / Why

Untrusted content attempts to override instructions or induce unsafe tool use.

## Mental Model

```text
data contains malicious instruction
```

## When to Use

Treat external content as data, not authority.

## Common Mistake / Interview Trap

Prompt filtering alone is insufficient.

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

> **Prompt Injection:** Untrusted content attempts to override instructions or induce unsafe tool use.
