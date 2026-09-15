# Layout Slot Composition

## Problem

Large independently delivered frontends need a clear pattern for **shell exposes stable slots that mfes fill.**

## Intent

Shell exposes stable slots that MFEs fill.

## Visual / Memory Trigger

```text
Header slot / main slot / side slot
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when page-level composition needs explicit placement.

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
Header slot / main slot / side slot
```

## Interview Trap

Too many tiny slots create layout coupling.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Layout Slot Composition:** Shell exposes stable slots that MFEs fill.
