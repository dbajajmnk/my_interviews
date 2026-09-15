# Agent Unsafe Action

## What / Why

Check auth/policy/approval/argument validation at executor.

## Mental Model

```text
model request → policy
```

## When to Use

Block deterministically.

## Common Mistake / Interview Trap

Do not patch only system prompt.

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

> **Agent Unsafe Action:** Check auth/policy/approval/argument validation at executor.
