# Pinia Option Store

## What / Why

Defines state/getters/actions object-style.

## Mental Model

```text
defineStore('x',{state,getters,actions})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Option Store
</script>

<template>
  <div>Pinia Option Store</div>
</template>
```

## When to Use

Use when team prefers explicit store sections.

## Common Mistake / Interview Trap

Avoid destructuring state directly without storeToRefs.

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

> **Pinia Option Store:** Defines state/getters/actions object-style.
