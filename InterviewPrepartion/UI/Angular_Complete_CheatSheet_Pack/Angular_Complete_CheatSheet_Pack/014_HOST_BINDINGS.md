# Host Bindings

## What / Why

Modern Angular favors `host` metadata for host properties/events.

## Mental Model

```text
host: {'[class.active]':'active()'}
```

## Example / Recall

```ts
// Minimal recall example for: Host Bindings
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for component/directive host behavior.

## Common Mistake / Interview Trap

Avoid legacy @HostBinding/@HostListener in new code when host metadata is clearer.

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

> **Host Bindings:** Modern Angular favors `host` metadata for host properties/events.
