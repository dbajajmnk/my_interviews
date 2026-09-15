# Lazy Routes

## What / Why

Route component loaded with dynamic import.

## Mental Model

```text
component:()=>import('./User.vue')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Lazy Routes
</script>

<template>
  <div>Lazy Routes</div>
</template>
```

## When to Use

Use to split large features.

## Common Mistake / Interview Trap

Chunking strategy still matters.

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

> **Lazy Routes:** Route component loaded with dynamic import.
