# KeepAlive Stale Data

## What / Why

Cached component retains state when route returns.

## Mental Model

```text
activated/deactivated/refetch policy
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: KeepAlive Stale Data
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use lifecycle deliberately.

## Common Mistake / Interview Trap

KeepAlive means not remounted.

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

> **KeepAlive Stale Data:** Cached component retains state when route returns.
