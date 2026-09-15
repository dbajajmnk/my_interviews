# Graceful Degradation

## Problem

Large independently delivered frontends need a clear pattern for **preserve core journey when optional features fail.**

## Intent

Preserve core journey when optional features fail.

## Visual / Memory Trigger

```text
Checkout works; recommendations unavailable
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for optional MFEs/widgets.

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
Checkout works; recommendations unavailable
```

## Interview Trap

Never degrade silently when correctness is affected.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Graceful Degradation:** Preserve core journey when optional features fail.
