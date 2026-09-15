# Component Layering

## What / Why

Separate page/feature/UI primitive responsibilities.

## Mental Model

```text
Page → Feature → UI
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Component Layering
</script>

<template>
  <div>Component Layering</div>
</template>
```

## When to Use

Use clear ownership.

## Common Mistake / Interview Trap

Do not create layers with no actual architectural distinction.

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

> **Component Layering:** Separate page/feature/UI primitive responsibilities.
