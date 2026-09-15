# Events

## What / Why

React handlers respond to user/browser events.

## Mental Model / Visual

```text
<button onClick={handleClick}>
```

## Example

```jsx
// Minimal recall example for Events
function Example() {
  return <div>Events</div>;
}
```

## When to Use

Use functions as handlers.

## Common Mistake / Interview Trap

Do not call handler during render: onClick={handleClick()} unless intentional.

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

> **Events:** React handlers respond to user/browser events.
