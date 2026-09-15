# Race Cancellation

## What / Why

Cancel/ignore previous request when input changes.

## Mental Model

```text
watch(id, async ... cleanup abort)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Race Cancellation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in search/details workflows.

## Common Mistake / Interview Trap

Stale response overwriting new state is common.

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

> **Race Cancellation:** Cancel/ignore previous request when input changes.
