# Container Presentational

## What / Why

Separate orchestration/data from reusable presentational UI when useful.

## Mental Model

```text
feature container → UI component
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Container Presentational
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use selectively.

## Common Mistake / Interview Trap

Composition API reduces need for rigid pattern everywhere.

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

> **Container Presentational:** Separate orchestration/data from reusable presentational UI when useful.
