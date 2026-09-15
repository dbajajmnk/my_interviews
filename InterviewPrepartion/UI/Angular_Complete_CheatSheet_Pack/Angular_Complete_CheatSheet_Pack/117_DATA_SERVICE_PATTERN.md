# Data Service Pattern

## What / Why

Feature service centralizes API protocol mapping.

## Mental Model

```text
UserApi service
```

## Example / Recall

```ts
// Minimal recall example for: Data Service Pattern
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to keep components declarative.

## Common Mistake / Interview Trap

Do not turn services into giant global business god-objects.

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

> **Data Service Pattern:** Feature service centralizes API protocol mapping.
