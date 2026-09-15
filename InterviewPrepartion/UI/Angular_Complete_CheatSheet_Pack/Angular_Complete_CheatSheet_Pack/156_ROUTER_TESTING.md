# Router Testing

## What / Why

Test route config/navigation with router testing utilities.

## Mental Model

```text
navigate → assert component/url
```

## Example / Recall

```ts
// Minimal recall example for: Router Testing
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for guards/resolvers/routes.

## Common Mistake / Interview Trap

Avoid brittle tests against router internals.

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

> **Router Testing:** Test route config/navigation with router testing utilities.
