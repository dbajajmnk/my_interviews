# Code Splitting

## What / Why

Use dynamic import/async components/routes.

## Mental Model

```text
import()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Code Splitting
</script>

<template>
  <div>Code Splitting</div>
</template>
```

## When to Use

Use route/feature boundaries.

## Common Mistake / Interview Trap

Avoid excessive tiny chunks/waterfalls.

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

> **Code Splitting:** Use dynamic import/async components/routes.
