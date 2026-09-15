# Data Leakage

## What / Why

Information from future/test/target leaks into training features.

## Mental Model

```text
future/target → feature pipeline
```

## When to Use

Use leakage checks in every pipeline.

## Common Mistake / Interview Trap

Leakage can make a useless model look excellent.

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

> **Data Leakage:** Information from future/test/target leaks into training features.
