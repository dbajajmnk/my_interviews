# AsyncPipe Notification

## What / Why

AsyncPipe subscribes and marks view when values arrive.

## Mental Model

```text
observable | async
```

## Example / Recall

```ts
// Minimal recall example for: AsyncPipe Notification
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for Observable template consumption.

## Common Mistake / Interview Trap

Prefer AsyncPipe over manual subscribe for template-bound streams.

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

> **AsyncPipe Notification:** AsyncPipe subscribes and marks view when values arrive.
