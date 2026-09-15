# Async Testing

## What / Why

Await Vue update queue and async work.

## Mental Model

```text
await nextTick / flushPromises
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Async Testing
</script>

<template>
  <div>Async Testing</div>
</template>
```

## When to Use

Use deterministic assertions.

## Common Mistake / Interview Trap

Arbitrary setTimeout sleeps create flaky tests.

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

> **Async Testing:** Await Vue update queue and async work.
