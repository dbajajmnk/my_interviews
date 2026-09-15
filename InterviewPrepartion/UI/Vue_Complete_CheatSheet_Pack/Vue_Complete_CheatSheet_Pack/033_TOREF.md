# toRef

## What / Why

Creates a ref linked to a property/source.

## Mental Model

```text
toRef(props,'foo')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: toRef
</script>

<template>
  <div>toRef</div>
</template>
```

## When to Use

Use to preserve reactivity when passing a property around.

## Common Mistake / Interview Trap

Do not mutate readonly prop refs.

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

> **toRef:** Creates a ref linked to a property/source.
