# Schema Design Principles

## Principles

1. Keep the schema minimal.
2. Prefer explicit fields over generic blobs.
3. Use enums when values are bounded.
4. Avoid unnecessary nesting.
5. Keep descriptions precise.
6. Use stable names.
7. Make downstream semantics obvious.

## Bad

```json
{"data":"anything"}
```

## Better

```json
{
  "customer_id":"C123",
  "issue_type":"billing",
  "confidence":0.91
}
```

## Interview Rule

> A schema should represent the application contract, not merely make the model output look organized.
