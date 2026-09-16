# Structured Outputs — 30-Second Recall

## Recall

```text
Structured Output =
Schema
+ constrained generation
+ parse
+ validate
+ typed result
```

## 30-Second Interview Answer

> Structured Outputs let an LLM return data that conforms to an explicit schema instead of arbitrary prose. I define a JSON Schema or language type, let the provider/framework constrain generation where supported, deserialize into a typed object, validate business rules, and then pass that object to downstream APIs or workflows. The schema guarantees structure, not business correctness.

## Do Not Forget

- Valid JSON is not the same as schema-conformant JSON.
- Schema conformance is not the same as semantic correctness.
- Structured output is for typed results; tool calling is for actions.
- Business validation must still run after parsing.
- Schema changes are API-contract changes.
