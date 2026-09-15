# Return Refs

## What / Why

Return refs or a reactive object while preserving destructuring semantics.

## Mental Model

```text
return {x,y}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Return Refs
</script>

<template>
  <div>Return Refs</div>
</template>
```

## When to Use

Use explicit APIs.

## Common Mistake / Interview Trap

Returning a reactive object then destructuring can lose reactivity.

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

> **Return Refs:** Return refs or a reactive object while preserving destructuring semantics.
