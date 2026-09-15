# flushSync

## What / Why

Forces React to flush updates synchronously.

## Mental Model / Visual

```text
flushSync(()=>setState(...))
```

## Example

```jsx
// Minimal recall example for flushSync
function Example() {
  return <div>flushSync</div>;
}
```

## When to Use

Use rarely for third-party/browser integration.

## Common Mistake / Interview Trap

Hurts performance and concurrent scheduling.

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

> **flushSync:** Forces React to flush updates synchronously.
