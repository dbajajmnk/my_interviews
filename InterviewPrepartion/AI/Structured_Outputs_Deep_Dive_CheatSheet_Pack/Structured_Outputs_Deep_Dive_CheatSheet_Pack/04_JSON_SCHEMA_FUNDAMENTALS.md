# JSON Schema Fundamentals

## Core Keywords

Common schema concepts:
- `type`
- `properties`
- `required`
- `items`
- `enum`
- numeric/string constraints
- `additionalProperties`

## Example

```json
{
  "type": "object",
  "properties": {
    "category": {
      "type": "string",
      "enum": ["billing", "technical", "account"]
    },
    "priority": {
      "type": "string",
      "enum": ["low", "medium", "high"]
    }
  },
  "required": ["category", "priority"],
  "additionalProperties": false
}
```

## Rule

Keep schemas explicit, narrow, and aligned with real downstream domain types.
