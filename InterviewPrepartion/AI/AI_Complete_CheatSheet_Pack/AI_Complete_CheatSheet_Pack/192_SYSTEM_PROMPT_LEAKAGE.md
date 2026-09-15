# System Prompt Leakage

## What / Why

Model may reveal or infer hidden instructions.

## Mental Model

```text
attack → prompt disclosure attempt
```

## When to Use

Minimize secrets/instruction sensitivity.

## Common Mistake / Interview Trap

Never put credentials/secrets in prompts.

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

> **System Prompt Leakage:** Model may reveal or infer hidden instructions.
