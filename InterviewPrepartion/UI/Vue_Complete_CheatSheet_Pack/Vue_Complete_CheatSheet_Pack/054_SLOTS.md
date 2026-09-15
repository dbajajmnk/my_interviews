# Slots

## What / Why

Caller provides content to child layout/component.

## Mental Model

```text
<slot/>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Slots
</script>

<template>
  <div>Slots</div>
</template>
```

## When to Use

Use for composition and reusable containers.

## Common Mistake / Interview Trap

Slots are content contracts; don't overcouple to internal markup.

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

> **Slots:** Caller provides content to child layout/component.
