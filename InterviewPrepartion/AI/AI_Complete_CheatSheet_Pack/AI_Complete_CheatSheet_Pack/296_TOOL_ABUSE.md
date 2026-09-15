# Tool Abuse

## What / Why

Model calls legitimate tool with dangerous args.

## Mental Model

```text
tool call → delete/pay/send
```

## When to Use

Authorize each action/argument.

## Common Mistake / Interview Trap

Schema validation alone is insufficient.

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

> **Tool Abuse:** Model calls legitimate tool with dangerous args.
