# Browser-Only APIs

## What / Why

Guard window/document/localStorage during SSR.

## Mental Model

```text
onMounted/client checks
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Browser-Only APIs
</script>

<template>
  <div>Browser-Only APIs</div>
</template>
```

## When to Use

Use browser APIs only in client lifecycle.

## Common Mistake / Interview Trap

Direct access during server render crashes.

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

> **Browser-Only APIs:** Guard window/document/localStorage during SSR.
