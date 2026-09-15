# Async Testing

## What / Why

Wait for visible outcomes, not arbitrary timers.

## Mental Model / Visual

```text
findByRole / waitFor
```

## Example

```jsx
// Minimal recall example for Async Testing
function Example() {
  return <div>Async Testing</div>;
}
```

## When to Use

Use deterministic async expectations.

## Common Mistake / Interview Trap

Avoid sleep-based tests.

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

> **Async Testing:** Wait for visible outcomes, not arbitrary timers.
