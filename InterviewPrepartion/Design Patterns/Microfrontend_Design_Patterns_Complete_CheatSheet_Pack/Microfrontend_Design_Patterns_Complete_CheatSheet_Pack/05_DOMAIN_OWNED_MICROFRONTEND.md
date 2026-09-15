# Domain-Owned Microfrontend

## Problem

Large independently delivered frontends need a clear pattern for **align an mfe to a bounded business domain.**

## Intent

Align an MFE to a bounded business domain.

## Visual / Memory Trigger

```text
Checkout team owns Checkout MFE + APIs/BFF + telemetry.
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when frontend and backend domain ownership can align.

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
Checkout team owns Checkout MFE + APIs/BFF + telemetry.
```

## Interview Trap

Domain ownership matters more than framework boundaries.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Domain-Owned Microfrontend:** Align an MFE to a bounded business domain.
