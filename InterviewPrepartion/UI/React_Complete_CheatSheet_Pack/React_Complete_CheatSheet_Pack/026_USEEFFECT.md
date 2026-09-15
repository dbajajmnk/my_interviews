# useEffect

## What / Why

Synchronizes component with external systems after commit.

## Mental Model / Visual

```text
useEffect(()=>{connect(); return disconnect},[roomId])
```

## Example

```jsx
// Minimal recall example for useEffect
function Example() {
  return <div>useEffect</div>;
}
```

## When to Use

Use for subscriptions, browser APIs, non-React systems.

## Common Mistake / Interview Trap

If no external system is involved, you probably do not need an effect.

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

> **useEffect:** Synchronizes component with external systems after commit.
