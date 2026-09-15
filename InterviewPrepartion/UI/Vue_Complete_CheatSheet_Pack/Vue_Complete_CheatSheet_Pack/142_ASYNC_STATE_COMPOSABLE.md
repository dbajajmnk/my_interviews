# Async State Composable

## What / Why

Encapsulates data/loading/error lifecycle.

## Mental Model

```text
useAsyncData-like composable
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Async State Composable
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for reusable client fetching.

## Common Mistake / Interview Trap

Avoid hand-rolling if framework/query solution is stronger.

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

> **Async State Composable:** Encapsulates data/loading/error lifecycle.
