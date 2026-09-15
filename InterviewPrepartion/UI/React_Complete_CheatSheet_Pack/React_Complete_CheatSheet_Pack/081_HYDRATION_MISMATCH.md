# Hydration Mismatch

## What / Why

Server and first client render differ.

## Mental Model / Visual

```text
date/random/window-dependent output mismatch
```

## Example

```jsx
// Minimal recall example for Hydration Mismatch
function Example() {
  return <div>Hydration Mismatch</div>;
}
```

## When to Use

Use deterministic initial rendering or browser-only boundaries.

## Common Mistake / Interview Trap

suppressHydrationWarning is an escape hatch, not a general fix.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Hydration Mismatch:** Server and first client render differ.
