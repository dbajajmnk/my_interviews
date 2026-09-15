# SSR State Isolation

## What / Why

Create app/router/store per request.

## Mental Model

```text
request → fresh instances
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: SSR State Isolation
</script>

<template>
  <div>SSR State Isolation</div>
</template>
```

## When to Use

Required for multi-user SSR.

## Common Mistake / Interview Trap

Module-level singleton state can leak user data.

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

> **SSR State Isolation:** Create app/router/store per request.
