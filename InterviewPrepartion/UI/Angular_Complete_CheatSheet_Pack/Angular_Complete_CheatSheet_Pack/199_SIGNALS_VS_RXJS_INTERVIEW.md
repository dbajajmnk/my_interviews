# Signals vs RxJS Interview

## What / Why

Signals are synchronous reactive values; RxJS handles async streams/composition.

## Mental Model

```text
state vs stream
```

## Example / Recall

```ts
// Minimal recall example for: Signals vs RxJS Interview
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use both intentionally.

## Common Mistake / Interview Trap

Signals did not make RxJS obsolete.

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

> **Signals vs RxJS Interview:** Signals are synchronous reactive values; RxJS handles async streams/composition.
