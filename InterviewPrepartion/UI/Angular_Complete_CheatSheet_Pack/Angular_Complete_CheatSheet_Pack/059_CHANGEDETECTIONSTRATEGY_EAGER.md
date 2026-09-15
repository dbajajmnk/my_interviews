# ChangeDetectionStrategy Eager

## What / Why

Eager is the opt-in always-check strategy; old Default alias is deprecated.

## Mental Model

```text
OnPush default ↔ Eager opt-in
```

## Example / Recall

```ts
// Minimal recall example for: ChangeDetectionStrategy Eager
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use only where eager checking is genuinely required.

## Common Mistake / Interview Trap

`ChangeDetectionStrategy.Default` is now a deprecated alias for Eager.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **ChangeDetectionStrategy Eager:** Eager is the opt-in always-check strategy; old Default alias is deprecated.
