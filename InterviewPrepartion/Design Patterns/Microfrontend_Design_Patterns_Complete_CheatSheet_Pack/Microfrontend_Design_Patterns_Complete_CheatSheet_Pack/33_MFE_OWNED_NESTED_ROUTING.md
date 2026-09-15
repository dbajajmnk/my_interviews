# MFE-Owned Nested Routing

## Problem

Large independently delivered frontends need a clear pattern for **an mfe manages routes beneath its assigned prefix.**

## Intent

An MFE manages routes beneath its assigned prefix.

## Visual / Memory Trigger

```text
/account/profile, /account/security
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to preserve autonomy inside a domain.

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
/account/profile, /account/security
```

## Interview Trap

Shell should not know internal route details.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **MFE-Owned Nested Routing:** An MFE manages routes beneath its assigned prefix.
