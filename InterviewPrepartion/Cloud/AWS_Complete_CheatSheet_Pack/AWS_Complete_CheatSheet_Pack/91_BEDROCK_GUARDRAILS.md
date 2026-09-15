# Bedrock Guardrails / Evaluation

## Guardrails

Evaluate/filter model inputs and outputs according to configured safeguards/policies.

## Evaluation

Assess:

```text
model performance
RAG/knowledge-base behavior
accuracy/relevance
robustness
safety
```

## Production Pattern

```text
Prompt
 ↓
Input Controls
 ↓
Model / RAG
 ↓
Output Controls
 ↓
Evaluation / Monitoring
```

## Trap

Guardrails reduce risk but do not replace end-to-end application security and human governance.
