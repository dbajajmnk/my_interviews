# Lifted State

## What / Why

Move shared state to common owner.

## Mental Model

```text
parent → props/emits
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Lifted State
</script>

<template>
  <div>Lifted State</div>
</template>
```

## When to Use

Use for nearby sibling coordination.

## Common Mistake / Interview Trap

Deep prop drilling can justify provide/inject/store.

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

> **Lifted State:** Move shared state to common owner.
