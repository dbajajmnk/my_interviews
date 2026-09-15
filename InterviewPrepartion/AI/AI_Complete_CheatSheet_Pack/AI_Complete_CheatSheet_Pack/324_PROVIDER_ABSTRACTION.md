# Provider Abstraction

## What / Why

Wrap vendor API behind capability-based interface.

## Mental Model

```text
generate/embed/tool/cost
```

## When to Use

Use portability/selective fallback.

## Common Mistake / Interview Trap

Lowest-common-denominator abstraction can hide useful features.

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

> **Provider Abstraction:** Wrap vendor API behind capability-based interface.
