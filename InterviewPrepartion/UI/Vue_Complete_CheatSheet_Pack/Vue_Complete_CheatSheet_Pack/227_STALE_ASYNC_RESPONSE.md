# Stale Async Response

## What / Why

Earlier request resolves after newer one.

## Mental Model

```text
watch cleanup/AbortController
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Stale Async Response
</script>

<template>
  <div>Stale Async Response</div>
</template>
```

## When to Use

Cancel or validate request identity.

## Common Mistake / Interview Trap

Latest UI should not be overwritten by stale response.

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

> **Stale Async Response:** Earlier request resolves after newer one.
