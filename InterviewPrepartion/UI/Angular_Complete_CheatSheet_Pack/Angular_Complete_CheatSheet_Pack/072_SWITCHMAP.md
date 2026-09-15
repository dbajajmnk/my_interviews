# switchMap

## What / Why

Switches to latest inner Observable and cancels prior subscription.

## Mental Model

```text
query$ → switchMap(search)
```

## Example / Recall

```ts
// Minimal recall example for: switchMap
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Great for latest-only searches/requests.

## Common Mistake / Interview Trap

Wrong for operations that must all complete.

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

> **switchMap:** Switches to latest inner Observable and cancels prior subscription.
