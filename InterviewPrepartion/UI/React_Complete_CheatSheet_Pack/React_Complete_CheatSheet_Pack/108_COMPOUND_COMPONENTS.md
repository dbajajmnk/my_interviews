# Compound Components

## What / Why

Components coordinate through context/children for expressive APIs.

## Mental Model / Visual

```text
<Tabs><Tabs.List/>...</Tabs>
```

## Example

```jsx
// Minimal recall example for Compound Components
function Example() {
  return <div>Compound Components</div>;
}
```

## When to Use

Use for reusable component libraries.

## Common Mistake / Interview Trap

Keep implicit coupling documented.

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

> **Compound Components:** Components coordinate through context/children for expressive APIs.
