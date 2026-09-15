# useExisting

## What / Why

Aliases one token to an existing provider.

## Mental Model

```text
{provide:Logger,useExisting:AppLogger}
```

## Example / Recall

```ts
// Minimal recall example for: useExisting
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to avoid duplicate instances.

## Common Mistake / Interview Trap

Different from useClass, which can instantiate another object.

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

> **useExisting:** Aliases one token to an existing provider.
