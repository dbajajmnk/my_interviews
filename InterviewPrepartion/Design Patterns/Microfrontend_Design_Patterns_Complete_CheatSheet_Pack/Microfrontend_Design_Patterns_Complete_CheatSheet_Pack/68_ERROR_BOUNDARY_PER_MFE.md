# Error Boundary per MFE

## Problem

Large independently delivered frontends need a clear pattern for **contain runtime failures within one independently loaded area.**

## Intent

Contain runtime failures within one independently loaded area.

## Visual / Memory Trigger

```text
Catalog fails → fallback; shell/cart remain
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use around every runtime boundary.

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
Catalog fails → fallback; shell/cart remain
```

## Interview Trap

Error boundary must emit useful telemetry.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Error Boundary per MFE:** Contain runtime failures within one independently loaded area.
