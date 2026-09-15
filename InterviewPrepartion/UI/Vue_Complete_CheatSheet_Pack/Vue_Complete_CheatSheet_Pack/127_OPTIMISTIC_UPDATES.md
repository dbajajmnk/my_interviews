# Optimistic Updates

## What / Why

Update UI before server confirmation and reconcile failure.

## Mental Model

```text
optimistic state → request → rollback/reconcile
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Optimistic Updates
</script>

<template>
  <div>Optimistic Updates</div>
</template>
```

## When to Use

Use for reversible common-success mutations.

## Common Mistake / Interview Trap

Avoid for irreversible/high-risk actions without safeguards.

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

> **Optimistic Updates:** Update UI before server confirmation and reconcile failure.
