# useTransition

## What / Why

Marks updates as non-blocking transitions.

## Mental Model / Visual

```text
const [pending,startTransition]=useTransition()
```

## Example

```jsx
// Minimal recall example for useTransition
function Example() {
  return <div>useTransition</div>;
}
```

## When to Use

Use for expensive non-urgent UI updates.

## Common Mistake / Interview Trap

Transitions cannot control text input state updates directly.

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

> **useTransition:** Marks updates as non-blocking transitions.
