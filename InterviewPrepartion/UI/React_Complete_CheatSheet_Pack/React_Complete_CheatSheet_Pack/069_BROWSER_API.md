# browser API

## What / Why

React DOM 19.3 browser() lets code suspend during SSR but continue in browser.

## Mental Model / Visual

```text
use(browser())
```

## Example

```jsx
// Minimal recall example for browser API
function Example() {
  return <div>browser API</div>;
}
```

## When to Use

Use for browser-only UI under Suspense.

## Common Mistake / Interview Trap

Do not use it to hide avoidable hydration mismatches.

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

> **browser API:** React DOM 19.3 browser() lets code suspend during SSR but continue in browser.
