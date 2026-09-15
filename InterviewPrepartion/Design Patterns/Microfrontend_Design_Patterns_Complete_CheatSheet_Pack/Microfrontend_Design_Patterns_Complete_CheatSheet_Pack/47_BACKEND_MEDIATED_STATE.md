# Backend-Mediated State

## Problem

Large independently delivered frontends need a clear pattern for **use backend as the source of truth between mfes.**

## Intent

Use backend as the source of truth between MFEs.

## Visual / Memory Trigger

```text
MFE A writes API; MFE B queries/subscribes
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for business state shared across frontends.

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
MFE A writes API; MFE B queries/subscribes
```

## Interview Trap

Accept backend/network latency and eventual consistency where applicable.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Backend-Mediated State:** Use backend as the source of truth between MFEs.
