# shallowRef

## What / Why

Tracks replacement of `.value` without deeply proxying nested data.

## Mental Model

```text
const chart = shallowRef(instance)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: shallowRef
</script>

<template>
  <div>shallowRef</div>
</template>
```

## When to Use

Use for large immutable data or external class instances.

## Common Mistake / Interview Trap

Nested mutations do not trigger updates unless value is replaced/triggered.

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

> **shallowRef:** Tracks replacement of `.value` without deeply proxying nested data.
