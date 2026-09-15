# Computed Caching

## What / Why

Computed only re-evaluates when dependencies change.

## Mental Model

```text
computed cache
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Computed Caching
</script>

<template>
  <div>Computed Caching</div>
</template>
```

## When to Use

Use expensive pure derivations.

## Common Mistake / Interview Trap

Methods rerun when render calls them.

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

> **Computed Caching:** Computed only re-evaluates when dependencies change.
