# Shared Libraries

## Good Shared Libraries

```text
design system
auth client
telemetry
API primitives
common utilities
```

## Dangerous Shared Libraries

```text
shared domain state
huge "common" package
cross-team business rules
central global store
```

## Rule

Shared code can create stronger coupling than duplicated small code.

Share deliberately.
