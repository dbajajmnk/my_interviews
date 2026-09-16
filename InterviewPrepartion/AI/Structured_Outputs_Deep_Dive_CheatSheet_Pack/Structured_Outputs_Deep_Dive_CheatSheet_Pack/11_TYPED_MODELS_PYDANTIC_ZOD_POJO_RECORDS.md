# Typed Models: Pydantic, Zod, POJOs and Records

## Why Typed Models

Language-native models:
- generate schemas;
- deserialize results;
- improve IDE support;
- reduce manual parsing.

## Examples

- Python → Pydantic/dataclass
- TypeScript → Zod/type schema
- Java → POJO/record + JSON Schema mapping
- C# → class/record + serializer/schema

## Rule

Keep the language type and schema derived from one source of truth where possible.
