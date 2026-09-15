# User Events

## What / Why

Simulate realistic interaction sequences.

## Mental Model / Visual

```text
user.click / user.type
```

## Example

```jsx
// Minimal recall example for User Events
function Example() {
  return <div>User Events</div>;
}
```

## When to Use

Use over low-level event firing when appropriate.

## Common Mistake / Interview Trap

Await async user interactions.

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

> **User Events:** Simulate realistic interaction sequences.
