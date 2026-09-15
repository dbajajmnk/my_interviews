# OnPush Default Performance

## What / Why

Angular 22 already defaults to OnPush.

## Mental Model

```text
signals/events notify affected views
```

## Example / Recall

```ts
// Minimal recall example for: OnPush Default Performance
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Write signal-friendly code instead of adding OnPush boilerplate.

## Common Mistake / Interview Trap

Legacy advice that every component must explicitly opt into OnPush is outdated.

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

> **OnPush Default Performance:** Angular 22 already defaults to OnPush.
