# Effect Cleanup

## What / Why

Return cleanup for subscriptions/timers/resources.

## Mental Model / Visual

```text
return ()=>connection.disconnect()
```

## Example

```jsx
// Minimal recall example for Effect Cleanup
function Example() {
  return <div>Effect Cleanup</div>;
}
```

## When to Use

Use to mirror setup.

## Common Mistake / Interview Trap

Cleanup runs before re-run/unmount as appropriate.

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

> **Effect Cleanup:** Return cleanup for subscriptions/timers/resources.
