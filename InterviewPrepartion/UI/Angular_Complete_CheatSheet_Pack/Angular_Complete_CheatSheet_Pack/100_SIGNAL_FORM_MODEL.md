# Signal Form Model

## What / Why

Writable signal is source of truth for form model.

## Mental Model

```text
loginModel = signal({...})
```

## Example / Recall

```ts
// Minimal recall example for: Signal Form Model
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use strongly typed domain-shaped models.

## Common Mistake / Interview Trap

Do not keep duplicate control-tree and signal model unless interoperability requires it.

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

> **Signal Form Model:** Writable signal is source of truth for form model.
