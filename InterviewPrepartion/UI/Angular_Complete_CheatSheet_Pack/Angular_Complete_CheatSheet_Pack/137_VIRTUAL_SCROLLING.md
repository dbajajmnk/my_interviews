# Virtual Scrolling

## What / Why

Render only visible subset of huge lists.

## Mental Model

```text
CDK virtual scroll
```

## Example / Recall

```ts
// Minimal recall example for: Virtual Scrolling
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for thousands of rows.

## Common Mistake / Interview Trap

Needs fixed/dynamic size strategy.

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

> **Virtual Scrolling:** Render only visible subset of huge lists.
