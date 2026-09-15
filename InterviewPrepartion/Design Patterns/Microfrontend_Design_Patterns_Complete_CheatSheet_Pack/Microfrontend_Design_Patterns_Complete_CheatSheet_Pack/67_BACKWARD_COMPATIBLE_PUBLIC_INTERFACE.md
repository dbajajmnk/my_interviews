# Backward-Compatible Public Interface

## Problem

Large independently delivered frontends need a clear pattern for **expose minimal stable lifecycle and data contracts.**

## Intent

Expose minimal stable lifecycle and data contracts.

## Visual / Memory Trigger

```text
mount/unmount/props/events/routes
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for runtime autonomy.

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
mount/unmount/props/events/routes
```

## Interview Trap

Never expose internal store structures as contract.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Backward-Compatible Public Interface:** Expose minimal stable lifecycle and data contracts.
