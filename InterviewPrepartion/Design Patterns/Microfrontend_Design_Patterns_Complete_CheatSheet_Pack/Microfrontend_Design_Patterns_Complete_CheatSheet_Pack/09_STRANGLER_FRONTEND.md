# Strangler Frontend

## Problem

Large independently delivered frontends need a clear pattern for **incrementally replace a frontend monolith route by route.**

## Intent

Incrementally replace a frontend monolith route by route.

## Visual / Memory Trigger

```text
Shell → new Catalog MFE + legacy app for remaining routes
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for low-risk modernization.

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
Shell → new Catalog MFE + legacy app for remaining routes
```

## Interview Trap

Avoid a big-bang rewrite.

## Related Patterns

UI Anti-Corruption Layer, Route-Based Decomposition

## 20-Second Recall

> **Strangler Frontend:** Incrementally replace a frontend monolith route by route.
