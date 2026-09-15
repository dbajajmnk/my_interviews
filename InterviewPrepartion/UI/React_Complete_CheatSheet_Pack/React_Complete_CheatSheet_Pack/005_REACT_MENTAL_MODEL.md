# React Mental Model

## What / Why

React builds UI from components and updates the DOM by reconciling rendered trees.

## Mental Model / Visual

```text
State/Props → Render → Reconcile → Commit → DOM
```

## Example

```jsx
// Minimal recall example for React Mental Model
function Example() {
  return <div>React Mental Model</div>;
}
```

## When to Use

Use this model to reason about every React update.

## Common Mistake / Interview Trap

React does not mutate the DOM directly every time state is set; rendering and committing are distinct phases.

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

> **React Mental Model:** React builds UI from components and updates the DOM by reconciling rendered trees.
