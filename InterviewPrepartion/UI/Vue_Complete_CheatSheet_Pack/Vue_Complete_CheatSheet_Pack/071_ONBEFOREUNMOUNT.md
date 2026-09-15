# onBeforeUnmount

## What / Why

Runs before instance unmount.

## Mental Model

```text
beforeUnmount
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onBeforeUnmount
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for final cleanup sequencing.

## Common Mistake / Interview Trap

Prefer composable/scoped cleanup where possible.

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

> **onBeforeUnmount:** Runs before instance unmount.
