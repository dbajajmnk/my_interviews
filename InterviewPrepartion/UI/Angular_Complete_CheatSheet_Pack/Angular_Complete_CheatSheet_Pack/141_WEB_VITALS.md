# Web Vitals

## What / Why

Measure LCP, INP, CLS in real users.

## Mental Model

```text
field telemetry
```

## Example / Recall

```ts
// Minimal recall example for: Web Vitals
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use release/route segmented metrics.

## Common Mistake / Interview Trap

Lab scores alone are not production performance.

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

> **Web Vitals:** Measure LCP, INP, CLS in real users.
