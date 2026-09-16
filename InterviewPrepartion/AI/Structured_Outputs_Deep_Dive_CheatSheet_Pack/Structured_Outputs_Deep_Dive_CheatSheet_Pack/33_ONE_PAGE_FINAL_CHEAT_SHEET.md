# Structured Outputs — One-Page Final Cheat Sheet

## Formula

```text
Structured Output =
Schema
+ constrained generation
+ parsing
+ validation
+ typed result
```

## Key Distinctions

- Free text = no contract
- JSON mode = valid JSON
- Structured Output = schema-conformant JSON
- Tool call = action request
- Structured response = typed result

## Production Rules

1. Keep schemas small and explicit.
2. Use enums/bounds for routing-critical fields.
3. Parse into typed models.
4. Run business validation after schema validation.
5. Handle refusal/incomplete states explicitly.
6. Treat output as untrusted input.
7. Version schemas like APIs.
8. Prefer provider-native enforcement when available.
9. Use tool-based fallback when needed.
10. Never trigger irreversible actions from partial streamed output.

## 30-Second Answer

> Structured Outputs are the contract layer between the model and the application. I define a schema or language type, use provider-native schema enforcement where possible, deserialize into a typed object, handle refusal or incomplete states explicitly, run deterministic business validation, and then pass the validated result into workflows or APIs. Schema adherence solves structure, not semantic correctness.
