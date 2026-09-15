# Distillation

## What / Why

Train smaller model to imitate stronger teacher.

## Mental Model

```text
teacher outputs → student
```

## When to Use

Use lower latency/cost.

## Common Mistake / Interview Trap

Student inherits teacher limitations/bias.

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

> **Distillation:** Train smaller model to imitate stronger teacher.
