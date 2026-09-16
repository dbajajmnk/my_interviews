# Tool Execution Context

## Purpose

Tools often need runtime information that should not be model-generated.

## Examples

- authenticated user ID;
- tenant;
- trace ID;
- database client;
- cancellation token;
- secrets/credentials;
- deadline.

## Pattern

```text
Model arguments
      +
Execution Context
      ↓
Tool Handler
```

## Rule

Do not ask the model to invent security-sensitive runtime fields that the application already knows.
