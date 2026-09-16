# Free Text vs JSON Mode vs Structured Output

## Comparison

| Mode | Guarantees |
|---|---|
| Free text | No machine-readable contract |
| JSON mode | Valid JSON syntax |
| Structured output | JSON/schema shape adherence |

## Important Distinction

JSON mode can produce:
```json
{"foo":"bar"}
```
even if your application expected:
```json
{"category":"billing","priority":"high"}
```

Structured output aims to enforce the declared schema.

## Interview Point

> JSON mode is syntactic reliability. Structured Outputs provide contract-level structural reliability.
