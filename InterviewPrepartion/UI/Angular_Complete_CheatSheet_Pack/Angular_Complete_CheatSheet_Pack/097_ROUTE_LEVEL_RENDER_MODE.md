# Route-Level Render Mode

## What / Why

Configure server/client/prerender behavior per route in SSR architecture.

## Mental Model

```text
route render mode
```

## Example / Recall

```ts
// Minimal recall example for: Route-Level Render Mode
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for mixed rendering needs.

## Common Mistake / Interview Trap

Rendering strategy should follow data freshness/SEO requirements.

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

> **Route-Level Render Mode:** Configure server/client/prerender behavior per route in SSR architecture.
