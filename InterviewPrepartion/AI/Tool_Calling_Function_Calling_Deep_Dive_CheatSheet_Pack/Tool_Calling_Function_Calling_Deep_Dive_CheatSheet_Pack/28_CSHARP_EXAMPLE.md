# C# Example — Tool Calling Pattern

## Example

```csharp
public sealed record ToolContext(
    string UserId,
    string TenantId);

public async Task<OrderStatus> GetOrderStatusAsync(
    string orderId,
    ToolContext context,
    CancellationToken cancellationToken)
{
    await _authorization.CheckAsync(
        context.UserId,
        "order:read",
        cancellationToken);

    return await _orders.GetStatusAsync(
        context.TenantId,
        orderId,
        cancellationToken);
}
```

## Rule

Carry cancellation and identity through the execution layer.
