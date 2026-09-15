# Discriminated Union Props

## What / Why

Model mutually exclusive component modes.

## Mental Model

```text
type Props=A|B
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Discriminated Union Props
</script>

<template>
  <div>Discriminated Union Props</div>
</template>
```

## When to Use

Use for robust APIs.

## Common Mistake / Interview Trap

Avoid dozens of optional props.

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

> **Discriminated Union Props:** Model mutually exclusive component modes.
