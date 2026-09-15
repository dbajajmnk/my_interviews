# switchMap Race Fix

## What / Why

Use switchMap when new request should cancel previous.

## Mental Model

```text
typeahead latest wins
```

## Example / Recall

```ts
// Minimal recall example for: switchMap Race Fix
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for searches.

## Common Mistake / Interview Trap

Do not use for writes that must all complete.

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

> **switchMap Race Fix:** Use switchMap when new request should cancel previous.
