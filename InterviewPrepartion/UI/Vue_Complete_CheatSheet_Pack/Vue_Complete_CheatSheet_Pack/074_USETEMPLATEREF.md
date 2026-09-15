# useTemplateRef

## What / Why

Vue 3.5 helper for typed template refs.

## Mental Model

```text
const input=useTemplateRef('my-input')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: useTemplateRef
</script>

<template>
  <div>useTemplateRef</div>
</template>
```

## When to Use

Use instead of manual ref(null) for template refs in 3.5+.

## Common Mistake / Interview Trap

Ref is populated only after mount.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **useTemplateRef:** Vue 3.5 helper for typed template refs.
