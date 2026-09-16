# Cancellation and Timeouts

## Language Mapping

- Python → cancellation through async task/cancel scope
- Java → Future/CompletableFuture cancellation + timeout APIs
- C# → CancellationToken
- TypeScript → AbortSignal / AbortController

## Rule

Public semantics should be equivalent even though mechanisms differ.
