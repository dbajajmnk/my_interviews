# useTemplateRef

## What / Why

Vue 3.5+ helper for named template refs with better type inference.

## Mental Model

```text
const el=useTemplateRef('el')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: useTemplateRef
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in SFCs for DOM/component refs.

## Common Mistake / Interview Trap

Value is null before mount and when unmounted.

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

> **useTemplateRef:** Vue 3.5+ helper for named template refs with better type inference.
