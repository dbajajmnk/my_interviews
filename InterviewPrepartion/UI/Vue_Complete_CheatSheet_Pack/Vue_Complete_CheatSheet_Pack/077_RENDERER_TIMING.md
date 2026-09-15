# Renderer Timing

## What / Why

Vue batches reactive updates into async DOM flush.

## Mental Model

```text
mutate state → queue → patch
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Renderer Timing
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use nextTick only when post-patch access is truly needed.

## Common Mistake / Interview Trap

Multiple synchronous mutations normally batch.

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

> **Renderer Timing:** Vue batches reactive updates into async DOM flush.
