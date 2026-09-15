# Factory Composable

## What / Why

Creates isolated state per invocation.

## Mental Model

```text
function useCounter(){const n=ref(0)...}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Factory Composable
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for instance-local reusable logic.

## Common Mistake / Interview Trap

Do not expect different callers to share state.

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

> **Factory Composable:** Creates isolated state per invocation.
