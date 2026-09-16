# C# Example — Pattern Composition

## Example

```csharp
public interface IModelProvider
{
    Task<ModelResponse> GenerateAsync(
        ModelRequest request,
        CancellationToken cancellationToken);
}

public sealed class AzureOpenAIAdapter : IModelProvider
{
    private readonly AzureClient _client;

    public AzureOpenAIAdapter(AzureClient client)
    {
        _client = client;
    }

    public async Task<ModelResponse> GenerateAsync(
        ModelRequest request,
        CancellationToken cancellationToken)
    {
        var raw = await _client.InvokeAsync(
            Map(request), cancellationToken);
        return Normalize(raw);
    }
}
```

## Pattern Mapping

Adapter + DI, with async/cancellation built into the contract.
