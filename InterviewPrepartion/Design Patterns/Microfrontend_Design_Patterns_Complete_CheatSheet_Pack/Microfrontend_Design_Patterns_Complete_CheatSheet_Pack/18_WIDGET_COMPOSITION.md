# Widget Composition

## Problem

Large independently delivered frontends need a clear pattern for **compose multiple independently owned widgets on one page.**

## Intent

Compose multiple independently owned widgets on one page.

## Visual / Memory Trigger

```text
Dashboard → Sales / Alerts / Recommendations widgets
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use only when widgets genuinely require independent ownership/deployment.

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
Dashboard → Sales / Alerts / Recommendations widgets
```

## Interview Trap

Increases state/layout/integration complexity.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Widget Composition:** Compose multiple independently owned widgets on one page.
