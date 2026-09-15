# ControlValueAccessor

## What / Why

Adapts custom components to Forms APIs.

## Mental Model

```text
writeValue/registerOnChange
```

## Example / Recall

```ts
// Minimal recall example for: ControlValueAccessor
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Know for legacy/custom form control integration.

## Common Mistake / Interview Trap

Modern Signal Forms also provide newer custom-control contracts; do not assume CVA is the only future model.

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

> **ControlValueAccessor:** Adapts custom components to Forms APIs.
