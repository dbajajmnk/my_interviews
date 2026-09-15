# Focus Management

## What / Why

Manage focus for modals/routes/dynamic content.

## Mental Model

```text
template ref + focus
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Focus Management
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use accessible dialog/router patterns.

## Common Mistake / Interview Trap

Do not unexpectedly steal focus.

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

> **Focus Management:** Manage focus for modals/routes/dynamic content.
