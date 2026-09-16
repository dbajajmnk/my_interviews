# State Pattern in Agent Runtime

## Intent

Change behavior based on current lifecycle state.

## Possible States

```text
CREATED
  ↓
RUNNING
  ↓
WAITING_FOR_TOOL
  ↓
WAITING_FOR_APPROVAL
  ↓
COMPLETED / FAILED / CANCELLED
```

## Why It Helps

State-specific behavior becomes explicit instead of scattered boolean flags.

## Good For

- long-running runs;
- pause/resume;
- approval workflows;
- retries;
- cancellation.
