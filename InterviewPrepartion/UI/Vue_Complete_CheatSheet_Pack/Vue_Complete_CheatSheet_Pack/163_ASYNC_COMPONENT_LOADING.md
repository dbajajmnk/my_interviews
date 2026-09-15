# Async Component Loading

## What / Why

defineAsyncComponent lazy-loads widgets/features.

## Mental Model

```text
loader → chunk
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Async Component Loading
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for non-critical heavy components.

## Common Mistake / Interview Trap

Provide loading/error experience.

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

> **Async Component Loading:** defineAsyncComponent lazy-loads widgets/features.
