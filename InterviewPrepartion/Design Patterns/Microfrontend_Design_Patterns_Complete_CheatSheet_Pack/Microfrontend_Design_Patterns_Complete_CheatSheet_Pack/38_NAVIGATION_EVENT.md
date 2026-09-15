# Navigation Event

## Problem

Large independently delivered frontends need a clear pattern for **emit navigation intent through a stable callback/event but make url the final source of truth.**

## Intent

Emit navigation intent through a stable callback/event but make URL the final source of truth.

## Visual / Memory Trigger

```text
MFE emits navigate('/cart')
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when integrated code cannot directly access router.

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
MFE emits navigate('/cart')
```

## Interview Trap

Avoid multiple competing navigation authorities.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Navigation Event:** Emit navigation intent through a stable callback/event but make URL the final source of truth.
