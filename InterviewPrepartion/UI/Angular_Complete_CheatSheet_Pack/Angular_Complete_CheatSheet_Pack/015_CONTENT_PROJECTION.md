# Content Projection

## What / Why

Projects caller content into component templates.

## Mental Model

```text
<ng-content>
```

## Example / Recall

```ts
// Minimal recall example for: Content Projection
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for reusable shells/layout components.

## Common Mistake / Interview Trap

Projected content remains owned by the caller.

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

> **Content Projection:** Projects caller content into component templates.
