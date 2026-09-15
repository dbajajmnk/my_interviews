# URL-as-State

## Problem

Large independently delivered frontends need a clear pattern for **put shareable navigation/filter state into url.**

## Intent

Put shareable navigation/filter state into URL.

## Visual / Memory Trigger

```text
/search?q=laptop&page=2
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for declarative cross-MFE state.

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
/search?q=laptop&page=2
```

## Interview Trap

Do not put sensitive or huge state into URLs.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **URL-as-State:** Put shareable navigation/filter state into URL.
