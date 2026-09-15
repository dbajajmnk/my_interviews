# Web Component Wrapper

## Problem

Large independently delivered frontends need a clear pattern for **expose a framework-specific capability through a browser-standard custom element.**

## Intent

Expose a framework-specific capability through a browser-standard custom element.

## Visual / Memory Trigger

```text
<customer-summary customer-id='123'>
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for cross-framework reusable widgets.

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
<customer-summary customer-id='123'>
```

## Interview Trap

Keep public DOM API small and stable.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Web Component Wrapper:** Expose a framework-specific capability through a browser-standard custom element.
