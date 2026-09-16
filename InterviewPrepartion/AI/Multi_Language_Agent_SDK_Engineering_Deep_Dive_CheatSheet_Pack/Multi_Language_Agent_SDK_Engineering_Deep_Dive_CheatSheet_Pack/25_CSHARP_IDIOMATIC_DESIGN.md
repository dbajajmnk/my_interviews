# C# Idiomatic SDK Design

## Characteristics

- async/await;
- Task/ValueTask;
- CancellationToken;
- records/classes;
- dependency injection;
- IAsyncEnumerable for streaming.

## Example

```csharp
var result = await agent.RunAsync(
    "Find my order",
    context,
    cancellationToken);
```

## Rule

Fit .NET async/cancellation and DI conventions naturally.
