# Prefetch / Preload

## Problem

Large independently delivered frontends need a clear pattern for **fetch likely-next mfe before navigation.**

## Intent

Fetch likely-next MFE before navigation.

## Visual / Memory Trigger

```text
hover/route prediction → prefetch
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when behavior is predictable.

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
hover/route prediction → prefetch
```

## Interview Trap

Can waste bandwidth.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Prefetch / Preload:** Fetch likely-next MFE before navigation.
