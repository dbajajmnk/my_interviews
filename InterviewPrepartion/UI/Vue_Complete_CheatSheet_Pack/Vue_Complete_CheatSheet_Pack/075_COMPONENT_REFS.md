# Component Refs

## What / Why

Template ref can access component public instance/exposed API.

## Mental Model

```text
child.value?.focus()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Component Refs
</script>

<template>
  <div>Component Refs</div>
</template>
```

## When to Use

Use for imperative component handles.

## Common Mistake / Interview Trap

Prefer props/emits for normal communication.

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

> **Component Refs:** Template ref can access component public instance/exposed API.
