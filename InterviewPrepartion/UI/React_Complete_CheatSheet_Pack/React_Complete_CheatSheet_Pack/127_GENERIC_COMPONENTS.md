# Generic Components

## What / Why

Use generics for reusable typed lists/selects.

## Mental Model / Visual

```text
function List<T>({items,...})
```

## Example

```jsx
// Minimal recall example for Generic Components
function Example() {
  return <div>Generic Components</div>;
}
```

## When to Use

Use in reusable libraries.

## Common Mistake / Interview Trap

Keep inference ergonomic.

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

> **Generic Components:** Use generics for reusable typed lists/selects.
