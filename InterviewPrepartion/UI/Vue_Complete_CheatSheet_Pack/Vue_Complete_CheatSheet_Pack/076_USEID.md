# useId

## What / Why

Generates stable application-unique IDs useful for accessibility/SSR.

## Mental Model

```text
const id=useId()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: useId
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for label/control relationships.

## Common Mistake / Interview Trap

Do not use as list keys.

## Production Questions

```text
Who owns this state?
Is this local state, server state, URL state, or store state?
Is cleanup required?
What happens during SSR/hydration?
Can this be lazy-loaded?
How is this typed and tested?
What happens on slow network/error?
```

## 20-Second Recall

> **useId:** Generates stable application-unique IDs useful for accessibility/SSR.
