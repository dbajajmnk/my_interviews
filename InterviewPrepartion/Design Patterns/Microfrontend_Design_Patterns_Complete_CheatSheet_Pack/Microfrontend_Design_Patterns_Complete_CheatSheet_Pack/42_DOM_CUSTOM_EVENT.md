# DOM Custom Event

## Problem

Large independently delivered frontends need a clear pattern for **use browser customevent for lightweight cross-app signals.**

## Intent

Use browser CustomEvent for lightweight cross-app signals.

## Visual / Memory Trigger

```text
window.dispatchEvent(new CustomEvent(...))
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for framework-neutral same-page events.

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
window.dispatchEvent(new CustomEvent(...))
```

## Interview Trap

Namespace and document event contracts.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **DOM Custom Event:** Use browser CustomEvent for lightweight cross-app signals.
