# onUpdated

## What / Why

Runs after component updates DOM.

## Mental Model

```text
onUpdated(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onUpdated
</script>

<template>
  <div>onUpdated</div>
</template>
```

## When to Use

Use for DOM integration when no finer option exists.

## Common Mistake / Interview Trap

Updating component state here can create loops.

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

> **onUpdated:** Runs after component updates DOM.
