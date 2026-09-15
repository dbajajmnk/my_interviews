# Local Component State

## What / Why

Use ref/reactive inside component/composable.

## Mental Model

```text
ref/reactive
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Local Component State
</script>

<template>
  <div>Local Component State</div>
</template>
```

## When to Use

Default for local interaction state.

## Common Mistake / Interview Trap

Do not globalize state prematurely.

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

> **Local Component State:** Use ref/reactive inside component/composable.
