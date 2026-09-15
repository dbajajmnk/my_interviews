# Positional Encoding

## What / Why

Injects token position information.

## Mental Model

```text
token embedding + position
```

## When to Use

Required because attention alone is order-agnostic.

## Common Mistake / Interview Trap

Different models use RoPE/learned/other schemes.

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

> **Positional Encoding:** Injects token position information.
