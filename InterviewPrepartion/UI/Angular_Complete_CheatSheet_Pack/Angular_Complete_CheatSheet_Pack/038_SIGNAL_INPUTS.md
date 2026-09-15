# Signal Inputs

## What / Why

input()/input.required() define signal-based component inputs.

## Mental Model

```text
name = input.required<string>()
```

## Example / Recall

```ts
// Minimal recall example for: Signal Inputs
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use in modern components.

## Common Mistake / Interview Trap

Input signals are read-only to child component.

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

> **Signal Inputs:** input()/input.required() define signal-based component inputs.
