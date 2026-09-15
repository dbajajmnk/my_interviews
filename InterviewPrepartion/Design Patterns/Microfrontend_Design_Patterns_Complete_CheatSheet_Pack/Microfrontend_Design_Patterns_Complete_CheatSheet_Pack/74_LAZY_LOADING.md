# Lazy Loading

## Problem

Large independently delivered frontends need a clear pattern for **load mfe only when route/widget is needed.**

## Intent

Load MFE only when route/widget is needed.

## Visual / Memory Trigger

```text
shell first → route MFE on demand
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to reduce initial JS.

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
shell first → route MFE on demand
```

## Interview Trap

Too much lazy loading creates waterfalls.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Lazy Loading:** Load MFE only when route/widget is needed.
