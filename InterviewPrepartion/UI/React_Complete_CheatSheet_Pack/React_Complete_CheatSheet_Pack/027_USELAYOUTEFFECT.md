# useLayoutEffect

## What / Why

Runs synchronously after DOM mutation before paint.

## Mental Model / Visual

```text
useLayoutEffect(()=>measure())
```

## Example

```jsx
// Minimal recall example for useLayoutEffect
function Example() {
  return <div>useLayoutEffect</div>;
}
```

## When to Use

Use for layout measurement or preventing visual flicker.

## Common Mistake / Interview Trap

Can block paint; prefer useEffect otherwise.

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

> **useLayoutEffect:** Runs synchronously after DOM mutation before paint.
