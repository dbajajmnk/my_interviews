# Template Reference Variables

## What / Why

Expose template elements/directives/components locally.

## Mental Model

```text
#inputRef
```

## Example / Recall

```ts
// Minimal recall example for: Template Reference Variables
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for template-local interaction.

## Common Mistake / Interview Trap

Template refs are not application state.

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

> **Template Reference Variables:** Expose template elements/directives/components locally.
