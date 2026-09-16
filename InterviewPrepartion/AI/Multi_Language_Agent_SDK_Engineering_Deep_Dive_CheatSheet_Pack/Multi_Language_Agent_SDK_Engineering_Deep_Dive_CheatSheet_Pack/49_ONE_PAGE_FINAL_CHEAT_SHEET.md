# Multi-Language Agent SDK Engineering — One-Page Final Cheat Sheet

## Formula

```text
Multi-Language Agent SDK =
Canonical Semantics
+ Idiomatic APIs
+ Shared Wire Formats
+ Shared Error Model
+ Native Async/Streaming
+ Contract Tests
+ Parity Matrix
+ Native Packaging
```

## Language Recall

```text
Python     → async/await + AsyncIterator
Java       → CompletionStage + Flow.Publisher
C#         → Task + CancellationToken + IAsyncEnumerable
TypeScript → Promise + AbortSignal + AsyncIterable
```

## Production Rules

1. Share semantics, not syntax.
2. Keep provider types out of public API.
3. Normalize errors and retryability.
4. Define one semantic streaming event model.
5. Use native cancellation mechanisms.
6. Generate mechanics; handcraft developer experience.
7. Share canonical fixtures.
8. Run parity tests in CI.
9. Publish through native registries.
10. Keep compatibility/deprecation explicit.

## 30-Second Answer

> I define one language-neutral Agent SDK contract for Agent, Tool, Run, Context, Events, Results and Errors, then map that contract idiomatically into Python, Java, C# and TypeScript. The async and streaming containers differ per language, but event semantics, cancellation behavior, wire formats, error codes and provider abstractions remain consistent. Shared fixtures, cross-language contract tests and a CI parity matrix prevent drift, while each SDK is packaged and documented natively.

## Recall Line

> **One semantic contract, four idiomatic developer experiences.**
