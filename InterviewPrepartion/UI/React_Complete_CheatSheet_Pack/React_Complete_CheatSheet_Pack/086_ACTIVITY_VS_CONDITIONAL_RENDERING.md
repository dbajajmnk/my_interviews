# Activity vs Conditional Rendering

## What / Why

Activity can retain hidden subtree state; conditional rendering removes subtree.

## Mental Model / Visual

```text
hidden Activity vs {show && <Page/>}
```

## Example

```jsx
// Minimal recall example for Activity vs Conditional Rendering
function Example() {
  return <div>Activity vs Conditional Rendering</div>;
}
```

## When to Use

Use Activity when preservation/pre-rendering helps.

## Common Mistake / Interview Trap

Do not keep huge hidden trees without memory/performance reason.

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

> **Activity vs Conditional Rendering:** Activity can retain hidden subtree state; conditional rendering removes subtree.
