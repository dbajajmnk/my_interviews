# State Colocation

## What / Why

Keep state as close as possible to where it is used.

## Mental Model / Visual

```text
feature state inside feature
```

## Example

```jsx
// Minimal recall example for State Colocation
function Example() {
  return <div>State Colocation</div>;
}
```

## When to Use

Use to reduce unnecessary re-renders/coupling.

## Common Mistake / Interview Trap

Global state should be justified.

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

> **State Colocation:** Keep state as close as possible to where it is used.
