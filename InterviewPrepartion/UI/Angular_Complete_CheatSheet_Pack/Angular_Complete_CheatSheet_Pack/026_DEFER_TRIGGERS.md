# Defer Triggers

## What / Why

Controls when deferred blocks load.

## Mental Model

```text
idle / viewport / interaction / hover / timer / when
```

## Example / Recall

```ts
// Minimal recall example for: Defer Triggers
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use based on UX/performance need.

## Common Mistake / Interview Trap

Do not defer critical above-the-fold content blindly.

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

> **Defer Triggers:** Controls when deferred blocks load.
