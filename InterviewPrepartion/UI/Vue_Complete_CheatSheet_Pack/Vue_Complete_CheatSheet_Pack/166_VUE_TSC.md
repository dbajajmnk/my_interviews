# vue-tsc

## What / Why

Performs Vue-aware TypeScript checking.

## Mental Model

```text
vue-tsc --noEmit
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: vue-tsc
</script>

<template>
  <div>vue-tsc</div>
</template>
```

## When to Use

Use in CI.

## Common Mistake / Interview Trap

tsc alone does not understand all SFC template semantics.

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

> **vue-tsc:** Performs Vue-aware TypeScript checking.
