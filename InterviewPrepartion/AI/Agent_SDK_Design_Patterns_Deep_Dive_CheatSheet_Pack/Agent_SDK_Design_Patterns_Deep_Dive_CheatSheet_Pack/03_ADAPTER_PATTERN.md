# Adapter Pattern in Agent SDKs

## Intent

Convert one provider-specific API into the SDK's internal contract.

## Architecture

```text
Agent Runtime
     │
     ▼
ModelProvider
 ├─ OpenAIAdapter
 ├─ AzureOpenAIAdapter
 ├─ AnthropicAdapter
 └─ LocalModelAdapter
```

## Why It Matters

Without Adapter:
```text
Business Code → Vendor SDK Types Everywhere
```

With Adapter:
```text
Business Code → Internal Contract → Vendor Adapter
```

## Java Sketch

```java
interface ModelProvider {
    ModelResponse generate(ModelRequest request);
}

final class AzureOpenAIAdapter implements ModelProvider {
    private final AzureClient client;

    public ModelResponse generate(ModelRequest request) {
        var vendorResponse = client.invoke(map(request));
        return normalize(vendorResponse);
    }
}
```

## Interview Point

> Adapter is the main pattern for provider neutrality because it contains vendor-specific types at the boundary.
