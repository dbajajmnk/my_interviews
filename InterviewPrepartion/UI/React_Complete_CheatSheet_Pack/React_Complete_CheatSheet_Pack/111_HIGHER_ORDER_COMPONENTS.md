# Higher-Order Components

## What / Why

Function wraps a component to enhance behavior.

## Mental Model / Visual

```text
withAuth(Component)
```

## Example

```jsx
// Minimal recall example for Higher-Order Components
function Example() {
  return <div>Higher-Order Components</div>;
}
```

## When to Use

Know for legacy/ecosystem code.

## Common Mistake / Interview Trap

Hooks/composition are often simpler in modern apps.

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

> **Higher-Order Components:** Function wraps a component to enhance behavior.
