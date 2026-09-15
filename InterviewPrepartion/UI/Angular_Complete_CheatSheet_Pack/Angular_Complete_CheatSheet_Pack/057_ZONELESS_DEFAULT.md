# Zoneless Default

## What / Why

Angular v21+ uses zoneless change detection by default.

## Mental Model

```text
Signal/event/input notification → targeted checks
```

## Example / Recall

```ts
// Minimal recall example for: Zoneless Default
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use modern notification mechanisms; ZoneJS is not required by default.

## Common Mistake / Interview Trap

Do not teach ZoneJS patching as the default modern Angular model.

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

> **Zoneless Default:** Angular v21+ uses zoneless change detection by default.
