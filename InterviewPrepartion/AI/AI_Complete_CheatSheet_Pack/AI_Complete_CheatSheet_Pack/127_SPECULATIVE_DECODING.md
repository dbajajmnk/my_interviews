# Speculative Decoding

## What / Why

Draft model proposes tokens, target model verifies.

## Mental Model

```text
draft → verify
```

## When to Use

Use faster decoding.

## Common Mistake / Interview Trap

Benefit depends on acceptance/hardware.

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

> **Speculative Decoding:** Draft model proposes tokens, target model verifies.
