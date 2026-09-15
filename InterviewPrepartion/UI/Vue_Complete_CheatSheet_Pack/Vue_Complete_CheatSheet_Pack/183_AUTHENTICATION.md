# Authentication

## What / Why

Vue app integrates identity/session/token lifecycle.

## Mental Model

```text
IdP → Vue → API
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Authentication
</script>

<template>
  <div>Authentication</div>
</template>
```

## When to Use

Use router UX and API layer.

## Common Mistake / Interview Trap

Frontend auth state is not final security enforcement.

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

> **Authentication:** Vue app integrates identity/session/token lifecycle.
