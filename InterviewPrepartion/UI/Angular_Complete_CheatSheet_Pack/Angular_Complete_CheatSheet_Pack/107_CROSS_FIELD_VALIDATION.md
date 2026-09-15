# Cross-Field Validation

## What / Why

Validator checks relationship among fields.

## Mental Model

```text
password/confirm
```

## Example / Recall

```ts
// Minimal recall example for: Cross-Field Validation
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use group/schema-level validators.

## Common Mistake / Interview Trap

Error ownership and display need clear UX.

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

> **Cross-Field Validation:** Validator checks relationship among fields.
