# Credential Isolation

## What / Why

Keep secrets outside prompt/model output; inject only at tool boundary.

## Mental Model

```text
model requests action → trusted executor uses secret
```

## When to Use

Use all agent systems.

## Common Mistake / Interview Trap

Never expose raw credentials to model.

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

> **Credential Isolation:** Keep secrets outside prompt/model output; inject only at tool boundary.
