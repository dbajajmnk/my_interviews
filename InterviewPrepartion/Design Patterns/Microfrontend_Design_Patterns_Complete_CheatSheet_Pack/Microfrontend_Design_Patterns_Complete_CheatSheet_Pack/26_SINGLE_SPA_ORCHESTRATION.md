# single-spa Orchestration

## Problem

Large independently delivered frontends need a clear pattern for **mount/unmount applications according to route/activity rules.**

## Intent

Mount/unmount applications according to route/activity rules.

## Visual / Memory Trigger

```text
Root Config → React MFE / Angular MFE / Vue MFE
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when application lifecycle/orchestration is the key problem.

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
Root Config → React MFE / Angular MFE / Vue MFE
```

## Interview Trap

State, auth and CSS governance are still separate concerns.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **single-spa Orchestration:** Mount/unmount applications according to route/activity rules.
