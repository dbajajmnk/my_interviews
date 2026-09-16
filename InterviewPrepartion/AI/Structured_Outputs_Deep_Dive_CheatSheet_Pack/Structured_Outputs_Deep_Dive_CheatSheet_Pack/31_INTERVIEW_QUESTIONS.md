# Structured Outputs — Interview Questions & Answers

## 1. What are Structured Outputs?

Model responses constrained to a developer-defined schema or application type.

## 2. JSON mode vs Structured Outputs?

JSON mode guarantees valid JSON syntax; Structured Outputs aim to guarantee schema adherence.

## 3. Does schema adherence guarantee correctness?

No. Values can still be semantically wrong.

## 4. Structured output vs tool calling?

Structured output returns typed data; tool calling requests an external action.

## 5. Why use strict mode?

To reduce missing/extra fields and type/enum deviations where the provider supports strict adherence.

## 6. Why still run business validation?

Schema validation cannot enforce every business rule or authorization condition.

## 7. Provider-native vs tool-based?

Provider-native is direct schema enforcement; tool-based uses a synthetic tool/function contract as fallback.

## 8. What should happen on refusal?

Handle it as an explicit outcome rather than trying to parse it as the expected schema.

## 9. What about incomplete output?

Detect completion status, then retry/recover rather than trusting a partial object.

## 10. How do you version schemas?

Treat them like APIs: additive changes first, deprecation windows, compatibility adapters.

## 11. Why keep schemas small?

Simpler schemas improve reliability, latency, and maintainability.

## 12. How do you secure structured output?

Treat it as untrusted input and apply business validation, auth checks, escaping, and allowlists.

## 13. How does LangChain handle it?

It can use provider-native or tool-based strategies through the agent response format.

## 14. How does Microsoft Agent Framework handle it?

Typed result APIs or response-format schemas when the underlying agent/provider supports structured outputs.

## 15. One-line principle?

> Schema controls shape; application logic controls meaning.
