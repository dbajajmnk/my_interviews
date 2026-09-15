# Framework-First Production Apps

## What / Why

React recommends a framework for most new full applications.

## Mental Model / Visual

```text
framework handles routing/data/code split/SSR
```

## Example

```jsx
// Minimal recall example for Framework-First Production Apps
function Example() {
  return <div>Framework-First Production Apps</div>;
}
```

## When to Use

Use when building production apps with routing/data needs.

## Common Mistake / Interview Trap

Framework is optional for constrained/simple apps.

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

> **Framework-First Production Apps:** React recommends a framework for most new full applications.
