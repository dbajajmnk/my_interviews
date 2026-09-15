# cacheSignal

## What / Why

RSC-only API exposing cache lifetime abort signal.

## Mental Model / Visual

```text
fetch(url,{signal:cacheSignal()})
```

## Example

```jsx
// Minimal recall example for cacheSignal
function Example() {
  return <div>cacheSignal</div>;
}
```

## When to Use

Use to abort work when cached rendering ends.

## Common Mistake / Interview Trap

Server Components only.

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

> **cacheSignal:** RSC-only API exposing cache lifetime abort signal.
