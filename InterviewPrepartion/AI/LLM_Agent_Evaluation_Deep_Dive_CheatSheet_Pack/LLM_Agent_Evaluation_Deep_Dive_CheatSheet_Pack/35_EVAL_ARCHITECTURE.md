# Evaluation Architecture

## Reference

```text
Eval Dataset
   ↓
Runner
   ↓
Agent/System Under Test
   ↓
Trace Store
   ↓
Evaluator Pipeline
 ├─ deterministic
 ├─ judge model
 ├─ safety
 ├─ retrieval
 ├─ latency/cost
 └─ human sample
   ↓
Scorecard
   ↓
Release Gate / Dashboard
```

## Design

Keep evaluator logic versioned separately from system-under-test.
