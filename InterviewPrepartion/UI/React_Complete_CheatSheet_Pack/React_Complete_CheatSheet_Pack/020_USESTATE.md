# useState

## What / Why

Adds local component state.

## Mental Model / Visual

```text
const [count,setCount]=useState(0)
```

## Example

```jsx
// Minimal recall example for useState
function Example() {
  return <div>useState</div>;
}
```

## When to Use

Use for independent local state.

## Common Mistake / Interview Trap

Use updater form setCount(c=>c+1) when based on previous state.

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

> **useState:** Adds local component state.
