# Calibration

## What / Why

Checks whether predicted probabilities match observed frequency.

## Mental Model

```text
0.8 confidence ≈ 80% correct
```

## When to Use

Use risk/decision systems.

## Common Mistake / Interview Trap

Good ranking does not imply good calibration.

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

> **Calibration:** Checks whether predicted probabilities match observed frequency.
