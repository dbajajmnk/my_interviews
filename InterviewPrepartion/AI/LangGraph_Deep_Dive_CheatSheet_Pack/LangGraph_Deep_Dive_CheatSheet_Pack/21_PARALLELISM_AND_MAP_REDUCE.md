# Parallelism and Map-Reduce

## Parallel Branches

Multiple nodes can run in parallel when graph dependencies allow it.

## Map-Reduce

Use `Send` for dynamic fan-out and reducers to aggregate results.

## Example

```text
Documents
   │
   ├─ worker(doc1)
   ├─ worker(doc2)
   └─ worker(doc3)
          ↓
        reducer
          ↓
        summary
```

## Production Considerations

Watch:
- concurrency limits;
- provider rate limits;
- result ordering;
- reducer correctness;
- memory/token use.
