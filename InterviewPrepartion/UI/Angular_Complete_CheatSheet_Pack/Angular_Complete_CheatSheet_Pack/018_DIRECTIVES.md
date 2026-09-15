# Directives

## What / Why

Add behavior to existing DOM/components.

## Mental Model

```text
attribute/structural behavior
```

## Example / Recall

```ts
// Minimal recall example for: Directives
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when behavior does not require its own visual template.

## Common Mistake / Interview Trap

Prefer components when a visual UI unit has its own structure.

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

> **Directives:** Add behavior to existing DOM/components.
