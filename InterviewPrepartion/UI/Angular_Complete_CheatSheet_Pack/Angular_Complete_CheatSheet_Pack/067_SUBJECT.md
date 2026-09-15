# Subject

## What / Why

Multicasts manually pushed values.

## Mental Model

```text
subject.next(x)
```

## Example / Recall

```ts
// Minimal recall example for: Subject
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for imperative event sources carefully.

## Common Mistake / Interview Trap

Subjects often become hidden mutable globals.

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

> **Subject:** Multicasts manually pushed values.
