# Routes

## What / Why

Map paths to components and metadata.

## Mental Model

```text
{path:'/users/:id',component:User}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Routes
</script>

<template>
  <div>Routes</div>
</template>
```

## When to Use

Organize by feature boundaries.

## Common Mistake / Interview Trap

Avoid giant unstructured route tables.

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

> **Routes:** Map paths to components and metadata.
