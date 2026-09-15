# onBeforeUnmount

## What / Why

Runs before unmount.

## Mental Model

```text
onBeforeUnmount(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onBeforeUnmount
</script>

<template>
  <div>onBeforeUnmount</div>
</template>
```

## When to Use

Use when pre-disposal step is required.

## Common Mistake / Interview Trap

Most cleanup can live in onUnmounted/composable cleanup.

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

> **onBeforeUnmount:** Runs before unmount.
