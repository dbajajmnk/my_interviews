# Watcher Fetching

## What / Why

Watch reactive parameter and fetch on change.

## Mental Model

```text
watch(id,fetchUser,{immediate:true})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Watcher Fetching
</script>

<template>
  <div>Watcher Fetching</div>
</template>
```

## When to Use

Use for client-driven parameterized requests.

## Common Mistake / Interview Trap

Use cleanup to prevent stale responses.

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

> **Watcher Fetching:** Watch reactive parameter and fetch on change.
