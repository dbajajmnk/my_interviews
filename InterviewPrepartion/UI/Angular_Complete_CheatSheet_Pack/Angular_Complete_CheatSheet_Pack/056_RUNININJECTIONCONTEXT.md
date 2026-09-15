# runInInjectionContext

## What / Why

Runs code with an injector available to inject().

## Mental Model

```text
runInInjectionContext(injector, fn)
```

## Example / Recall

```ts
// Minimal recall example for: runInInjectionContext
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for advanced library/runtime cases.

## Common Mistake / Interview Trap

Not needed in normal component methods.

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

> **runInInjectionContext:** Runs code with an injector available to inject().
