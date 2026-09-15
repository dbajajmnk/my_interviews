# exhaustMap

## What / Why

Ignores new source values while current inner work runs.

## Mental Model

```text
submit$ → exhaustMap(save)
```

## Example / Recall

```ts
// Minimal recall example for: exhaustMap
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to prevent repeated submit/login requests.

## Common Mistake / Interview Trap

Not suitable when latest event must win.

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

> **exhaustMap:** Ignores new source values while current inner work runs.
