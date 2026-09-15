# LLM Mental Model

## What / Why

An LLM predicts token distributions conditioned on context and learned representations.

## Mental Model

```text
tokens → embeddings → transformer → logits → decoding
```

## When to Use

Use to demystify LLM behavior.

## Common Mistake / Interview Trap

LLM output is not a database lookup.

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

> **LLM Mental Model:** An LLM predicts token distributions conditioned on context and learned representations.
