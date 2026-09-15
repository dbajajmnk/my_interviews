# Egress Control

## What / Why

Restrict network destinations from agent/sandbox.

## Mental Model

```text
allowlist domains
```

## When to Use

Use high-security agents.

## Common Mistake / Interview Trap

Prevents simple exfil paths.

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

> **Egress Control:** Restrict network destinations from agent/sandbox.
