# TransitionGroup Moves

## What / Why

Vue applies move transitions to keyed list reordering.

## Mental Model

```text
v-move
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: TransitionGroup Moves
</script>

<template>
  <div>TransitionGroup Moves</div>
</template>
```

## When to Use

Use for sortable animated lists.

## Common Mistake / Interview Trap

Keys must represent stable identity.

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

> **TransitionGroup Moves:** Vue applies move transitions to keyed list reordering.
