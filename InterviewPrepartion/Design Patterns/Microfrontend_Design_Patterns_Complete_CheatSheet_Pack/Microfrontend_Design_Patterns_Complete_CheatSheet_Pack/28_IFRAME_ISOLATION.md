# Iframe Isolation

## Problem

Large independently delivered frontends need a clear pattern for **use a separate document/origin for strong runtime and security isolation.**

## Intent

Use a separate document/origin for strong runtime and security isolation.

## Visual / Memory Trigger

```text
Host page ↔ iframe via postMessage
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for third-party, legacy, or high-security embedded apps.

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
Host page ↔ iframe via postMessage
```

## Interview Trap

Costs include routing, layout, accessibility and communication.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Iframe Isolation:** Use a separate document/origin for strong runtime and security isolation.
