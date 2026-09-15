# KeepAlive

## What / Why

Caches inactive component instances instead of unmounting.

## Mental Model

```text
dynamic view → cached instance
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: KeepAlive
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for tabs/routes needing preserved state.

## Common Mistake / Interview Trap

Cached components still consume memory.

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

> **KeepAlive:** Caches inactive component instances instead of unmounting.
