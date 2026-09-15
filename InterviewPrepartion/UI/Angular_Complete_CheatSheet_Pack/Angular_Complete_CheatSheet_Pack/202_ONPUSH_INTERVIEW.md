# OnPush Interview

## What / Why

Angular 22 defaults to OnPush; Eager is opt-in; Default alias is deprecated.

## Mental Model

```text
OnPush default
```

## Example / Recall

```ts
// Minimal recall example for: OnPush Interview
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Explain what marks views dirty.

## Common Mistake / Interview Trap

Older 'set OnPush manually everywhere' guidance is stale.

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

> **OnPush Interview:** Angular 22 defaults to OnPush; Eager is opt-in; Default alias is deprecated.
