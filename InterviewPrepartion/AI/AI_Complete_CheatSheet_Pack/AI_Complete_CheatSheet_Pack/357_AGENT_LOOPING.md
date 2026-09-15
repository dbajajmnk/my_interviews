# Agent Looping

## What / Why

Check stop conditions, repeated tool errors, vague goal, stale observation.

## Mental Model

```text
trace → repeated state
```

## When to Use

Add bounded steps, tool error handling, explicit completion.

## Common Mistake / Interview Trap

Never allow unbounded loops.

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

> **Agent Looping:** Check stop conditions, repeated tool errors, vague goal, stale observation.
