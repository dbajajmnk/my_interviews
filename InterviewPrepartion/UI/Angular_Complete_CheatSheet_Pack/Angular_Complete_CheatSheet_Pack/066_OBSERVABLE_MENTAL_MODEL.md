# Observable Mental Model

## What / Why

Observable represents a potentially asynchronous stream of values.

## Mental Model

```text
producer → operators → subscriber
```

## Example / Recall

```ts
// Minimal recall example for: Observable Mental Model
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for events, HTTP, websockets, streams and composition.

## Common Mistake / Interview Trap

Observable is lazy only when implementation is cold; hot/cold matters.

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

> **Observable Mental Model:** Observable represents a potentially asynchronous stream of values.
