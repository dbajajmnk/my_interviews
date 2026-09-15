# Decoder Only Model

## What / Why

Autoregressively predicts next tokens.

## Mental Model

```text
prefix → next token → repeat
```

## When to Use

Common LLM architecture.

## Common Mistake / Interview Trap

Generation is probabilistic decoding over token distributions.

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

> **Decoder Only Model:** Autoregressively predicts next tokens.
