# Preview Build

## What / Why

Vite preview serves built assets locally.

## Mental Model

```text
npm run preview
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Preview Build
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for smoke testing production output.

## Common Mistake / Interview Trap

Not intended as hardened production server.

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

> **Preview Build:** Vite preview serves built assets locally.
