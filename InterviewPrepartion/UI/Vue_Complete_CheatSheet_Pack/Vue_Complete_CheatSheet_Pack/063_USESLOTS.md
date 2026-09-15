# useSlots

## What / Why

Accesses slots programmatically.

## Mental Model

```text
useSlots()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: useSlots
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in render/advanced component logic.

## Common Mistake / Interview Trap

Prefer declarative slots in normal templates.

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

> **useSlots:** Accesses slots programmatically.
