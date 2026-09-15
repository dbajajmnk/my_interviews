# ng build

## What / Why

Creates production build.

## Mental Model

```text
ng build
```

## Example / Recall

```ts
// Minimal recall example for: ng build
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use budget/config checks.

## Common Mistake / Interview Trap

Know output depends on application builder.

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

> **ng build:** Creates production build.
