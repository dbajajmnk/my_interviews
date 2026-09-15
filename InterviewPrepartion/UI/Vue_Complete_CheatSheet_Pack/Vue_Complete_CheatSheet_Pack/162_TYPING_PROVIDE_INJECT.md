# Typing provide inject

## What / Why

Use InjectionKey<T>.

## Mental Model

```text
const key:InjectionKey<Service>=Symbol()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Typing provide inject
</script>

<template>
  <div>Typing provide inject</div>
</template>
```

## When to Use

Use for app/library context.

## Common Mistake / Interview Trap

Plain strings lose strong typing.

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

> **Typing provide inject:** Use InjectionKey<T>.
