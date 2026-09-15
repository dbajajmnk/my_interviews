# Frontend Authorization

## What / Why

Route/UI checks are UX only.

## Mental Model

```text
canEdit → button
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Frontend Authorization
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use backend as final authorization authority.

## Common Mistake / Interview Trap

Navigation guards cannot secure APIs.

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

> **Frontend Authorization:** Route/UI checks are UX only.
