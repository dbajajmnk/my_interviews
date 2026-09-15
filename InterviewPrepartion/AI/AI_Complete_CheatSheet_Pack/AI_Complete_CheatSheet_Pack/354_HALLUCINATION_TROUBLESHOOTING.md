# Hallucination Troubleshooting

## What / Why

Check missing evidence, retrieval quality, ambiguity, stale data, prompt/model behavior.

## Mental Model

```text
error → classify cause
```

## When to Use

Use RAG/eval traces.

## Common Mistake / Interview Trap

Temperature=0 does not eliminate hallucination.

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

> **Hallucination Troubleshooting:** Check missing evidence, retrieval quality, ambiguity, stale data, prompt/model behavior.
