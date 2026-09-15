# Error Architecture

## What / Why

Use HTTP error mapping, route errors, global ErrorHandler/telemetry and local UX boundaries appropriately.

## Mental Model

```text
error → boundary/handler → telemetry
```

## Example / Recall

```ts
// Minimal recall example for: Error Architecture
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use layered handling.

## Common Mistake / Interview Trap

One global handler should not replace local recoverable UX.

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

> **Error Architecture:** Use HTTP error mapping, route errors, global ErrorHandler/telemetry and local UX boundaries appropriately.
