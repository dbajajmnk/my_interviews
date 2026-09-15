# RouterLink

## What / Why

Declarative navigation component.

## Mental Model

```text
<RouterLink to='/users'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: RouterLink
</script>

<template>
  <div>RouterLink</div>
</template>
```

## When to Use

Use instead of plain anchor for internal SPA navigation.

## Common Mistake / Interview Trap

Plain anchors trigger full page load.

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

> **RouterLink:** Declarative navigation component.
