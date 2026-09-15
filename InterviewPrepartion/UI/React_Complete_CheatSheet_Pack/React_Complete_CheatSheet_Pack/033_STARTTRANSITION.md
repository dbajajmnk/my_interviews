# startTransition

## What / Why

Marks updates as transition outside the hook API.

## Mental Model / Visual

```text
startTransition(()=>setTab(next))
```

## Example

```jsx
// Minimal recall example for startTransition
function Example() {
  return <div>startTransition</div>;
}
```

## When to Use

Use when pending state is not needed locally.

## Common Mistake / Interview Trap

Not a delay/timer.

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

> **startTransition:** Marks updates as transition outside the hook API.
