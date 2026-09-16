# Multi-Language Recall Matrix

## Matrix

| Language | Async | Streaming | Cancellation |
|---|---|---|---|
| Python | await | AsyncIterator | task/cancel scope |
| Java | CompletionStage | Flow.Publisher | Future/timeout |
| C# | Task | IAsyncEnumerable | CancellationToken |
| TypeScript | Promise | AsyncIterable | AbortSignal |
