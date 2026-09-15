# Design System

## What / Why

Use components, tokens and headless primitives consistently.

## Mental Model

```text
tokens → primitives → domain UI
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Design System
</script>

<template>
  <div>Design System</div>
</template>
```

## When to Use

Use governed shared UI.

## Common Mistake / Interview Trap

Do not put domain business logic into design system.

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

> **Design System:** Use components, tokens and headless primitives consistently.
