# Compile, Invoke, Stream, Async

## Compile

`StateGraph` is a builder. Call `.compile()` to create an executable graph.

## Execution APIs

Common operations:
- `invoke()`
- `ainvoke()`
- `stream()`
- `astream()`

## Mental Model

```text
Builder
 ↓ compile()
Compiled Graph
 ├─ invoke
 ├─ stream
 ├─ ainvoke
 └─ astream
```

## Rule

Use async execution when nodes depend heavily on network-bound work such as model APIs, tools, and retrieval.
