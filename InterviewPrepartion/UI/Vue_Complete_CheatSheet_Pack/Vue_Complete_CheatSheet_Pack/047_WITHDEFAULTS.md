# withDefaults

## What / Why

Provides defaults for type-based props declarations, especially older patterns.

## Mental Model

```text
withDefaults(defineProps<Props>(),{...})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: withDefaults
</script>

<template>
  <div>withDefaults</div>
</template>
```

## When to Use

Use when needed for compatibility/complex defaults.

## Common Mistake / Interview Trap

Reactive props destructure can be simpler in Vue 3.5+.

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

> **withDefaults:** Provides defaults for type-based props declarations, especially older patterns.
