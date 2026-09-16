# What Are Structured Outputs?

## Definition

Structured Outputs are model responses constrained to match a developer-defined schema or application type.

## Why

Enterprise applications need predictable machine-readable results for:
- APIs;
- workflow routing;
- extraction;
- UI rendering;
- database writes;
- automation.

## Example

```json
{
  "category": "billing",
  "priority": "high",
  "customer_id": "C123"
}
```

## Value

They reduce brittle:
- regex parsing;
- ad-hoc string parsing;
- repeated repair prompts;
- downstream type uncertainty.
