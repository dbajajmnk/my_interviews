# Lint

## What / Why

Use ESLint ecosystem/config chosen by create-vue.

## Mental Model

```text
npm run lint
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Lint
</script>

<template>
  <div>Lint</div>
</template>
```

## When to Use

Use CI.

## Common Mistake / Interview Trap

Keep rules aligned with Vue/TS versions.

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

> **Lint:** Use ESLint ecosystem/config chosen by create-vue.
