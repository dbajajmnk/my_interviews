# v-if vs v-show

## What / Why

v-if mounts/unmounts; v-show toggles display.

## Mental Model

```text
lifecycle vs CSS
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-if vs v-show
</script>

<template>
  <div>v-if vs v-show</div>
</template>
```

## When to Use

Choose based on toggle frequency/initial cost.

## Common Mistake / Interview Trap

v-show does not work the same for template fragments.

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

> **v-if vs v-show:** v-if mounts/unmounts; v-show toggles display.
