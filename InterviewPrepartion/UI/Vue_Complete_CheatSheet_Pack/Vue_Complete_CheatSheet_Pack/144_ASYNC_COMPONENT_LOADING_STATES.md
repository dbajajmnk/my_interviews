# Async Component Loading States

## What / Why

defineAsyncComponent supports loading/error/delay/timeout options.

## Mental Model

```text
loader → loading/error component
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Async Component Loading States
</script>

<template>
  <div>Async Component Loading States</div>
</template>
```

## When to Use

Use for large optional features.

## Common Mistake / Interview Trap

Handle chunk/network failure.

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

> **Async Component Loading States:** defineAsyncComponent supports loading/error/delay/timeout options.
