# Router Error Handling

## What / Why

Capture navigation/lazy-load failures.

## Mental Model

```text
router.onError
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Router Error Handling
</script>

<template>
  <div>Router Error Handling</div>
</template>
```

## When to Use

Use for observability and chunk-reload strategies.

## Common Mistake / Interview Trap

Avoid infinite reload loops.

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

> **Router Error Handling:** Capture navigation/lazy-load failures.
