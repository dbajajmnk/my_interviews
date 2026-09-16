# Release Gates and CI

## Pipeline

```text
PR
 ↓
Unit tests
 ↓
Agent eval suite
 ↓
Safety evals
 ↓
Cost/latency check
 ↓
Threshold pass?
 ├─ yes → deploy
 └─ no  → block
```

## Rule

Evaluation should be executable and automatable, not only a spreadsheet exercise.
