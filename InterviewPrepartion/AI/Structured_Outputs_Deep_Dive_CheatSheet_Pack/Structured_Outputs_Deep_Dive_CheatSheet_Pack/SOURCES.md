# Source Notes

## OpenAI

Verified against current OpenAI material showing:
- Structured Outputs use developer-supplied JSON Schema;
- JSON Schema is preferred over older JSON mode for supporting models;
- strict tool/function schemas can constrain tool arguments;
- schema adherence does not prevent semantic mistakes;
- refusal or incomplete generation must be handled separately.

## LangChain

Verified against current LangChain structured-output architecture:
- agent `response_format`;
- provider-native structured output when available;
- tool-based fallback strategy when needed.

## Microsoft Agent Framework

Verified against current Microsoft Agent Framework documentation:
- typed `RunAsync<T>` style support in C#;
- `ResponseFormat` schema support;
- Python Pydantic/JSON-schema mappings;
- Go typed struct support;
- fallback wrapping for agents without native structured-output capability, with lower reliability caveat.

## Currency Note

Provider schema subsets and APIs evolve quickly. Verify exact schema keyword support, imports, and method signatures in current official documentation before production implementation.
