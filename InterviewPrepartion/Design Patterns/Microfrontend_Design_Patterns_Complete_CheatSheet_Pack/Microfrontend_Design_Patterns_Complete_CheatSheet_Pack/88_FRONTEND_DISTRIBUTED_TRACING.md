# Frontend Distributed Tracing

## Problem

Large independently delivered frontends need a clear pattern for **trace navigation, remote load, render and backend calls.**

## Intent

Trace navigation, remote load, render and backend calls.

## Visual / Memory Trigger

```text
browser → MFE → API → backend spans
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for end-to-end latency diagnosis.

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
browser → MFE → API → backend spans
```

## Interview Trap

Avoid uncontrolled telemetry cardinality.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Frontend Distributed Tracing:** Trace navigation, remote load, render and backend calls.
