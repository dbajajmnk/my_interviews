# Callback / Contract Props

## Problem

Large independently delivered frontends need a clear pattern for **parent passes explicit data/callbacks to child mfe/widget.**

## Intent

Parent passes explicit data/callbacks to child MFE/widget.

## Visual / Memory Trigger

```text
mount({user, onCheckout})
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for parent-child composition.

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
mount({user, onCheckout})
```

## Interview Trap

Keep prop contract small and versionable.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Callback / Contract Props:** Parent passes explicit data/callbacks to child MFE/widget.
