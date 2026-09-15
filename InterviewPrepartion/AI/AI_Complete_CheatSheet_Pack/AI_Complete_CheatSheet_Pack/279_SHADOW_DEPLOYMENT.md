# Shadow Deployment

## What / Why

New model observes live inputs but does not affect user response.

## Mental Model

```text
production traffic → shadow model
```

## When to Use

Use validation.

## Common Mistake / Interview Trap

Handle sensitive data and cost.

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

> **Shadow Deployment:** New model observes live inputs but does not affect user response.
