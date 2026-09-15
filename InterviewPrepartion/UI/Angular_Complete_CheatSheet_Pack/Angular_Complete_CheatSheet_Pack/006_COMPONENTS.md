# Components

## What / Why

Components combine TypeScript behavior, template, styles, dependency injection, and lifecycle.

## Mental Model

```text
@Component → template + class + styles
```

## Example / Recall

```ts
// Minimal recall example for: Components
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use components for cohesive UI capabilities.

## Common Mistake / Interview Trap

Do not make one giant component own an entire feature.

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

> **Components:** Components combine TypeScript behavior, template, styles, dependency injection, and lifecycle.
