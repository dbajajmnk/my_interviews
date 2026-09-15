# Typing Props

## What / Why

Use type-based defineProps declarations.

## Mental Model

```text
defineProps<{id:string}>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Typing Props
</script>

<template>
  <div>Typing Props</div>
</template>
```

## When to Use

Use strict TS.

## Common Mistake / Interview Trap

Keep runtime validation needs separate from compile-time types.

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

> **Typing Props:** Use type-based defineProps declarations.
