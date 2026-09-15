# RxJS Interop

## What / Why

toSignal/toObservable bridge Signals and Observables.

## Mental Model

```text
toSignal(obs$), toObservable(sig)
```

## Example / Recall

```ts
// Minimal recall example for: RxJS Interop
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use at framework/service boundaries.

## Common Mistake / Interview Trap

Do not convert back and forth repeatedly without reason.

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

> **RxJS Interop:** toSignal/toObservable bridge Signals and Observables.
