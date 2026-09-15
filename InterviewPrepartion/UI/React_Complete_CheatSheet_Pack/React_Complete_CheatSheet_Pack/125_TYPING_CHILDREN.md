# Typing Children

## What / Why

Use React.ReactNode for general renderable children.

## Mental Model / Visual

```text
children: React.ReactNode
```

## Example

```jsx
// Minimal recall example for Typing Children
function Example() {
  return <div>Typing Children</div>;
}
```

## When to Use

Use based on component contract.

## Common Mistake / Interview Trap

Do not overconstrain children without reason.

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

> **Typing Children:** Use React.ReactNode for general renderable children.
