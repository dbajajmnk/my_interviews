# watchPostEffect

## What / Why

Runs watched effect after component DOM update.

## Mental Model

```text
watchPostEffect(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: watchPostEffect
</script>

<template>
  <div>watchPostEffect</div>
</template>
```

## When to Use

Use when side effect needs updated DOM.

## Common Mistake / Interview Trap

Prefer nextTick or lifecycle APIs when intent is one-time DOM work.

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

> **watchPostEffect:** Runs watched effect after component DOM update.
