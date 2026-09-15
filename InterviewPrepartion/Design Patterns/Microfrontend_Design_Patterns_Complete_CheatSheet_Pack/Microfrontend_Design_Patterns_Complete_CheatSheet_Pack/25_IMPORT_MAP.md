# Import Map

## Problem

Large independently delivered frontends need a clear pattern for **map logical module names to deployable urls at runtime.**

## Intent

Map logical module names to deployable URLs at runtime.

## Visual / Memory Trigger

```text
@company/cart → https://cdn/cart/v42.js
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for runtime indirection, local overrides, promotion and rollback.

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
@company/cart → https://cdn/cart/v42.js
```

## Interview Trap

Import Maps resolve modules; they do not orchestrate lifecycle.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Import Map:** Map logical module names to deployable URLs at runtime.
