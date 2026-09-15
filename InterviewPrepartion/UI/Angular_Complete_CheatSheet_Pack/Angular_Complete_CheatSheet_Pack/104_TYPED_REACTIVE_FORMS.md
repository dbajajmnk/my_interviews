# Typed Reactive Forms

## What / Why

Reactive Forms support strong control value typing.

## Mental Model

```text
FormControl<string>
```

## Example / Recall

```ts
// Minimal recall example for: Typed Reactive Forms
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Keep strict types.

## Common Mistake / Interview Trap

Untyped forms weaken safety.

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

> **Typed Reactive Forms:** Reactive Forms support strong control value typing.
