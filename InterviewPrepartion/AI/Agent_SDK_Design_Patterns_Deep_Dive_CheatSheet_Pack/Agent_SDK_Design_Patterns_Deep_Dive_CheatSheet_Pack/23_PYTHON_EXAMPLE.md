# Python Example — Pattern Composition

## Example

```python
class ModelProvider:
    async def generate(self, request):
        raise NotImplementedError

class OpenAIAdapter(ModelProvider):
    def __init__(self, client):
        self.client = client

    async def generate(self, request):
        raw = await self.client.responses.create(**map_request(request))
        return normalize(raw)

provider = TracingProvider(
    RetryingProvider(
        OpenAIAdapter(client)
    )
)

agent = (
    AgentBuilder()
    .with_model(provider)
    .add_tool(get_order_status)
    .build()
)
```

## Pattern Mapping

Adapter + Decorator + Builder + Dependency Injection.
