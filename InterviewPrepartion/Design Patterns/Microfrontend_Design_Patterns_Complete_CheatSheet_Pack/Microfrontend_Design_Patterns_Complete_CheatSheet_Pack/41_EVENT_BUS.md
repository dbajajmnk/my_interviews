# Event Bus

## Problem

Large independently delivered frontends need a clear pattern for **publish messages without direct references between mfes.**

## Intent

Publish messages without direct references between MFEs.

## Visual / Memory Trigger

```text
MFE A → Event Bus → MFE B
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use sparingly for loosely coupled signals.

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
MFE A → Event Bus → MFE B
```

## Interview Trap

Can become invisible coupling/event soup.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Event Bus:** Publish messages without direct references between MFEs.
