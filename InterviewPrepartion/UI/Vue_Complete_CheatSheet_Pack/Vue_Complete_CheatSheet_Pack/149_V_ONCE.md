# v-once

## What / Why

Renders subtree once and skips future updates.

## Mental Model

```text
v-once
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-once
</script>

<template>
  <div>v-once</div>
</template>
```

## When to Use

Use for truly static reactive-independent content.

## Common Mistake / Interview Trap

Wrong use creates stale UI.

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

> **v-once:** Renders subtree once and skips future updates.
