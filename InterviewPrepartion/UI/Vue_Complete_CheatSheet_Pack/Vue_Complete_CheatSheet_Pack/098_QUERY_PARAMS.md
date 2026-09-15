# Query Params

## What / Why

Shareable filter/navigation state.

## Mental Model

```text
route.query.page
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Query Params
</script>

<template>
  <div>Query Params</div>
</template>
```

## When to Use

Use for search/filter/page.

## Common Mistake / Interview Trap

Do not store secrets.

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

> **Query Params:** Shareable filter/navigation state.
