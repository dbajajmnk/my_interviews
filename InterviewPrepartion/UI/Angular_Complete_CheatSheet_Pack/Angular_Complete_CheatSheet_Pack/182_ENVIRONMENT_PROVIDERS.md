# Environment Providers

## What / Why

Functional provider APIs configure router/http/etc.

## Mental Model

```text
provideRouter/provideHttpClient
```

## Example / Recall

```ts
// Minimal recall example for: Environment Providers
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use in app config.

## Common Mistake / Interview Trap

Prefer tree-shakable functional setup.

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

> **Environment Providers:** Functional provider APIs configure router/http/etc.
