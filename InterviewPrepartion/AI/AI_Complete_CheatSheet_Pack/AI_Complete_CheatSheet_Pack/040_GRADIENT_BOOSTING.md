# Gradient Boosting

## What / Why

Sequential trees correct prior errors.

## Mental Model

```text
tree1 + tree2 + ...
```

## When to Use

Use tabular data; XGBoost/LightGBM/CatBoost family.

## Common Mistake / Interview Trap

Tune leakage, depth, learning rate carefully.

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

> **Gradient Boosting:** Sequential trees correct prior errors.
