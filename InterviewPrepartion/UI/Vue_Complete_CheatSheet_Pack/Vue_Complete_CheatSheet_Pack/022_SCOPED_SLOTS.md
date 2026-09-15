# Scoped Slots

## What / Why

Child exposes data to slot content.

## Mental Model

```text
<slot :item='item'/>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Scoped Slots
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for render customization.

## Common Mistake / Interview Trap

Can create tight contracts if too much internal state is exposed.

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

> **Scoped Slots:** Child exposes data to slot content.
