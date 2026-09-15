# Shared Singleton Dependency

## Problem

Large independently delivered frontends need a clear pattern for **reuse one compatible runtime instance for heavy/core libraries.**

## Intent

Reuse one compatible runtime instance for heavy/core libraries.

## Visual / Memory Trigger

```text
Host + Remotes share React/Angular/router runtime
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when duplicate runtimes are expensive or invalid.

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
Host + Remotes share React/Angular/router runtime
```

## Interview Trap

Sharing increases version coupling.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Shared Singleton Dependency:** Reuse one compatible runtime instance for heavy/core libraries.
