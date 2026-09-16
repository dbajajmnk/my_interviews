# Strict Schema Adherence

## What

Strict mode means generation is constrained to conform to the supplied schema where the provider supports that capability.

## Why

Without strict schema adherence, applications may still receive:
- missing fields;
- unexpected fields;
- wrong types;
- invalid enum values.

## Still Not Enough

This can be schema-valid:
```json
{"age": 999, "country_code": "ZZ"}
```

But it may still be wrong for your domain.

## Rule

**Schema validation first; business validation second.**
