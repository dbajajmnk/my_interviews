# nextTick

## What / Why

Waits for pending DOM update flush.

## Mental Model

```text
await nextTick()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: nextTick
</script>

<template>
  <div>nextTick</div>
</template>
```

## When to Use

Use when code must observe updated DOM.

## Common Mistake / Interview Trap

Do not use as a general async delay.

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

> **nextTick:** Waits for pending DOM update flush.
