# Vertical Slice / Business Capability

## Problem

Large independently delivered frontends need a clear pattern for **split the frontend by user/business capability rather than technical layer.**

## Intent

Split the frontend by user/business capability rather than technical layer.

## Visual / Memory Trigger

```text
Catalog, Cart, Checkout, Account
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when teams own business outcomes and need independent delivery.

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
Catalog, Cart, Checkout, Account
```

## Interview Trap

Do not create Button-MFE, Validation-MFE, or other nano-frontends.

## Related Patterns

Route-Based Decomposition, Team-Owned Slice, Domain-Owned Microfrontend

## 20-Second Recall

> **Vertical Slice / Business Capability:** Split the frontend by user/business capability rather than technical layer.
