# Naming Convention

## What / Why

Composable names conventionally begin with `use`.

## Mental Model

```text
useMouse/useAuth/useOrders
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Naming Convention
</script>

<template>
  <div>Naming Convention</div>
</template>
```

## When to Use

Use for discoverability and tooling expectations.

## Common Mistake / Interview Trap

Naming alone doesn't make ordinary utility reactive.

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

> **Naming Convention:** Composable names conventionally begin with `use`.
