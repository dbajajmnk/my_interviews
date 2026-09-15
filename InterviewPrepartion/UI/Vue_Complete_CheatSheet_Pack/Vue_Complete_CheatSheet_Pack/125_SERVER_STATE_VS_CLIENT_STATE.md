# Server State vs Client State

## What / Why

Remote authoritative data has fetching/cache/revalidation lifecycle distinct from UI state.

## Mental Model

```text
server data ≠ Pinia-by-default
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Server State vs Client State
</script>

<template>
  <div>Server State vs Client State</div>
</template>
```

## When to Use

Use query/framework caches when appropriate.

## Common Mistake / Interview Trap

Do not mirror every response into a global store.

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

> **Server State vs Client State:** Remote authoritative data has fetching/cache/revalidation lifecycle distinct from UI state.
