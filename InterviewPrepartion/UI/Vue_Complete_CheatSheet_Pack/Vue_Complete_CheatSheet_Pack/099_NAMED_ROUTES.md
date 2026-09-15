# Named Routes

## What / Why

Navigate by route name + params.

## Mental Model

```text
router.push({name:'user',params:{id}})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Named Routes
</script>

<template>
  <div>Named Routes</div>
</template>
```

## When to Use

Use to decouple callers from path strings.

## Common Mistake / Interview Trap

Names must remain unique.

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

> **Named Routes:** Navigate by route name + params.
