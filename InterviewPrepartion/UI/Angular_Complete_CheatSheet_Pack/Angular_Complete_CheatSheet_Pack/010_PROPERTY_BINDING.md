# Property Binding

## What / Why

Binds DOM/component properties.

## Mental Model

```text
[disabled]='isSaving()'
```

## Example / Recall

```ts
// Minimal recall example for: Property Binding
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for one-way data into DOM/components.

## Common Mistake / Interview Trap

Attribute and property binding are not identical.

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

> **Property Binding:** Binds DOM/component properties.
