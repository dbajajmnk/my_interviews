# NgRx

## What / Why

Redux-style Angular ecosystem for explicit event/reducer/effects/store architecture.

## Mental Model

```text
Actions → Reducers → Store → Selectors / Effects
```

## Example / Recall

```ts
// Minimal recall example for: NgRx
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for large event-driven client state needing strict conventions.

## Common Mistake / Interview Trap

Do not add NgRx to solve simple local state.

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

> **NgRx:** Redux-style Angular ecosystem for explicit event/reducer/effects/store architecture.
