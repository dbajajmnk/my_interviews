# Vue Test Utils

## What / Why

Official low-level component testing utilities.

## Mental Model

```text
mount/shallowMount
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vue Test Utils
</script>

<template>
  <div>Vue Test Utils</div>
</template>
```

## When to Use

Use for Vue-aware component tests.

## Common Mistake / Interview Trap

Do not overuse shallow tests to avoid real integration.

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

> **Vue Test Utils:** Official low-level component testing utilities.
