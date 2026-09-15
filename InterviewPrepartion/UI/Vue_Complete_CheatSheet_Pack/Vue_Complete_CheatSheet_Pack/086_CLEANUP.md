# Cleanup

## What / Why

Use onScopeDispose/onUnmounted/watch cleanup.

## Mental Model

```text
setup → resource → cleanup
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Cleanup
</script>

<template>
  <div>Cleanup</div>
</template>
```

## When to Use

Every external resource needs lifecycle ownership.

## Common Mistake / Interview Trap

Composable leaks are still memory leaks.

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

> **Cleanup:** Use onScopeDispose/onUnmounted/watch cleanup.
