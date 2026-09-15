# Pinia Setup Store

## What / Why

Defines store using Composition API style.

## Mental Model

```text
defineStore('x',()=>{...})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Setup Store
</script>

<template>
  <div>Pinia Setup Store</div>
</template>
```

## When to Use

Use for composable-like flexibility.

## Common Mistake / Interview Trap

Return all state needed by SSR/devtools/plugins.

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

> **Pinia Setup Store:** Defines store using Composition API style.
