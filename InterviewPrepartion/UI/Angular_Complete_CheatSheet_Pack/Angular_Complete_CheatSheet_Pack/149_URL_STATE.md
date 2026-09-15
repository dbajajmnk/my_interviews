# URL State

## What / Why

Route/query params are often correct source for filters/page/entity id.

## Mental Model

```text
URL → component signals
```

## Example / Recall

```ts
// Minimal recall example for: URL State
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for shareable navigational state.

## Common Mistake / Interview Trap

Keep domain secrets out of URL.

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

> **URL State:** Route/query params are often correct source for filters/page/entity id.
