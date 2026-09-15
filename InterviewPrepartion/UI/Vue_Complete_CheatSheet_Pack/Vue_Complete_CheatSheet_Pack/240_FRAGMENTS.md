# Fragments

## What / Why

Vue 3 supports multiple root nodes.

## Mental Model

```text
multiple roots
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Fragments
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when semantic wrapper unnecessary.

## Common Mistake / Interview Trap

Fallthrough attrs need explicit handling with multiple roots.

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

> **Fragments:** Vue 3 supports multiple root nodes.
