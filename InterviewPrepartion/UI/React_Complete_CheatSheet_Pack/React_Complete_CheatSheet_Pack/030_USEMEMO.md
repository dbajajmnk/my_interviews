# useMemo

## What / Why

Caches a calculation between renders.

## Mental Model / Visual

```text
const value=useMemo(()=>expensive(a),[a])
```

## Example

```jsx
// Minimal recall example for useMemo
function Example() {
  return <div>useMemo</div>;
}
```

## When to Use

Use only for measured expensive work or stable identity needs.

## Common Mistake / Interview Trap

It is a performance optimization, not semantic correctness.

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

> **useMemo:** Caches a calculation between renders.
