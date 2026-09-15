# Duplicate HTTP

## What / Why

Composable/component called multiple times or multiple subscriptions/watchers trigger same request.

## Mental Model

```text
ownership/caching
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Duplicate HTTP
</script>

<template>
  <div>Duplicate HTTP</div>
</template>
```

## When to Use

Centralize server state or dedupe.

## Common Mistake / Interview Trap

Vue itself does not automatically cache fetches.

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

> **Duplicate HTTP:** Composable/component called multiple times or multiple subscriptions/watchers trigger same request.
