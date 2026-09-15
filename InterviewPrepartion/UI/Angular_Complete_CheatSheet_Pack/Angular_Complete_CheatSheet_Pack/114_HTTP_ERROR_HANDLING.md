# HTTP Error Handling

## What / Why

Map network/protocol/domain failures deliberately.

## Mental Model

```text
catchError/map response
```

## Example / Recall

```ts
// Minimal recall example for: HTTP Error Handling
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use consistent API error model.

## Common Mistake / Interview Trap

A 200 response can still contain domain failure depending on API design.

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

> **HTTP Error Handling:** Map network/protocol/domain failures deliberately.
