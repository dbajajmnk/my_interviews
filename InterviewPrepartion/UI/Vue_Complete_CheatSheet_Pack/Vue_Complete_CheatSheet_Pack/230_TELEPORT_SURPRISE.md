# Teleport Surprise

## What / Why

DOM target differs but component event/injection ownership stays logical.

## Mental Model

```text
logical tree ≠ DOM tree
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Teleport Surprise
</script>

<template>
  <div>Teleport Surprise</div>
</template>
```

## When to Use

Use for overlays.

## Common Mistake / Interview Trap

CSS stacking/focus issues remain.

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

> **Teleport Surprise:** DOM target differs but component event/injection ownership stays logical.
