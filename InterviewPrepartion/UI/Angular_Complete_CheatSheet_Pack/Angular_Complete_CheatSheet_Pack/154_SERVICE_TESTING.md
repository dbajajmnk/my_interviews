# Service Testing

## What / Why

Instantiate services via TestBed or focused DI context.

## Mental Model

```text
TestBed.inject(Service)
```

## Example / Recall

```ts
// Minimal recall example for: Service Testing
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use dependency fakes where needed.

## Common Mistake / Interview Trap

Pure services may not need Angular TestBed.

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

> **Service Testing:** Instantiate services via TestBed or focused DI context.
