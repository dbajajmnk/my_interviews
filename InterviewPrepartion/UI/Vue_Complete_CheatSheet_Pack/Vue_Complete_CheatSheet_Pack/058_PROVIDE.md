# provide

## What / Why

Provides a value to descendants without prop drilling.

## Mental Model

```text
provide(key,value)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: provide
</script>

<template>
  <div>provide</div>
</template>
```

## When to Use

Use for plugin/context-style dependencies.

## Common Mistake / Interview Trap

Avoid using provide/inject as hidden global state.

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

> **provide:** Provides a value to descendants without prop drilling.
