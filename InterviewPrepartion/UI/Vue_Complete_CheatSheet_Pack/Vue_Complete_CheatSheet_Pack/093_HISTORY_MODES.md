# History Modes

## What / Why

Web, hash, and memory history modes.

## Mental Model

```text
createWebHistory / createWebHashHistory / createMemoryHistory
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: History Modes
</script>

<template>
  <div>History Modes</div>
</template>
```

## When to Use

Choose based on hosting/SSR environment.

## Common Mistake / Interview Trap

Web history requires server fallback configuration.

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

> **History Modes:** Web, hash, and memory history modes.
