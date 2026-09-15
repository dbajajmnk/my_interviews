# Template-Driven Forms

## What / Why

Template directives create/control form model.

## Mental Model

```text
ngModel/ngForm
```

## Example / Recall

```ts
// Minimal recall example for: Template-Driven Forms
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for simple forms.

## Common Mistake / Interview Trap

Less explicit/type-safe for large complex forms.

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

> **Template-Driven Forms:** Template directives create/control form model.
