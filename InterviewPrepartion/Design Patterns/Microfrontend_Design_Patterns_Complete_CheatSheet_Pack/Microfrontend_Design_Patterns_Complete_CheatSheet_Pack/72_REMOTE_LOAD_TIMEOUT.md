# Remote Load Timeout

## Problem

Large independently delivered frontends need a clear pattern for **bound remote bootstrap/mount wait time.**

## Intent

Bound remote bootstrap/mount wait time.

## Visual / Memory Trigger

```text
load remote ≤ X ms else fallback
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to protect UX.

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
load remote ≤ X ms else fallback
```

## Interview Trap

Timeout value must fit page performance budget.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Remote Load Timeout:** Bound remote bootstrap/mount wait time.
