# State Preservation

## What / Why

React preserves state by component position/type/key.

## Mental Model / Visual

```text
same position+type → preserve
```

## Example

```jsx
// Minimal recall example for State Preservation
function Example() {
  return <div>State Preservation</div>;
}
```

## When to Use

Use keys intentionally to reset state.

## Common Mistake / Interview Trap

Changing key resets subtree state.

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

> **State Preservation:** React preserves state by component position/type/key.
