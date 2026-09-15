# Consumer-Driven UI Contract

## Problem

Large independently delivered frontends need a clear pattern for **let consumers specify required remote interface behavior.**

## Intent

Let consumers specify required remote interface behavior.

## Visual / Memory Trigger

```text
consumer expectation → provider verify
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for shared modules/runtime contracts.

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
consumer expectation → provider verify
```

## Interview Trap

Retire stale contracts.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Consumer-Driven UI Contract:** Let consumers specify required remote interface behavior.
