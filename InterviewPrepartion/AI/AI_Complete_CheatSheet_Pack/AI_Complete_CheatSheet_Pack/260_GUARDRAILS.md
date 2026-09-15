# Guardrails

## What / Why

Input/output/tool policies constrain unsafe or noncompliant behavior.

## Mental Model

```text
input → policies → model/tools → output policies
```

## When to Use

Use layered safeguards.

## Common Mistake / Interview Trap

Guardrails can have false positives/negatives.

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

> **Guardrails:** Input/output/tool policies constrain unsafe or noncompliant behavior.
