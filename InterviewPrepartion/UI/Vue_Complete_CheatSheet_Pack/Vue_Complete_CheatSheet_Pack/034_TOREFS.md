# toRefs

## What / Why

Converts reactive object properties to linked refs.

## Mental Model

```text
const {x,y}=toRefs(state)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: toRefs
</script>

<template>
  <div>toRefs</div>
</template>
```

## When to Use

Use when destructuring reactive objects.

## Common Mistake / Interview Trap

Adds ceremony; script setup/compiler conveniences may reduce need.

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

> **toRefs:** Converts reactive object properties to linked refs.
