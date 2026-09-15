# Contract Testing

## Goal

Verify service interfaces without requiring full end-to-end environment.

## Example

```text
Consumer expectation
        ↓
Contract
        ↓
Provider verification
```

## Benefits

- faster feedback
- safer independent deployment
- less E2E coupling

## Trap

Contract tests do not verify all business workflows.
