# Composable vs Store

## What / Why

Composable is reusable logic; store owns shared application state/conventions.

## Mental Model

```text
useFeature() vs Pinia store
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Composable vs Store
</script>

<template>
  <div>Composable vs Store</div>
</template>
```

## When to Use

Use simplest suitable abstraction.

## Common Mistake / Interview Trap

Not every composable should become a global store.

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

> **Composable vs Store:** Composable is reusable logic; store owns shared application state/conventions.
