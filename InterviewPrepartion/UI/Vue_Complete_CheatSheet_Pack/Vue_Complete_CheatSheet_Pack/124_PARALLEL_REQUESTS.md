# Parallel Requests

## What / Why

Start independent requests together.

## Mental Model

```text
Promise.all
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Parallel Requests
</script>

<template>
  <div>Parallel Requests</div>
</template>
```

## When to Use

Use to avoid waterfalls.

## Common Mistake / Interview Trap

One failure behavior should be designed intentionally.

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

> **Parallel Requests:** Start independent requests together.
