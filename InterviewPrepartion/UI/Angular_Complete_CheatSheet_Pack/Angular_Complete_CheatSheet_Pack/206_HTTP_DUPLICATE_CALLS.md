# HTTP Duplicate Calls

## What / Why

Cold Observable subscribed multiple times or repeated effect/computation.

## Mental Model

```text
subscription count
```

## Example / Recall

```ts
// Minimal recall example for: HTTP Duplicate Calls
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Share/cache deliberately or change ownership.

## Common Mistake / Interview Trap

Do not assume HttpClient request executes only once globally.

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

> **HTTP Duplicate Calls:** Cold Observable subscribed multiple times or repeated effect/computation.
