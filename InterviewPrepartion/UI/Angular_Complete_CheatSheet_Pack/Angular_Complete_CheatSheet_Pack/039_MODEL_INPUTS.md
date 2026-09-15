# Model Inputs

## What / Why

model() enables signal-based two-way binding contract.

## Mental Model

```text
value = model('')
```

## Example / Recall

```ts
// Minimal recall example for: Model Inputs
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for reusable controls with two-way binding semantics.

## Common Mistake / Interview Trap

Do not overuse two-way APIs for one-way data flow.

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

> **Model Inputs:** model() enables signal-based two-way binding contract.
