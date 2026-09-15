# dangerouslySetInnerHTML

## What / Why

Inject raw HTML explicitly.

## Mental Model / Visual

```text
dangerouslySetInnerHTML={{__html:trustedHtml}}
```

## Example

```jsx
// Minimal recall example for dangerouslySetInnerHTML
function Example() {
  return <div>dangerouslySetInnerHTML</div>;
}
```

## When to Use

Use only with sanitization/trusted source.

## Common Mistake / Interview Trap

Major XSS risk.

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

> **dangerouslySetInnerHTML:** Inject raw HTML explicitly.
