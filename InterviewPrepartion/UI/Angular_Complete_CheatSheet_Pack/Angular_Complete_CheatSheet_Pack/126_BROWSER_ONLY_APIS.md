# Browser-Only APIs

## What / Why

Guard window/document/localStorage usage.

## Mental Model

```text
after render/platform check
```

## Example / Recall

```ts
// Minimal recall example for: Browser-Only APIs
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use browser-specific logic only where appropriate.

## Common Mistake / Interview Trap

Direct browser globals can break SSR.

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

> **Browser-Only APIs:** Guard window/document/localStorage usage.
