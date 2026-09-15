# Chain Rule

## What / Why

Propagates derivatives through composed functions.

## Mental Model

```text
dy/dx = dy/du * du/dx
```

## When to Use

Basis of backpropagation.

## Common Mistake / Interview Trap

Vanishing/exploding gradients arise through repeated multiplication.

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

> **Chain Rule:** Propagates derivatives through composed functions.
