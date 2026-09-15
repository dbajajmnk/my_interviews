# Shared-Nothing Business Logic

## Problem

Large independently delivered frontends need a clear pattern for **keep business/domain logic inside the owning mfe/domain.**

## Intent

Keep business/domain logic inside the owning MFE/domain.

## Visual / Memory Trigger

```text
share platform/UI primitives, not business models
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to prevent hidden coupling.

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
share platform/UI primitives, not business models
```

## Interview Trap

DRY is less important than autonomy across domain boundaries.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Shared-Nothing Business Logic:** Keep business/domain logic inside the owning MFE/domain.
