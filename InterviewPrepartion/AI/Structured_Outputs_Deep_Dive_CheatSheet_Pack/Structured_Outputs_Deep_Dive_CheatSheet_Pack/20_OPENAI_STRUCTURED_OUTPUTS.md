# OpenAI Structured Outputs

## Current Model

OpenAI supports Structured Outputs via JSON Schema for model responses and strict schemas for function/tool definitions.

## Key Distinction

OpenAI documentation distinguishes:
- older JSON mode → valid JSON;
- Structured Outputs → schema-conformant JSON.

## Native SDK Support

Python/Node ecosystems can use typed schemas such as Pydantic/Zod to derive schema and deserialize results.

## Provider Behavior

Provider-side constrained decoding improves adherence to the supplied schema, but semantic mistakes inside valid fields are still possible.

## Interview Point

> OpenAI Structured Outputs solve shape reliability; they do not solve factual or business correctness.
