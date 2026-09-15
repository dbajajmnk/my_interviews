# ref as Prop

## What / Why

React 19 supports ref as a prop for function components in modern patterns.

## Mental Model / Visual

```text
function Input({ref}){ return <input ref={ref}/> }
```

## Example

```jsx
// Minimal recall example for ref as Prop
function Example() {
  return <div>ref as Prop</div>;
}
```

## When to Use

Use according to React 19 migration guidance.

## Common Mistake / Interview Trap

Older forwardRef-heavy patterns may still exist in libraries/codebases.

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

> **ref as Prop:** React 19 supports ref as a prop for function components in modern patterns.
