# Server Cache Pattern

## What / Why

Use data-fetching/cache libraries/framework data APIs for remote data.

## Mental Model / Visual

```text
query cache / route loaders
```

## Example

```jsx
// Minimal recall example for Server Cache Pattern
function Example() {
  return <div>Server Cache Pattern</div>;
}
```

## When to Use

Use for fetching/revalidation/deduplication.

## Common Mistake / Interview Trap

Server state has different lifecycle than client UI state.

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

> **Server Cache Pattern:** Use data-fetching/cache libraries/framework data APIs for remote data.
