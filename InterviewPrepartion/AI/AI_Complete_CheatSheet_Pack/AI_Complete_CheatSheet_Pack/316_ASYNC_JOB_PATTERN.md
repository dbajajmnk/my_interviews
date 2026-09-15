# Async Job Pattern

## What / Why

Queue long AI work and notify/poll later.

## Mental Model

```text
request → queue → worker → result
```

## When to Use

Use long document/video/agent tasks.

## Common Mistake / Interview Trap

Do not hold HTTP request indefinitely.

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

> **Async Job Pattern:** Queue long AI work and notify/poll later.
