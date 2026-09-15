# Pinia Ecosystem

## What / Why

Pinia is maintained by Vue core team and is recommended for new larger shared-state apps.

## Mental Model

```text
Vue → Pinia
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Ecosystem
</script>

<template>
  <div>Pinia Ecosystem</div>
</template>
```

## When to Use

Use when shared-store conventions are justified.

## Common Mistake / Interview Trap

Vuex is maintenance mode.

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

> **Pinia Ecosystem:** Pinia is maintained by Vue core team and is recommended for new larger shared-state apps.
