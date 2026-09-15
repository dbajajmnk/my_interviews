# Mixture of Experts

## What / Why

Routes tokens to subset of expert networks.

## Mental Model

```text
router → selected experts
```

## When to Use

Increases capacity with sparse compute.

## Common Mistake / Interview Trap

Routing/load balance add complexity.

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

> **Mixture of Experts:** Routes tokens to subset of expert networks.
