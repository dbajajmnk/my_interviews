# Function Tools

## What

Function tools expose application functions/capabilities to an agent.

## Flow

```text
Model selects tool
      ↓
Tool schema / arguments
      ↓
Function invocation
      ↓
Tool result
      ↓
Model continues
```

## Production Controls

- clear descriptions;
- typed schemas;
- validation;
- least privilege;
- approval for risky tools;
- timeouts;
- idempotency;
- auditing.

## Harness Note

Harness Agents can configure automatic function invocation and tool approval behavior for you.
