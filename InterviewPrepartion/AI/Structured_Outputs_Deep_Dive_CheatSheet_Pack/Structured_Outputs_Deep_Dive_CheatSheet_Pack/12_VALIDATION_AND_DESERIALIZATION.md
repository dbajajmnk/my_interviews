# Validation and Deserialization

## Pipeline

```text
Raw structured response
      ↓
JSON parse
      ↓
Schema/type validation
      ↓
Business validation
      ↓
Typed domain object
```

## Business Validation

Examples:
- account must exist;
- date must be in allowed range;
- total must equal line-item sum;
- user must have permission for requested action.

## Rule

Never write directly to a database just because the response deserialized successfully.
