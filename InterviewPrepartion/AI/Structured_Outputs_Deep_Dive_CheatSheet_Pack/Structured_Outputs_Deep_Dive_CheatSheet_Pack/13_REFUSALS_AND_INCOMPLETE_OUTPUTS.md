# Refusals and Incomplete Outputs

## Why

A provider may not return a schema-conformant result when:
- the model refuses;
- generation is interrupted;
- token/output limit is reached;
- provider/runtime fails.

## Application Flow

```text
Response
 ├─ valid structured result → continue
 ├─ refusal → handle safely
 ├─ incomplete → retry/recover
 └─ provider error → failure policy
```

## Rule

Treat refusal/incomplete states as first-class response outcomes, not parser exceptions.
