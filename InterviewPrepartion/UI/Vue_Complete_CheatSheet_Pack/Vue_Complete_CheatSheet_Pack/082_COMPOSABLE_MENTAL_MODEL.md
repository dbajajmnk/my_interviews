# Composable Mental Model

## What / Why

A composable is a function using Composition API to encapsulate reusable stateful logic.

## Mental Model

```text
useX() → refs/computed/actions
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Composable Mental Model
</script>

<template>
  <div>Composable Mental Model</div>
</template>
```

## When to Use

Use for logic reuse across components.

## Common Mistake / Interview Trap

Each invocation usually gets its own local state unless state is declared at module scope.

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

> **Composable Mental Model:** A composable is a function using Composition API to encapsulate reusable stateful logic.
