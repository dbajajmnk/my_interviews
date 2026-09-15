# Vuex Legacy

## What / Why

Vuex is the previous official state library and is in maintenance mode.

## Mental Model

```text
Vuex → Pinia migration
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vuex Legacy
</script>

<template>
  <div>Vuex Legacy</div>
</template>
```

## When to Use

Know for enterprise maintenance.

## Common Mistake / Interview Trap

Use Pinia for new applications.

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

> **Vuex Legacy:** Vuex is the previous official state library and is in maintenance mode.
