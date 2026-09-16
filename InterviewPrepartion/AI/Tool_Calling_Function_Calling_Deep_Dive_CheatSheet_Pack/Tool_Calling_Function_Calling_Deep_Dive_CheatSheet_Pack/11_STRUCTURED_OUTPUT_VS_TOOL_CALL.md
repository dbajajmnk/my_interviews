# Structured Output vs Tool Call

## Structured Output

Use when the model should return typed data to the application but no external action is required.

## Tool Call

Use when the model requests an external capability or action.

## Example

```text
Classify ticket → structured output
Create ticket → tool call
```

## Rule

Do not create fake tools just to obtain structured data if a structured response schema is sufficient.
