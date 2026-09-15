# Feature-First Folders

## What / Why

Organize application by business capability.

## Mental Model

```text
features/orders/...
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Feature-First Folders
</script>

<template>
  <div>Feature-First Folders</div>
</template>
```

## When to Use

Use for medium/large apps.

## Common Mistake / Interview Trap

Avoid giant global components/composables/services folders.

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

> **Feature-First Folders:** Organize application by business capability.
