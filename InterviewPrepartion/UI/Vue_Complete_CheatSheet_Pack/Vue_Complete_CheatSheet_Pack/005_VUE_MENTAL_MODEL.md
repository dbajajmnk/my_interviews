# Vue Mental Model

## What / Why

Vue maps reactive state to declarative templates through a compiler-optimized rendering system.

## Mental Model

```text
Reactive State → Render Effect → Virtual DOM / Compiler Optimizations → DOM
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vue Mental Model
</script>

<template>
  <div>Vue Mental Model</div>
</template>
```

## When to Use

Use this as the top-level model for Vue rendering and interviews.

## Common Mistake / Interview Trap

Vue is more than a templating library; reactivity and the compiler are central.

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

> **Vue Mental Model:** Vue maps reactive state to declarative templates through a compiler-optimized rendering system.
