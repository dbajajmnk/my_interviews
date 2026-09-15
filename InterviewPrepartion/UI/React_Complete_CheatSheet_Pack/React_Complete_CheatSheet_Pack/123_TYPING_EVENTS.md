# Typing Events

## What / Why

Use correct React event types.

## Mental Model / Visual

```text
React.ChangeEvent<HTMLInputElement>
```

## Example

```jsx
// Minimal recall example for Typing Events
function Example() {
  return <div>Typing Events</div>;
}
```

## When to Use

Use when handler inference is unavailable.

## Common Mistake / Interview Trap

Do not use any.

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

> **Typing Events:** Use correct React event types.
