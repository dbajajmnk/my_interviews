# Angular Security Model

## What / Why

Angular sanitizes untrusted values in relevant template binding contexts.

## Mental Model

```text
untrusted value → sanitization → DOM
```

## Example / Recall

```ts
// Minimal recall example for: Angular Security Model
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Prefer normal template binding.

## Common Mistake / Interview Trap

Bypassing sanitization is dangerous.

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

> **Angular Security Model:** Angular sanitizes untrusted values in relevant template binding contexts.
