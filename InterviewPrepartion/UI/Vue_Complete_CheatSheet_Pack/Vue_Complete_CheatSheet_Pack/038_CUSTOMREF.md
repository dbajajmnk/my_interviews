# customRef

## What / Why

Creates custom dependency tracking/trigger behavior.

## Mental Model

```text
customRef((track,trigger)=>...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: customRef
</script>

<template>
  <div>customRef</div>
</template>
```

## When to Use

Use for debounce or specialized reactivity.

## Common Mistake / Interview Trap

Easy to create surprising update semantics.

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

> **customRef:** Creates custom dependency tracking/trigger behavior.
