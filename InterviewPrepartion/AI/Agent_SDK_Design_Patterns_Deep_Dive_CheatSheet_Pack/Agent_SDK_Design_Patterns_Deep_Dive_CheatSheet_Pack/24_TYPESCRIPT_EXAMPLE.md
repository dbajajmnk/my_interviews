# TypeScript Example — Pattern Composition

## Example

```ts
interface ModelProvider {
  generate(req: ModelRequest): Promise<ModelResponse>;
}

class AzureOpenAIAdapter implements ModelProvider {
  constructor(private client: AzureClient) {}

  async generate(req: ModelRequest): Promise<ModelResponse> {
    const raw = await this.client.invoke(mapRequest(req));
    return normalize(raw);
  }
}

const provider =
  new TracingProvider(
    new RetryProvider(
      new AzureOpenAIAdapter(client)
    )
  );
```

## Pattern Mapping

Adapter + Decorator + Dependency Injection.
