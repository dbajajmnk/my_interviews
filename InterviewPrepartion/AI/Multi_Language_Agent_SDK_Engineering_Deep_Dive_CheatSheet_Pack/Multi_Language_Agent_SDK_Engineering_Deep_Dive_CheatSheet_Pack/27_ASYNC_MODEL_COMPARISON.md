# Async Model Comparison

## Comparison

| Language | Common Async Primitive |
|---|---|
| Python | coroutine / await |
| Java | CompletionStage / CompletableFuture |
| C# | Task / ValueTask |
| TypeScript | Promise |

## Rule

Expose non-blocking APIs consistently; let sync helpers be optional convenience layers.
