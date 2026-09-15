# retry

## What / Why

Re-subscribes after errors.

## Mental Model

```text
retry({count:3,delay:...})
```

## Example / Recall

```ts
// Minimal recall example for: retry
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for transient safe/idempotent work.

## Common Mistake / Interview Trap

Never blindly retry permanent or unsafe mutations.

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

> **retry:** Re-subscribes after errors.
