# State as Snapshot

## What / Why

State read during a render is a snapshot for that render.

## Mental Model / Visual

```text
setCount(count+1) schedules a new render
```

## Example

```jsx
// Minimal recall example for State as Snapshot
function Example() {
  return <div>State as Snapshot</div>;
}
```

## When to Use

Use functional updates when next state depends on previous state.

## Common Mistake / Interview Trap

setState does not synchronously mutate the current render's value.

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

> **State as Snapshot:** State read during a render is a snapshot for that render.
