# Class Components Recall

## What / Why

Legacy React uses class lifecycle/state APIs.

## Mental Model / Visual

```text
componentDidMount etc.
```

## Example

```jsx
// Minimal recall example for Class Components Recall
function Example() {
  return <div>Class Components Recall</div>;
}
```

## When to Use

Know for maintenance/interviews.

## Common Mistake / Interview Trap

Modern new code generally uses function components/Hooks.

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

> **Class Components Recall:** Legacy React uses class lifecycle/state APIs.
