# defineExpose

## What / Why

Controls what a script-setup component exposes through template refs.

## Mental Model

```text
defineExpose({focus})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: defineExpose
</script>

<template>
  <div>defineExpose</div>
</template>
```

## When to Use

Use for narrow imperative APIs.

## Common Mistake / Interview Trap

Prefer declarative props/events when possible.

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

> **defineExpose:** Controls what a script-setup component exposes through template refs.
