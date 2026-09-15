# OnPush Default

## What / Why

Angular v22 defaults components to OnPush.

## Mental Model

```text
change → mark relevant subtree
```

## Example / Recall

```ts
// Minimal recall example for: OnPush Default
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use signals, inputs, events and AsyncPipe to notify Angular.

## Common Mistake / Interview Trap

Do not explicitly add OnPush everywhere just because older best practice guides say so.

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

> **OnPush Default:** Angular v22 defaults components to OnPush.
