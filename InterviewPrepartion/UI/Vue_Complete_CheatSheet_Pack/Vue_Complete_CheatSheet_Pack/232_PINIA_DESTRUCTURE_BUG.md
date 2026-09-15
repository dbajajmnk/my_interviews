# Pinia Destructure Bug

## What / Why

Direct destructure of store state loses reactive linkage.

## Mental Model

```text
storeToRefs
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Destructure Bug
</script>

<template>
  <div>Pinia Destructure Bug</div>
</template>
```

## When to Use

Use storeToRefs for state/getters.

## Common Mistake / Interview Trap

Actions can be destructured normally.

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

> **Pinia Destructure Bug:** Direct destructure of store state loses reactive linkage.
