# Pinia Actions

## What / Why

Methods that mutate state and may be async.

## Mental Model

```text
store.save()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Actions
</script>

<template>
  <div>Pinia Actions</div>
</template>
```

## When to Use

Use for business-intent state transitions.

## Common Mistake / Interview Trap

Keep API/domain boundaries clear.

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

> **Pinia Actions:** Methods that mutate state and may be async.
