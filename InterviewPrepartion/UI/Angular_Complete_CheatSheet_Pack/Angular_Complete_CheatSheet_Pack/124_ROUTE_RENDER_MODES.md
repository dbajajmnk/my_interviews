# Route Render Modes

## What / Why

Choose SSR, prerender or client render per route.

## Mental Model

```text
route → Server/Prerender/Client
```

## Example / Recall

```ts
// Minimal recall example for: Route Render Modes
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use mixed strategies per business need.

## Common Mistake / Interview Trap

One rendering mode does not fit every route.

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

> **Route Render Modes:** Choose SSR, prerender or client render per route.
