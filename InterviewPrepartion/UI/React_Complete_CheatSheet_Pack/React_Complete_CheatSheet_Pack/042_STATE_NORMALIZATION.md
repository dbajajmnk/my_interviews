# State Normalization

## What / Why

Avoid deeply duplicated nested state.

## Mental Model / Visual

```text
entities by id + ids
```

## Example

```jsx
// Minimal recall example for State Normalization
function Example() {
  return <div>State Normalization</div>;
}
```

## When to Use

Use when many items reference each other.

## Common Mistake / Interview Trap

Do not normalize tiny local forms unnecessarily.

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

> **State Normalization:** Avoid deeply duplicated nested state.
