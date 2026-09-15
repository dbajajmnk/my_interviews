# Module Federation

## Problem

Large independently delivered frontends need a clear pattern for **load modules exposed by separately built applications at runtime.**

## Intent

Load modules exposed by separately built applications at runtime.

## Visual / Memory Trigger

```text
Host → Remote Container → Exposed Module
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for runtime code sharing and independent deployments.

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
Host → Remote Container → Exposed Module
```

## Interview Trap

It is an implementation mechanism, not the architecture itself.

## Related Patterns

Host / Remote, Shared Singleton Dependency, Runtime Manifest / Remote Registry

## 20-Second Recall

> **Module Federation:** Load modules exposed by separately built applications at runtime.
