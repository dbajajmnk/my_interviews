# Components

## What / Why

A component is a JavaScript function that returns React elements/JSX.

## Mental Model / Visual

```text
function Button(){ return <button>Save</button> }
```

## Example

```jsx
// Minimal recall example for Components
function Example() {
  return <div>Components</div>;
}
```

## When to Use

Use components to encapsulate cohesive UI behavior.

## Common Mistake / Interview Trap

Component names must start with a capital letter when used as JSX components.

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

> **Components:** A component is a JavaScript function that returns React elements/JSX.
