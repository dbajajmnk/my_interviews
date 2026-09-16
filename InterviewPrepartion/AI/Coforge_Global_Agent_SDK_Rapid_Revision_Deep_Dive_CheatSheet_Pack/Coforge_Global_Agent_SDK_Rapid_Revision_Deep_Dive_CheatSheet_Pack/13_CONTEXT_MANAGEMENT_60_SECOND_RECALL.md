# Context Management — 60-Second Recall

## Formula

```text
Context = Instructions + Input + Selected History + State + Relevant Memory + Retrieval + Tool Observations
```

## 60-Second Answer

> Context engineering is the controlled assembly of what the model should see for the next decision. I filter for relevance, freshness, authorization, and token budget, while keeping trusted runtime dependencies separate from model-visible context.

## Recall Points

- Minimum necessary context.
- Trusted context != model context.
- Reserve token headroom.
- Prevent stale/unauthorized context.
