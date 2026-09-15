# Signals vs Observables

## What / Why

Signals model synchronous current reactive state; Observables model async streams over time.

## Mental Model

```text
Signal = current value; Observable = stream
```

## Example / Recall

```ts
// Minimal recall example for: Signals vs Observables
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use both where each fits best.

## Common Mistake / Interview Trap

Signals do not replace every RxJS use case.

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

> **Signals vs Observables:** Signals model synchronous current reactive state; Observables model async streams over time.
