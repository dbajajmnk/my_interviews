# defineProps

## What / Why

Compile-time macro declares component props in script setup.

## Mental Model

```text
const props=defineProps<{id:string}>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: defineProps
</script>

<template>
  <div>defineProps</div>
</template>
```

## When to Use

Use type-based declarations with TypeScript when appropriate.

## Common Mistake / Interview Trap

Props are readonly.

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

> **defineProps:** Compile-time macro declares component props in script setup.
