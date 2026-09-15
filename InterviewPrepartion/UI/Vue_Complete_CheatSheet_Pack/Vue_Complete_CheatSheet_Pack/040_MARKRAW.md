# markRaw

## What / Why

Prevents an object from becoming reactive.

## Mental Model

```text
markRaw(externalInstance)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: markRaw
</script>

<template>
  <div>markRaw</div>
</template>
```

## When to Use

Use for third-party class instances/large immutable objects.

## Common Mistake / Interview Trap

Creates identity/reactivity edges; use deliberately.

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

> **markRaw:** Prevents an object from becoming reactive.
