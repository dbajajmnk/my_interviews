# Structured Concurrency vs CompletableFuture

| Structured Concurrency | CompletableFuture |
|---|---|
| task lifecycle structure | completion-stage composition |
| parent-child concurrency | graph/pipeline composition |
| strong cancellation model | flexible async chaining |
| natural with virtual threads | often executor/future oriented |
| preview in Java 21 | final API |

## Use Structured Concurrency Conceptually For

```text
one request
→ multiple related child tasks
→ one combined lifecycle
```

## Use CompletableFuture For

```text
async transformations
dependent stages
event-style completion pipelines
```
