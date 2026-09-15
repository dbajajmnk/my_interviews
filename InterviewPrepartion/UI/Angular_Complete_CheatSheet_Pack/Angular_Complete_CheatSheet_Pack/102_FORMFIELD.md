# FormField

## What / Why

Binds signal-form field tree to input/control.

## Mental Model

```text
[formField]='loginForm.email'
```

## Example / Recall

```ts
// Minimal recall example for: FormField
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for Signal Forms native/custom controls.

## Common Mistake / Interview Trap

Custom controls must implement expected control contract.

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

> **FormField:** Binds signal-form field tree to input/control.
