# Theme Contract

## Problem

Large independently delivered frontends need a clear pattern for **expose stable theme variables/context from platform.**

## Intent

Expose stable theme variables/context from platform.

## Visual / Memory Trigger

```text
Shell theme → MFE tokens
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for coherent theming.

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
Shell theme → MFE tokens
```

## Interview Trap

Avoid each MFE redefining global semantics.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Theme Contract:** Expose stable theme variables/context from platform.
