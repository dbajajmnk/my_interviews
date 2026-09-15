# providedIn root

## What / Why

Registers a tree-shakable application singleton provider.

## Mental Model

```text
@Injectable({providedIn:'root'})
```

## Example / Recall

```ts
// Minimal recall example for: providedIn root
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for app-wide stateless/shared services.

## Common Mistake / Interview Trap

Singleton lifetime should not become hidden global mutable state.

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

> **providedIn root:** Registers a tree-shakable application singleton provider.
