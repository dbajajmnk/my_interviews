# Training vs Inference

## What / Why

Training updates model parameters; inference uses learned parameters to produce predictions/outputs.

## Mental Model

```text
Train → frozen/served model → infer
```

## When to Use

Use to explain cost/latency differences.

## Common Mistake / Interview Trap

Fine-tuning is training, prompting is inference.

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

> **Training vs Inference:** Training updates model parameters; inference uses learned parameters to produce predictions/outputs.
