# Local State First

## Problem

Large independently delivered frontends need a clear pattern for **each mfe owns its own ui and domain state.**

## Intent

Each MFE owns its own UI and domain state.

## Visual / Memory Trigger

```text
Catalog Store / Cart Store / Account Store
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Default pattern for autonomy.

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
Catalog Store / Cart Store / Account Store
```

## Interview Trap

Frequent cross-MFE state exchange signals poor boundaries.

## Related Patterns

URL-Mediated Communication, Shared Context, Backend-Mediated State

## 20-Second Recall

> **Local State First:** Each MFE owns its own UI and domain state.
