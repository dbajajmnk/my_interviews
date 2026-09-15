# Memory Leak Pattern

## What / Why

Uncleaned subscriptions/listeners/resources survive lifecycle.

## Mental Model / Visual

```text
setup ↔ cleanup
```

## Example

```jsx
// Minimal recall example for Memory Leak Pattern
function Example() {
  return <div>Memory Leak Pattern</div>;
}
```

## When to Use

Use effect cleanup and abort signals.

## Common Mistake / Interview Trap

React warning removal does not mean leaks cannot happen.

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

> **Memory Leak Pattern:** Uncleaned subscriptions/listeners/resources survive lifecycle.
