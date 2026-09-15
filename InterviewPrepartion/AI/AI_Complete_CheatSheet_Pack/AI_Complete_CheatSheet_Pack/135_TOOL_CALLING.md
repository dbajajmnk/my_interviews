# Tool Calling

## What / Why

Model selects external functions/tools.

## Mental Model

```text
LLM → tool call → result → LLM
```

## When to Use

Use actions/current data/calculation.

## Common Mistake / Interview Trap

Tool execution must enforce auth and validation.

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

> **Tool Calling:** Model selects external functions/tools.
