# Computed Rendering

## What / Why

Use computed values rather than repeated heavy template calculations.

## Mental Model

```text
const filtered = computed(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Computed Rendering
</script>

<template>
  <div>Computed Rendering</div>
</template>
```

## When to Use

Use derived reactive state.

## Common Mistake / Interview Trap

Avoid calling expensive methods repeatedly in templates.

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

> **Computed Rendering:** Use computed values rather than repeated heavy template calculations.
