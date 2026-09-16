# C# Reference Tests

## Example

```csharp
[Fact]
public async Task Retry_Does_Not_Duplicate_Write()
{
    var result1 = await service.ExecuteAsync("idem-123");
    var result2 = await service.ExecuteAsync("idem-123");

    Assert.Equal(result1.Id, result2.Id);
    Assert.Equal(1, store.WriteCount);
}
```
