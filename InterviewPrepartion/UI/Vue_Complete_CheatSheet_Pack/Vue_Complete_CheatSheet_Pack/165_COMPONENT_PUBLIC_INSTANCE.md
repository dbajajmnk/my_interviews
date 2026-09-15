# Component Public Instance

## What / Why

Type exposed component APIs deliberately.

## Mental Model

```text
ComponentExposed / instance type patterns
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Component Public Instance
</script>

<template>
  <div>Component Public Instance</div>
</template>
```

## When to Use

Use for template refs/library APIs.

## Common Mistake / Interview Trap

Prefer small imperative surfaces.

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

> **Component Public Instance:** Type exposed component APIs deliberately.
