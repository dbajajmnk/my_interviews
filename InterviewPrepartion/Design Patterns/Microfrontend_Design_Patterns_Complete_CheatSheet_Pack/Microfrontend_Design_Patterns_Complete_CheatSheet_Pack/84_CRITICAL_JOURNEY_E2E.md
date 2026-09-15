# Critical Journey E2E

## Problem

Large independently delivered frontends need a clear pattern for **keep a small suite for cross-mfe business journeys.**

## Intent

Keep a small suite for cross-MFE business journeys.

## Visual / Memory Trigger

```text
login / search / checkout / payment
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use as final integration safety net.

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
login / search / checkout / payment
```

## Interview Trap

Avoid making E2E the primary test layer.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Critical Journey E2E:** Keep a small suite for cross-MFE business journeys.
