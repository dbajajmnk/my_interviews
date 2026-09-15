# Latency Budget

## What / Why

Allocate total response time across retrieval/model/tools.

## Mental Model

```text
T_total = retrieve + model + tools
```

## When to Use

Use UX SLOs.

## Common Mistake / Interview Trap

Long agent chains multiply tail latency.

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

> **Latency Budget:** Allocate total response time across retrieval/model/tools.
