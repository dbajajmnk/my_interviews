# Facade Pattern

## What / Why

Expose feature-friendly API over store/services/router.

## Mental Model

```text
Component → Facade → services/store
```

## Example / Recall

```ts
// Minimal recall example for: Facade Pattern
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to isolate state library/infrastructure.

## Common Mistake / Interview Trap

Avoid facades that only rename every method one-for-one.

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

> **Facade Pattern:** Expose feature-friendly API over store/services/router.
