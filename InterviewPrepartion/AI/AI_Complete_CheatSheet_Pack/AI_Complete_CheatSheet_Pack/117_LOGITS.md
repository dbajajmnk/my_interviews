# Logits

## What / Why

Raw model scores before softmax.

## Mental Model

```text
hidden → vocabulary logits
```

## When to Use

Used for decoding.

## Common Mistake / Interview Trap

Logits are not calibrated probabilities by default.

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

> **Logits:** Raw model scores before softmax.
