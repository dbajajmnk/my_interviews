# watch

## What / Why

Runs callback when explicit reactive source changes.

## Mental Model

```text
watch(source,cb)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: watch
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for async side effects or comparing old/new values.

## Common Mistake / Interview Trap

Do not use watch for simple derived state.

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

> **watch:** Runs callback when explicit reactive source changes.
