# Streaming Model Comparison

## Comparison

| Language | Natural Streaming Abstraction |
|---|---|
| Python | AsyncIterator |
| Java | Flow.Publisher / reactive stream |
| C# | IAsyncEnumerable |
| TypeScript | AsyncIterable / ReadableStream |

## Rule

Semantic event types should match even if stream containers differ.
