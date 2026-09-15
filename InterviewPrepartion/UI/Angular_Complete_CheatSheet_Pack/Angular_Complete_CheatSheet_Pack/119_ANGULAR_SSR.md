# Angular SSR

## What / Why

Renders application HTML on server for initial request.

## Mental Model

```text
request → server render → HTML → hydrate
```

## Example / Recall

```ts
// Minimal recall example for: Angular SSR
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for SEO/first-load requirements.

## Common Mistake / Interview Trap

SSR introduces server/browser execution differences.

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

> **Angular SSR:** Renders application HTML on server for initial request.
