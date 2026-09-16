# Context Assembly Pipeline

## Pipeline

```text
Current input
  + system instructions
  + selected history
  + state
  + relevant memory
  + retrieved knowledge
  + tool observations
      ↓
Normalize
      ↓
Authorize/filter
      ↓
Rank/reduce
      ↓
Token-budget
      ↓
Model context
```

## Design Principle

Build context as a pipeline with explicit stages rather than ad-hoc prompt concatenation.
