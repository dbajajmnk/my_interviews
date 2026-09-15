# UI Anti-Corruption Layer

## Problem

Large independently delivered frontends need a clear pattern for **translate legacy frontend state/contracts into a clean interface for new mfes.**

## Intent

Translate legacy frontend state/contracts into a clean interface for new MFEs.

## Visual / Memory Trigger

```text
New MFE → adapter/ACL → legacy APIs/store
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use during migration from legacy global-state or navigation models.

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
New MFE → adapter/ACL → legacy APIs/store
```

## Interview Trap

Keep the ACL as translation, not a new business-logic hub.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **UI Anti-Corruption Layer:** Translate legacy frontend state/contracts into a clean interface for new MFEs.
