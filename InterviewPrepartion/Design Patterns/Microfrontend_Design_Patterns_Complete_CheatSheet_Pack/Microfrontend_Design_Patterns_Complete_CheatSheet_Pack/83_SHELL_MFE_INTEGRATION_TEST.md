# Shell-MFE Integration Test

## Problem

Large independently delivered frontends need a clear pattern for **test one changed mfe against the shell and stable dependencies.**

## Intent

Test one changed MFE against the shell and stable dependencies.

## Visual / Memory Trigger

```text
shell + changed MFE + deployed others
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for focused integration confidence.

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
shell + changed MFE + deployed others
```

## Interview Trap

Do not require every repository locally.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Shell-MFE Integration Test:** Test one changed MFE against the shell and stable dependencies.
