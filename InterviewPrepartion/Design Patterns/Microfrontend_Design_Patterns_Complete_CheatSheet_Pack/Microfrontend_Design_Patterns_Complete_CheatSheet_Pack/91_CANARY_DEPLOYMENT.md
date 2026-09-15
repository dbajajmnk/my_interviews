# Canary Deployment

## Problem

Large independently delivered frontends need a clear pattern for **route small cohort to new mfe version.**

## Intent

Route small cohort to new MFE version.

## Visual / Memory Trigger

```text
1% → 5% → 25% → 100%
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for risk-controlled production rollout.

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
1% → 5% → 25% → 100%
```

## Interview Trap

Gate on UX and business metrics.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Canary Deployment:** Route small cohort to new MFE version.
