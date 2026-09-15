# Microfrontend Integration

## What / Why

Angular can participate in route/module-federation/single-spa/web-component MFEs.

## Mental Model

```text
shell → Angular MFE
```

## Example / Recall

```ts
// Minimal recall example for: Microfrontend Integration
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use clear route/team boundaries.

## Common Mistake / Interview Trap

Do not use microfrontends to solve ordinary component modularity.

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

> **Microfrontend Integration:** Angular can participate in route/module-federation/single-spa/web-component MFEs.
