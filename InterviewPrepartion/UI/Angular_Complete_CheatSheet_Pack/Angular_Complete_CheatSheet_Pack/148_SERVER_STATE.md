# Server State

## What / Why

Remote authoritative state needs caching/revalidation, not just global client state.

## Mental Model

```text
HTTP/resource/query cache
```

## Example / Recall

```ts
// Minimal recall example for: Server State
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use APIs/resources/query tools.

## Common Mistake / Interview Trap

Do not mirror everything into NgRx by default.

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

> **Server State:** Remote authoritative state needs caching/revalidation, not just global client state.
