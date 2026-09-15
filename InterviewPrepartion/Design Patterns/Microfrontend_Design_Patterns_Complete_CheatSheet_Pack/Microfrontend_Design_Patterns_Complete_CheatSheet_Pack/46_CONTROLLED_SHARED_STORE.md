# Controlled Shared Store

## Problem

Large independently delivered frontends need a clear pattern for **use one store only for a truly global bounded domain.**

## Intent

Use one store only for a truly global bounded domain.

## Visual / Memory Trigger

```text
Small global auth/theme store
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use rarely.

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
Small global auth/theme store
```

## Interview Trap

One giant Redux store defeats autonomy.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Controlled Shared Store:** Use one store only for a truly global bounded domain.
