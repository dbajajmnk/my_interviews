# Lists and Keys

## What / Why

Keys identify siblings across renders.

## Mental Model / Visual

```text
items.map(x => <Row key={x.id} />)
```

## Example

```jsx
// Minimal recall example for Lists and Keys
function Example() {
  return <div>Lists and Keys</div>;
}
```

## When to Use

Use stable domain IDs.

## Common Mistake / Interview Trap

Array index keys can break state preservation when order changes.

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

> **Lists and Keys:** Keys identify siblings across renders.
