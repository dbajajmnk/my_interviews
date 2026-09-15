# TransitionGroup

## What / Why

Animates list insert/remove/move.

## Mental Model

```text
<TransitionGroup>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: TransitionGroup
</script>

<template>
  <div>TransitionGroup</div>
</template>
```

## When to Use

Use for keyed animated lists.

## Common Mistake / Interview Trap

Stable keys are mandatory.

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

> **TransitionGroup:** Animates list insert/remove/move.
