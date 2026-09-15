# nextTick

## What / Why

Waits until pending DOM updates flush.

## Mental Model

```text
await nextTick()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: nextTick
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when DOM must reflect state before measurement.

## Common Mistake / Interview Trap

Do not use as a generic async delay.

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

> **nextTick:** Waits until pending DOM updates flush.
