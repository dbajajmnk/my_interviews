# Model Provider Abstraction

## Goal

Applications should not depend directly on one model vendor.

## Internal Contract

```text
ModelProvider
 ├─ AzureOpenAIProvider
 ├─ OpenAIProvider
 ├─ AnthropicProvider
 └─ LocalModelProvider
```

## Normalize

The SDK should normalize:
- messages/input;
- structured output request;
- tool-call request;
- usage/tokens;
- finish reason;
- provider errors;
- streaming chunks.

## Avoid Lowest-Common-Denominator Design

Provider neutrality does **not** mean ignoring advanced provider features.

Use capability discovery:

```text
supportsTools()
supportsStreaming()
supportsStructuredOutput()
supportsVision()
```

Then applications can fail fast or select a compatible provider.

## Interview Answer

> I would keep a stable internal model contract plus capability metadata, then implement provider-specific adapters. That avoids vendor lock-in without pretending all providers are identical.
