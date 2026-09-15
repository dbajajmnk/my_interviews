# Memory Leak

## What / Why

External listeners/timers/websockets/store subscriptions outlive scope.

## Mental Model

```text
cleanup
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Memory Leak
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use onScopeDispose/onUnmounted.

## Common Mistake / Interview Trap

Not every external resource auto-cleans.

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

> **Memory Leak:** External listeners/timers/websockets/store subscriptions outlive scope.
