# CSP Allowlist

## Problem

Large independently delivered frontends need a clear pattern for **restrict dynamic scripts/remotes to trusted origins.**

## Intent

Restrict dynamic scripts/remotes to trusted origins.

## Visual / Memory Trigger

```text
script-src trusted-cdn.example.com
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for runtime-loaded MFEs.

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
script-src trusted-cdn.example.com
```

## Interview Trap

Overly broad CSP defeats protection.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **CSP Allowlist:** Restrict dynamic scripts/remotes to trusted origins.
