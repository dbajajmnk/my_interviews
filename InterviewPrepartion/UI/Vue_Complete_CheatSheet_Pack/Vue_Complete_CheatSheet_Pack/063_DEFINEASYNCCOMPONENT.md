# defineAsyncComponent

## What / Why

Loads a component asynchronously.

## Mental Model

```text
defineAsyncComponent(()=>import('./Chart.vue'))
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: defineAsyncComponent
</script>

<template>
  <div>defineAsyncComponent</div>
</template>
```

## When to Use

Use for feature/widget code splitting.

## Common Mistake / Interview Trap

Design loading/error/delay/timeout behavior.

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

> **defineAsyncComponent:** Loads a component asynchronously.
