# Typing Emits

## What / Why

Type event names and payload tuples.

## Mental Model

```text
defineEmits<{save:[id:string]}>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Typing Emits
</script>

<template>
  <div>Typing Emits</div>
</template>
```

## When to Use

Use for component contract safety.

## Common Mistake / Interview Trap

Avoid untyped string payload conventions.

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

> **Typing Emits:** Type event names and payload tuples.
