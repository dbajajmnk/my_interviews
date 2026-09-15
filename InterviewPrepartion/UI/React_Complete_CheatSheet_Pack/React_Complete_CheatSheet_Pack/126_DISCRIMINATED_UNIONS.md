# Discriminated Unions

## What / Why

Model variant props safely.

## Mental Model / Visual

```text
type Props={kind:'link';href:string}|{kind:'button';onClick():void}
```

## Example

```jsx
// Minimal recall example for Discriminated Unions
function Example() {
  return <div>Discriminated Unions</div>;
}
```

## When to Use

Use for mutually exclusive component modes.

## Common Mistake / Interview Trap

Better than many optional incompatible props.

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

> **Discriminated Unions:** Model variant props safely.
