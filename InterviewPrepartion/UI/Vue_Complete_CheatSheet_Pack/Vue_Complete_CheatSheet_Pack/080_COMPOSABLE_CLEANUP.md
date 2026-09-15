# Composable Cleanup

## What / Why

Register teardown with onScopeDispose/onUnmounted.

## Mental Model

```text
setup resource → cleanup
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Composable Cleanup
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for subscriptions/listeners.

## Common Mistake / Interview Trap

Leaking browser listeners is a common composable bug.

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

> **Composable Cleanup:** Register teardown with onScopeDispose/onUnmounted.
