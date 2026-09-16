# Argument Generation and Validation

## Model Role

The model generates structured arguments based on the schema.

## Application Role

Validate:
- types;
- required fields;
- enum/range constraints;
- business invariants;
- authorization context.

## Example

```text
Model:
{"amount": -500}

Schema allows number
Business rule does not.

Application:
reject before execution
```

## Rule

Schema validation is necessary but not sufficient. Business validation remains deterministic application logic.
