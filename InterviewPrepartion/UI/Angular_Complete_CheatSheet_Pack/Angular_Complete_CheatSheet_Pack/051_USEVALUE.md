# useValue

## What / Why

Provides fixed value/config.

## Mental Model

```text
{provide:API_URL,useValue:'...'}
```

## Example / Recall

```ts
// Minimal recall example for: useValue
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for immutable runtime/config values.

## Common Mistake / Interview Trap

Do not place secrets in browser DI config.

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

> **useValue:** Provides fixed value/config.
