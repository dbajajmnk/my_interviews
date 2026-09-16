# Microsoft Agent Framework Structured Outputs

## Current Support

Microsoft Agent Framework supports structured outputs when the underlying agent/provider supports them.

## C#

Current Microsoft guidance includes:
- generic typed `RunAsync<T>` style access;
- `ResponseFormat` for schema-based outputs;
- streaming with final aggregation/deserialization.

## Python

Python agents can use a Pydantic model or JSON-schema mapping through response-format options.

## Go

Go supports structured output with typed structs and framework options that generate schema and unmarshal results.

## Fallback

For agents without native support, an additional LLM transformation step can be used, but Microsoft explicitly notes reliability may be lower.
