# Pub/Sub Utility

## Problem

Large independently delivered frontends need a clear pattern for **use a tiny platform utility for publish/subscribe.**

## Intent

Use a tiny platform utility for publish/subscribe.

## Visual / Memory Trigger

```text
publish(topic,payload) / subscribe(topic,handler)
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when event semantics are clear.

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
publish(topic,payload) / subscribe(topic,handler)
```

## Interview Trap

Do not turn it into a hidden global store.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Pub/Sub Utility:** Use a tiny platform utility for publish/subscribe.
