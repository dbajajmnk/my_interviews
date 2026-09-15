# Props

## What / Why

Props are read-only inputs passed from parent to child.

## Mental Model / Visual

```text
<UserCard user={user} />
```

## Example

```jsx
// Minimal recall example for Props
function Example() {
  return <div>Props</div>;
}
```

## When to Use

Use props for explicit parent-to-child data flow.

## Common Mistake / Interview Trap

Do not mutate props.

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

> **Props:** Props are read-only inputs passed from parent to child.
