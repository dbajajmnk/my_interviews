# Factory & Abstract Factory

## Intent

Centralize creation logic and hide concrete implementations.

## Factory Example

```text
ModelProviderFactory.create(config)
        ↓
AzureOpenAIProvider / OpenAIProvider / LocalProvider
```

## Abstract Factory

Useful when a provider family requires related objects:

```text
ProviderFactory
 ├─ createModelClient()
 ├─ createEmbeddingClient()
 └─ createTelemetryMapper()
```

## When to Use

Use when creation involves:
- configuration;
- secrets;
- capability checks;
- environment;
- provider type.

## Avoid

Do not build giant factories that know every application-specific component.
