# E2E Testing

## What / Why

Test critical journeys across real app boundaries.

## Mental Model / Visual

```text
login/checkout
```

## Example

```jsx
// Minimal recall example for E2E Testing
function Example() {
  return <div>E2E Testing</div>;
}
```

## When to Use

Keep small and high-value.

## Common Mistake / Interview Trap

Do not rely on E2E as primary test layer.

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

> **E2E Testing:** Test critical journeys across real app boundaries.
