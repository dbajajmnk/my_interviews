# Facade

## What / Why

Provides feature-friendly surface over stores/router/API.

## Mental Model

```text
component → facade → Pinia/API
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Facade
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to isolate infrastructure and simplify components.

## Common Mistake / Interview Trap

A facade that merely renames every method adds noise.

## Production Questions

```text
Who owns this state?
Is this local state, server state, URL state, or store state?
Is cleanup required?
What happens during SSR/hydration?
Can this be lazy-loaded?
How is this typed and tested?
What happens on slow network/error?
```

## 20-Second Recall

> **Facade:** Provides feature-friendly surface over stores/router/API.
