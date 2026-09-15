# script setup

## What / Why

Compile-time SFC syntax that exposes top-level bindings to template automatically.

## Mental Model

```text
<script setup> ... </script>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: script setup
</script>

<template>
  <div>script setup</div>
</template>
```

## When to Use

Use as the modern default for Vue 3 SFCs.

## Common Mistake / Interview Trap

It has compile-time macros; not every identifier is a runtime API.

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

> **script setup:** Compile-time SFC syntax that exposes top-level bindings to template automatically.
