# Independent Pipeline

## Problem

Large independently delivered frontends need a clear pattern for **each mfe builds/tests/publishes independently.**

## Intent

Each MFE builds/tests/publishes independently.

## Visual / Memory Trigger

```text
commit → tests → immutable asset → deploy
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for true autonomous delivery.

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
commit → tests → immutable asset → deploy
```

## Interview Trap

One mega-pipeline negates independence.

## Related Patterns

Contract Testing, Canary Deployment, Rollback by Manifest

## 20-Second Recall

> **Independent Pipeline:** Each MFE builds/tests/publishes independently.
