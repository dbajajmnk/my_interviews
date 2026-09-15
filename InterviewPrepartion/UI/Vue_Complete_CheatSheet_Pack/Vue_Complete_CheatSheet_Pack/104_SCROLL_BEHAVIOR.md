# Scroll Behavior

## What / Why

Controls scroll on navigation.

## Mental Model

```text
scrollBehavior(to,from,saved)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Scroll Behavior
</script>

<template>
  <div>Scroll Behavior</div>
</template>
```

## When to Use

Use for SPA UX.

## Common Mistake / Interview Trap

Account for back/forward restoration.

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

> **Scroll Behavior:** Controls scroll on navigation.
