# Deep-Link Preservation

## Problem

Large independently delivered frontends need a clear pattern for **ensure every owned route works on direct load/refresh.**

## Intent

Ensure every owned route works on direct load/refresh.

## Visual / Memory Trigger

```text
Direct navigation to /orders/123 must bootstrap correctly.
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for production-ready routing.

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
Direct navigation to /orders/123 must bootstrap correctly.
```

## Interview Trap

Do not depend on transient in-memory state to open a route.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Deep-Link Preservation:** Ensure every owned route works on direct load/refresh.
