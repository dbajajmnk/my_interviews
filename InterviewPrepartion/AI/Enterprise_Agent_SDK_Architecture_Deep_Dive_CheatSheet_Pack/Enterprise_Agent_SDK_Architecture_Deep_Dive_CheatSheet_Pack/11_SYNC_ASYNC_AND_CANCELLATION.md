# Sync, Async, and Cancellation

## Need

Enterprise SDKs should support:
- synchronous runs;
- async/future-based runs;
- streaming;
- cancellation.

## Language Mapping

| Language | Common Async Model |
|---|---|
| Java | CompletableFuture / reactive streams |
| Python | async / await |
| C# | Task / async-await |
| TypeScript | Promise / AsyncIterable |

## Cancellation

Cancellation should propagate through:
```text
SDK → runtime → provider/tool → network call
```

Do not merely stop returning output while backend work continues.

## Timeouts

Use layered timeouts:
- whole run;
- model call;
- tool call;
- retrieval call.
