# Dependency Injection Mental Model

## What / Why

Angular injectors provide configured dependencies by token.

## Mental Model

```text
Injector → token → provider → instance
```

## Example / Recall

```ts
// Minimal recall example for: Dependency Injection Mental Model
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use DI for services, configuration, abstractions and testability.

## Common Mistake / Interview Trap

Avoid service locator patterns.

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

> **Dependency Injection Mental Model:** Angular injectors provide configured dependencies by token.
