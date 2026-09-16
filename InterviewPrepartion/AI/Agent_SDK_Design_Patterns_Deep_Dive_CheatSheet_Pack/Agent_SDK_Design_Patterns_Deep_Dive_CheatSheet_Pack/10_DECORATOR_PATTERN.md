# Decorator Pattern

## Intent

Add behavior around an existing component without modifying its core implementation.

## Use Cases

Decorate:
- model provider with tracing;
- retriever with caching;
- tool with authorization;
- provider with retry;
- memory with encryption.

## Example

```text
TracingModelProvider
    ↓
RetryingModelProvider
    ↓
AzureOpenAIProvider
```

## Benefit

Cross-cutting concerns stay composable and separately testable.

## Caution

Too many nested decorators can make runtime behavior hard to inspect. Keep composition visible.
