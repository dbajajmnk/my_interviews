# Signal Forms

## What / Why

Stable v22 signal-based form model with schema validation.

## Mental Model

```text
model signal → form() → [formField]
```

## Example / Recall

```ts
// Minimal recall example for: Signal Forms
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for new signal-centric applications.

## Common Mistake / Interview Trap

Existing Reactive Forms remain production-valid; migrate incrementally.

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

> **Signal Forms:** Stable v22 signal-based form model with schema validation.
