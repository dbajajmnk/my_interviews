# Shadow / Dark Launch

## Problem

Large independently delivered frontends need a clear pattern for **execute/load new path without exposing it as the active ui.**

## Intent

Execute/load new path without exposing it as the active UI.

## Visual / Memory Trigger

```text
production data → hidden new path
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for validation.

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
production data → hidden new path
```

## Interview Trap

Privacy and side effects must be controlled.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Shadow / Dark Launch:** Execute/load new path without exposing it as the active UI.
