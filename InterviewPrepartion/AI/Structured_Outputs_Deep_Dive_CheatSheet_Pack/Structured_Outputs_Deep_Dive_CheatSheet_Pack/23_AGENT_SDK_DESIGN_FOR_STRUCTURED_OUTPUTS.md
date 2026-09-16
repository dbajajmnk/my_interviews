# Agent SDK Design for Structured Outputs

## Public API

An enterprise Agent SDK should expose:
- response schema/type;
- structured result;
- validation errors;
- refusal/incomplete outcomes.

## Internal Interfaces

Possible abstractions:
```text
ResponseSchema
StructuredOutputStrategy
StructuredResult<T>
OutputValidator
SchemaCapabilities
```

## Capability Discovery

Do not assume all providers support:
- identical JSON Schema subsets;
- strict mode;
- streaming structured output;
- unions/advanced constructs.

## Rule

Normalize the developer experience while preserving provider capability differences.
