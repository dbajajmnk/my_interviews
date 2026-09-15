# Scoped Slots

## What / Why

Child exposes data to slot content.

## Mental Model

```text
<slot :item='item'/>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Scoped Slots
</script>

<template>
  <div>Scoped Slots</div>
</template>
```

## When to Use

Use for headless/reusable behaviors.

## Common Mistake / Interview Trap

Remember scope belongs to parent template.

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

> **Scoped Slots:** Child exposes data to slot content.
