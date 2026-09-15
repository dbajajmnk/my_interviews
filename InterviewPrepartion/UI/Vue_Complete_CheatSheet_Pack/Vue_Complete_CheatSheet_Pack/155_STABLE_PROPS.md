# Stable Props

## What / Why

Pass primitive/stable derived props when possible to reduce child updates.

## Mental Model

```text
active:boolean not activeId+id calculation
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Stable Props
</script>

<template>
  <div>Stable Props</div>
</template>
```

## When to Use

Use in large repeated child trees.

## Common Mistake / Interview Trap

Do not distort APIs solely for micro-performance.

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

> **Stable Props:** Pass primitive/stable derived props when possible to reduce child updates.
