# Route Data

## What / Why

Attach static metadata/config to routes.

## Mental Model

```text
data:{title:'Users'}
```

## Example / Recall

```ts
// Minimal recall example for: Route Data
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for breadcrumbs/roles/layout hints.

## Common Mistake / Interview Trap

Avoid dumping business state into route data.

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

> **Route Data:** Attach static metadata/config to routes.
