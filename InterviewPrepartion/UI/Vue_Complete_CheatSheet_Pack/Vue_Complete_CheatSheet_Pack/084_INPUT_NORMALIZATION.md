# Input Normalization

## What / Why

Accept refs/getters/plain values where appropriate.

## Mental Model

```text
toValue(input)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Input Normalization
</script>

<template>
  <div>Input Normalization</div>
</template>
```

## When to Use

Use for reusable flexible composables.

## Common Mistake / Interview Trap

Document whether composable tracks getter/ref changes.

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

> **Input Normalization:** Accept refs/getters/plain values where appropriate.
