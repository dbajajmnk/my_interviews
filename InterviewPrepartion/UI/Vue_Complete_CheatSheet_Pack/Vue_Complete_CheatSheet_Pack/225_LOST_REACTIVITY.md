# Lost Reactivity

## What / Why

Destructuring reactive object/property without ref-aware helper/compiler support.

## Mental Model

```text
const {x}=reactiveObj
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Lost Reactivity
</script>

<template>
  <div>Lost Reactivity</div>
</template>
```

## When to Use

Use toRefs/toRef or direct access.

## Common Mistake / Interview Trap

Vue 3.5 reactive props destructure is a special compiler-supported case.

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

> **Lost Reactivity:** Destructuring reactive object/property without ref-aware helper/compiler support.
