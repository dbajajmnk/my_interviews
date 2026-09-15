# Pinia

## What / Why

Vue's recommended large-scale shared state library.

## Mental Model

```text
defineStore → state/getters/actions
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia
</script>

<template>
  <div>Pinia</div>
</template>
```

## When to Use

Use for larger shared state, DevTools, plugins, SSR and conventions.

## Common Mistake / Interview Trap

Do not use a global store for every form field.

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

> **Pinia:** Vue's recommended large-scale shared state library.
