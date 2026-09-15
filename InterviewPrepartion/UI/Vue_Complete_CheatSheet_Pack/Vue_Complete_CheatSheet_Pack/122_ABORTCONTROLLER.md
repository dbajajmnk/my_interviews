# AbortController

## What / Why

Cancel stale fetches.

## Mental Model

```text
controller.abort()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: AbortController
</script>

<template>
  <div>AbortController</div>
</template>
```

## When to Use

Use with watchers/search/navigation.

## Common Mistake / Interview Trap

Cancellation is especially important for latest-only workflows.

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

> **AbortController:** Cancel stale fetches.
