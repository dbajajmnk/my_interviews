# Contract Testing

## Problem

Large independently delivered frontends need a clear pattern for **verify shell/mfe/events/routes/public modules against stable contracts.**

## Intent

Verify shell/MFE/events/routes/public modules against stable contracts.

## Visual / Memory Trigger

```text
consumer contract → provider verification
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use before runtime deployment.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
consumer contract → provider verification
```

## Interview Trap

E2E alone is too slow/late.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Contract Testing:** Verify shell/MFE/events/routes/public modules against stable contracts.
