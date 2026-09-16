# LangChain Structured Outputs

## Current Pattern

LangChain agents support structured responses through `response_format`.

## Strategies

Current LangChain architecture supports:
- provider-native strategy when the provider supports structured output;
- tool-based strategy when it needs to emulate the contract through tool calling.

## Mental Model

```text
response_format = DomainSchema
      ↓
framework selects strategy
      ↓
provider-native or tool-based
      ↓
validated structured response
```

## Interview Point

> LangChain lets the application express the desired schema while the runtime chooses the best supported enforcement strategy.
