# Configuration

## What / Why

Separate build/runtime config and never treat client config as secret.

## Mental Model

```text
config → DI token/service
```

## Example / Recall

```ts
// Minimal recall example for: Configuration
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use typed configuration.

## Common Mistake / Interview Trap

Environment-specific rebuilds can complicate promotion.

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

> **Configuration:** Separate build/runtime config and never treat client config as secret.
