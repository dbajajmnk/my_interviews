# Bundle Analysis

## What / Why

Inspect dependency/chunk size.

## Mental Model

```text
vite build stats/plugins
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Bundle Analysis
</script>

<template>
  <div>Bundle Analysis</div>
</template>
```

## When to Use

Use before replacing packages.

## Common Mistake / Interview Trap

Tree shaking depends on package/module behavior.

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

> **Bundle Analysis:** Inspect dependency/chunk size.
