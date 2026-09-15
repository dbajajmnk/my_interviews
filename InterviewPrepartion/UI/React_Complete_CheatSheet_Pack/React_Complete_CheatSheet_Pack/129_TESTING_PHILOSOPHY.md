# Testing Philosophy

## What / Why

Test behavior users observe rather than implementation details.

## Mental Model / Visual

```text
render → interact → assert
```

## Example

```jsx
// Minimal recall example for Testing Philosophy
function Example() {
  return <div>Testing Philosophy</div>;
}
```

## When to Use

Use component/integration tests.

## Common Mistake / Interview Trap

Avoid asserting internal state.

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

> **Testing Philosophy:** Test behavior users observe rather than implementation details.
