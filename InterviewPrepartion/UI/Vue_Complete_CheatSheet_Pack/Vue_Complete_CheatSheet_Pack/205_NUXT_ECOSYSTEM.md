# Nuxt Ecosystem

## What / Why

Nuxt adds file routing, SSR, server routes, data fetching and full-stack conventions.

## Mental Model

```text
Vue core → Nuxt
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Nuxt Ecosystem
</script>

<template>
  <div>Nuxt Ecosystem</div>
</template>
```

## When to Use

Use for full production framework needs.

## Common Mistake / Interview Trap

Do not mix core Vue and Nuxt API assumptions.

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

> **Nuxt Ecosystem:** Nuxt adds file routing, SSR, server routes, data fetching and full-stack conventions.
