# markForCheck

## What / Why

Marks a view for checking.

## Mental Model

```text
cdr.markForCheck()
```

## Example / Recall

```ts
// Minimal recall example for: markForCheck
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when imperative integration changes data outside normal notification APIs.

## Common Mistake / Interview Trap

Signals/AsyncPipe often make manual calls unnecessary.

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

> **markForCheck:** Marks a view for checking.
