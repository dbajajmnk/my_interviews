# Compiler Optimizations

## What / Why

Vue compiler hoists static content and uses patch flags/block trees.

## Mental Model

```text
compile → optimized render function
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Compiler Optimizations
</script>

<template>
  <div>Compiler Optimizations</div>
</template>
```

## When to Use

Rely on compiler for normal templates.

## Common Mistake / Interview Trap

Avoid premature manual micro-optimization.

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

> **Compiler Optimizations:** Vue compiler hoists static content and uses patch flags/block trees.
