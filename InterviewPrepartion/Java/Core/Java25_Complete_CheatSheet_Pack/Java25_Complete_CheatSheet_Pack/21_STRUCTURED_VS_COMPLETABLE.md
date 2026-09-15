# Structured Concurrency vs CompletableFuture

| Structured Concurrency | CompletableFuture |
|---|---|
| parent-child task structure | async stage graph |
| lifecycle bounded by scope | lifecycle may be dispersed |
| natural with virtual threads | executor/future oriented |
| cancellation/failure easier to reason | flexible pipelines |
| preview Java 25 | final API |

## Structured Example

```text
HTTP Request
 ├── user task
 ├── order task
 └── pricing task
      ↓
     join
```

## CompletableFuture Example

```text
fetch
 ↓
transform
 ↓
combine
 ↓
recover
```

## Rule

Use the model that best represents the shape of work.
