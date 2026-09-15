# Teleport Pattern

## What / Why

Render overlay DOM outside local hierarchy.

## Mental Model

```text
modal → body
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Teleport Pattern
</script>

<template>
  <div>Teleport Pattern</div>
</template>
```

## When to Use

Use for dialogs/popovers.

## Common Mistake / Interview Trap

Logical Vue ownership remains at original component.

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

> **Teleport Pattern:** Render overlay DOM outside local hierarchy.
