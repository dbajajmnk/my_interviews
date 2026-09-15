# Routes

## What / Why

Declarative path/component/lazy config.

## Mental Model

```text
const routes: Routes = [...]
```

## Example / Recall

```ts
// Minimal recall example for: Routes
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Organize by feature boundaries.

## Common Mistake / Interview Trap

Avoid one enormous routes file.

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

> **Routes:** Declarative path/component/lazy config.
