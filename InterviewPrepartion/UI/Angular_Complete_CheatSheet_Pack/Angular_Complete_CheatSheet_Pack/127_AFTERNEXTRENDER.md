# afterNextRender

## What / Why

Runs callback after next rendering pass in browser.

## Mental Model

```text
afterNextRender(()=>...)
```

## Example / Recall

```ts
// Minimal recall example for: afterNextRender
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for DOM integration after render.

## Common Mistake / Interview Trap

Not a replacement for data lifecycle.

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

> **afterNextRender:** Runs callback after next rendering pass in browser.
