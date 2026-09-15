# Form Performance

## What / Why

Large forms need scoped state, sensible validation timing and component boundaries.

## Mental Model

```text
form tree/signals
```

## Example / Recall

```ts
// Minimal recall example for: Form Performance
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use Signal Forms/Reactive Forms appropriately.

## Common Mistake / Interview Trap

One giant component + every-keystroke expensive validation performs poorly.

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

> **Form Performance:** Large forms need scoped state, sensible validation timing and component boundaries.
