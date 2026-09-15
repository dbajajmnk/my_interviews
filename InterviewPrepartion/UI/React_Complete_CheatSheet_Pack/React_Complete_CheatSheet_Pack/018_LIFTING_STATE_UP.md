# Lifting State Up

## What / Why

Move shared state to nearest common owner.

## Mental Model / Visual

```text
Parent state → children props
```

## Example

```jsx
// Minimal recall example for Lifting State Up
function Example() {
  return <div>Lifting State Up</div>;
}
```

## When to Use

Use when sibling components need coordinated state.

## Common Mistake / Interview Trap

Do not lift everything globally.

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

> **Lifting State Up:** Move shared state to nearest common owner.
