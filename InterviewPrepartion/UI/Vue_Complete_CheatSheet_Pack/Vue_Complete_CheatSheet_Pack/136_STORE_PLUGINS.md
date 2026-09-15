# Store Plugins

## What / Why

Extend stores with cross-cutting behavior.

## Mental Model

```text
pinia.use(plugin)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Store Plugins
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for persistence/telemetry carefully.

## Common Mistake / Interview Trap

Plugins can create hidden behavior.

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

> **Store Plugins:** Extend stores with cross-cutting behavior.
