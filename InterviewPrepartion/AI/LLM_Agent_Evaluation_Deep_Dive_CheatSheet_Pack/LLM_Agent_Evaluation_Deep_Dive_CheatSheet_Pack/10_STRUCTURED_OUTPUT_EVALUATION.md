# Structured Output Evaluation

## Checks

- schema valid;
- required fields present;
- enum values valid;
- business rules valid;
- semantic correctness.

## Example

Schema-valid:
```json
{"priority":"high","confidence":0.99}
```
may still be semantically wrong.

## Rule

Evaluate both structure and meaning.
