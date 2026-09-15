# Shell-Owned Top-Level Routing

## Problem

Large independently delivered frontends need a clear pattern for **shell owns top-level route prefixes; mfes own internals.**

## Intent

Shell owns top-level route prefixes; MFEs own internals.

## Visual / Memory Trigger

```text
/account/* → Account MFE
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for predictable global navigation.

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
/account/* → Account MFE
```

## Interview Trap

Avoid multiple routers competing for browser history.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Shell-Owned Top-Level Routing:** Shell owns top-level route prefixes; MFEs own internals.
