# computed vs watch

## What / Why

computed derives value; watch performs side effect.

## Mental Model

```text
derived vs side effect
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: computed vs watch
</script>

<template>
  <div>computed vs watch</div>
</template>
```

## When to Use

Use computed whenever result is just another value.

## Common Mistake / Interview Trap

Using watch to maintain duplicated derived state is a smell.

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

> **computed vs watch:** computed derives value; watch performs side effect.
