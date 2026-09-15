# watchEffect

## What / Why

Automatically tracks dependencies used synchronously in callback.

## Mental Model

```text
watchEffect(()=>console.log(count.value))
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: watchEffect
</script>

<template>
  <div>watchEffect</div>
</template>
```

## When to Use

Use for concise reactive side effects.

## Common Mistake / Interview Trap

Implicit dependencies can reduce readability in complex logic.

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

> **watchEffect:** Automatically tracks dependencies used synchronously in callback.
