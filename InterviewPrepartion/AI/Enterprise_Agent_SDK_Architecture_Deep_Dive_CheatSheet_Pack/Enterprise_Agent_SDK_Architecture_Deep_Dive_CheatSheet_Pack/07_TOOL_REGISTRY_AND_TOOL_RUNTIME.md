# Tool Registry and Tool Runtime

## Tool Registry

The registry tells the agent which approved tools exist.

Each tool should define:
- name;
- description;
- input schema;
- output schema;
- permission metadata;
- timeout;
- retry policy.

## Runtime Flow

```text
Model proposes tool call
        ↓
Tool Registry lookup
        ↓
Schema validation
        ↓
Authorization / policy
        ↓
Optional approval
        ↓
Execute
        ↓
Normalize result
        ↓
Emit telemetry
```

## Key Rule

The model should never invoke arbitrary methods directly.

## Tool Categories

- read-only query tools;
- write/action tools;
- long-running tools;
- privileged tools;
- human approval tools.

## Production Controls

Use:
- allowlists;
- scoped credentials;
- input validation;
- output size limits;
- idempotency keys;
- auditing.
