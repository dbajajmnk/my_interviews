# File Inputs

## What / Why

Use browser File APIs/FormData.

## Mental Model / Visual

```text
<input type='file'>
```

## Example

```jsx
// Minimal recall example for File Inputs
function Example() {
  return <div>File Inputs</div>;
}
```

## When to Use

Use uncontrolled/file upload patterns.

## Common Mistake / Interview Trap

Never trust client MIME/name alone.

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

> **File Inputs:** Use browser File APIs/FormData.
